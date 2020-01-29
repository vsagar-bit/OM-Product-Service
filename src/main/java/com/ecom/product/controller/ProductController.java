package com.ecom.product.controller;

import com.ecom.product.model.*;
import com.ecom.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/productMgmt")
public class ProductController {

    @Autowired
    ProductService productService;


    @PostMapping("/addProductCategories")
    public Mono<ProductCategories> addProductCategories(@RequestBody ProductCategories productCategories)
    {
        return productService.createProductCategory(productCategories);
    }

    @GetMapping("/getCategory/{id}")
    public Mono<ResponseEntity<ProductCategories>> getProductCategory(@PathVariable("id") Long id)
    {
        return productService.getProductCategory(id);
    }

    @GetMapping("/categoryList")
    public Flux<ProductCategories> categoryList()
    {
        return productService.listOfProdctCategories();
    }


    @PostMapping("/addProduct")
    public  Mono<Product> addProduct(@RequestBody Product product)
    {
        return productService.createProduct(product);
    }

    @GetMapping("/getProduct/{id}")
    public Mono<ResponseEntity<Product>> getProduct(@PathVariable("id") Long id)
    {
        return productService.getProduct(id);
    }

    @GetMapping("/productList")
    public Flux<Product> productList()
    {
        return productService.listOfProducts();
    }
    @PostMapping("/addProductType")
    public  Mono<ProductType> addProduct(@RequestBody ProductType productType)
    {
        return productService.createProductTypes(productType);
    }

    @GetMapping("/getProductType/{id}")
    public Mono<ResponseEntity<ProductType>> getProductType(@PathVariable("id") Long id)
    {
        return productService.getProductType(id);
    }

    @GetMapping("/prodTypeList")
    public Flux<ProductType> productTypeList()
    {
        return productService.listOfProductType();
    }

    @PostMapping("/addBrand")
    public Mono<Brand> addBrand(@RequestBody Brand brand)
    {
        return productService.createBrand(brand);
    }

    @GetMapping("/getBrand/{id}")
    public Mono<ResponseEntity<Brand>> getBrand(@PathVariable("id") Long id)
    {
        return productService.getBrand(id);
    }

    @GetMapping("/brandList")
    public Flux<Brand> brandList()
    {
        return productService.listOfBrand();
    }

    @PostMapping("/addOffer")
    public Mono<Offers> addOffer(@RequestBody Offers offers)
    {
        return productService.createOffer(offers);
    }

    @GetMapping("/getOffer/{id}")
    public  Mono<ResponseEntity<Offers>> getOffer(@PathVariable("id") Long id)
    {
        return productService.getOffer(id);
    }

    @GetMapping("/offerList")
    public Flux<Offers> offersList()
    {
        return productService.listOfOffer();
    }
}
