package com.ecom.product.service;

import com.ecom.product.model.*;
import com.ecom.product.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductCategoriesRepository productCategoriesRepository;

    @Autowired
    ProductTypeRepository productTypeRepository;

    @Autowired
    BrandRepository brandRepository;

    @Autowired
    OffersRepository offersRepository;


    @Override
    public Mono<ProductCategories> createProductCategory(ProductCategories productCategories) {
        return productCategoriesRepository.save(productCategories);
    }

    @Override
    public Flux<ProductCategories> listOfProdctCategories() {
        return productCategoriesRepository.findAll();
    }

    @Override
    public Mono<Product> createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Flux<Product> listOfProducts() {
        return productRepository.findAll();
    }

    @Override
    public Mono<ProductType> createProductTypes(ProductType productType) {
        return productTypeRepository.save(productType);
    }

    @Override
    public Mono<Brand> createBrand(Brand brand) {
        return brandRepository.save(brand);
    }

    @Override
    public Mono<Offers> createOffer(Offers offers) {
        return offersRepository.save(offers);
    }

    @Override
    public Mono<ResponseEntity<ProductCategories>> getProductCategory(Long id) {
        return productCategoriesRepository.findById(id).
                map(existCat-> ResponseEntity.ok().body(existCat))
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @Override
    public Mono<ResponseEntity<Product>> getProduct(Long id) {
        return productRepository.findById(id).map(existProd->ResponseEntity.ok(existProd)).
                defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @Override
    public Mono<ResponseEntity<ProductType>> getProductType(Long id) {
        return productTypeRepository.findById(id).map(existPrdType->ResponseEntity.ok(existPrdType)).
                defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @Override
    public Mono<ResponseEntity<Brand>> getBrand(Long id) {
        return brandRepository.findById(id).map(existBrand->ResponseEntity.ok(existBrand)).
                defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @Override
    public Mono<ResponseEntity<Offers>> getOffer(Long id) {
        return offersRepository.findById(id).map(existOfr->ResponseEntity.ok(existOfr))
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @Override
    public Flux<ProductType> listOfProductType() {
        return productTypeRepository.findAll();
    }

    @Override
    public Flux<Brand> listOfBrand() {
        return brandRepository.findAll();
    }

    @Override
    public Flux<Offers> listOfOffer() {
        return offersRepository.findAll();
    }
}
