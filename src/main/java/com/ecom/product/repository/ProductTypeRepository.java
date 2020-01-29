package com.ecom.product.repository;

import com.ecom.product.model.ProductType;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductTypeRepository extends ReactiveMongoRepository<ProductType,Long> {
}
