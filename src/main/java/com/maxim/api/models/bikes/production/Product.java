package com.maxim.api.models.bikes.production;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="products")
public class Product {
    @Id
    @Column
    private int productId;
    @Column
    private int productName;
    @Column
    private int brandId;
    @Column
    private int categoryId;
    @Column
    private int modelYear;
    @Column
    private int lastPrice;

    public Product() {
    }

    public Product(int productId, int productName, int brandId, int categoryId, int modelYear, int lastPrice) {
        this.productId = productId;
        this.productName = productName;
        this.brandId = brandId;
        this.categoryId = categoryId;
        this.modelYear = modelYear;
        this.lastPrice = lastPrice;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductName() {
        return productName;
    }

    public void setProductName(int productName) {
        this.productName = productName;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public int getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(int lastPrice) {
        this.lastPrice = lastPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName=" + productName +
                ", brandId=" + brandId +
                ", categoryId=" + categoryId +
                ", modelYear=" + modelYear +
                ", lastPrice=" + lastPrice +
                '}';
    }
}
