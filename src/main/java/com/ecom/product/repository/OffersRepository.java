package com.ecom.product.repository;

import com.ecom.product.model.Offers;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface OffersRepository extends ReactiveMongoRepository<Offers,Long> {
}
