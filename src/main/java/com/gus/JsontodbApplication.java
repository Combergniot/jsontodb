package com.gus;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gus.domain.Offer;
import com.gus.service.OfferService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class JsontodbApplication {


	public static void main(String[] args) {
		SpringApplication.run(JsontodbApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(OfferService offerService){
	    return args -> {
			// read JSON and load json

			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Offer>> typeReference = new TypeReference<List<Offer>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/300118part7.json");
			try {
				List<Offer> offers = mapper.readValue(inputStream,typeReference);
				offerService.save(offers);
				System.out.println("Offers Saved!");
				} catch (IOException e){
				System.out.println("Unable to save offers: " + e.getMessage());
			}
			inputStream.close();
	    };
	}

}
