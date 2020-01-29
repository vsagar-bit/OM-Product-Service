package com.ecom.product.dto;

public class ProductDTO {

    private Long productId;
    private String name;
    private Long purchasePrice;
    private Long salePrice;
    private Long brandId;
    private Long productTypeId;
    private Long quantity;
    private String description;
    private Long ratingId;
    private String imagePath;
    public Long getProductId() {
        return productId;
    }
    public void setProductId(Long productId) {
        this.productId = productId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getPurchasePrice() {
        return purchasePrice;
    }
    public void setPurchasePrice(Long purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
    public Long getSalePrice() {
        return salePrice;
    }
    public void setSalePrice(Long salePrice) {
        this.salePrice = salePrice;
    }
    public Long getBrandId() {
        return brandId;
    }
    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }
    public Long getProductTypeId() {
        return productTypeId;
    }
    public void setProductTypeId(Long productTypeId) {
        this.productTypeId = productTypeId;
    }
    public Long getQuantity() {
        return quantity;
    }
    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Long getRatingId() {
        return ratingId;
    }
    public void setRatingId(Long ratingId) {
        this.ratingId = ratingId;
    }
    public String getImagePath() {
        return imagePath;
    }
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

}
