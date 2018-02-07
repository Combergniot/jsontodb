package com.gus.service;

import com.gus.domain.Offer;
import com.gus.repository.OfferRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfferService {

    private OfferRepository offerRepository;

    public OfferService (OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    public Iterable<Offer> list() {
        return offerRepository.findAll();
    }

    public Offer save(Offer offer) {
        return offerRepository.save(offer);
    }

    public void save(List<Offer> offers) {
        offerRepository.save(offers);
    }
}

