package com.ecom.product.service;

import com.ecom.product.model.*;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductService {

    Mono<ProductCategories> createProductCategory(ProductCategories productCategories);
    Mono<ResponseEntity<ProductCategories>> getProductCategory(Long id);
    Flux<ProductCategories> listOfProdctCategories();
    Mono<Product> createProduct(Product product);
    Mono<ResponseEntity<Product>> getProduct(Long id);
    Flux<Product> listOfProducts();
    Mono<ProductType> createProductTypes(ProductType productType);
    Mono<ResponseEntity<ProductType>> getProductType(Long id);
    Flux<ProductType> listOfProductType();
    Mono<Brand> createBrand(Brand brand);
    Mono<ResponseEntity<Brand>> getBrand(Long id);
    Flux<Brand> listOfBrand();
    Mono<Offers> createOffer(Offers offers);
    Mono<ResponseEntity<Offers>> getOffer(Long id);
    Flux<Offers> listOfOffer();
}
