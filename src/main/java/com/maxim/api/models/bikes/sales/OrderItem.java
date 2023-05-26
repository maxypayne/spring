package com.maxim.api.models.bikes.sales;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity()
@Table(name = "order_items")
public class OrderItem {
    @Id
    @Column(name = "orderId")
    private int orderId;
    @Column(name = "itemId")
    private int itemId;
    @Column(name = "productId")
    private int productId;
    @Column(name = "quantity")
    private int quantity;

    @Column(name = "listPrice")
    private int listPrice;
    @Column(name = "discount")
    private int discount;

    public OrderItem() {}

    public int getOrderId() {
        return orderId;
    }

    public OrderItem(int orderId, int itemId, int productId, int quantity, int listPrice, int discount) {
        this.orderId = orderId;
        this.itemId = itemId;
        this.productId = productId;
        this.quantity = quantity;
        this.listPrice = listPrice;
        this.discount = discount;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getListPrice() {
        return listPrice;
    }

    public void setListPrice(int listPrice) {
        this.listPrice = listPrice;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Order_Item{" +
                "orderId=" + orderId +
                ", itemId=" + itemId +
                ", productId=" + productId +
                ", quantity=" + quantity +
                ", listPrice=" + listPrice +
                ", discount=" + discount +
                '}';
    }
}
