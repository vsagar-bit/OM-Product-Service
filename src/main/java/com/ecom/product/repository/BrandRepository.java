package com.ecom.product.repository;

import com.ecom.product.model.Brand;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface BrandRepository extends ReactiveMongoRepository<Brand,Long> {
}
