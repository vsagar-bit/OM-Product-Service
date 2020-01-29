package com.ecom.product.repository;

import com.ecom.product.model.ProductCategories;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductCategoriesRepository extends ReactiveMongoRepository<ProductCategories,Long> {
}
