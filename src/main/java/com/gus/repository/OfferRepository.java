package com.gus.repository;

import com.gus.domain.Offer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfferRepository extends CrudRepository <Offer, Long>{
}
