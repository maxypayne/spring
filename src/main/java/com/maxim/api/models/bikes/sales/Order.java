package com.maxim.api.models.bikes.sales;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity()
@Table(name = "orders")
public class Order {
    @Id
    @Column(name="orderId")
    private int orderId;
    @Column(name="customerId")
    private int customerId;
    @Column(name="orderStatus")
    private String orderStatus;
    @Column(name="firstName")
    private String firstName;
    @Column(name="order_date")
    private String orderDate;
    @Column(name="requiredDate")
    private String requiredDate;
    @Column(name="shippedDate")
    private String shippedDate;
    @Column(name="storeId")
    private String storeId;
    @Column(name="staffId")
    private String staffId;

    private Order() {}

    public Order(int orderId, int customerId, String orderStatus, String firstName, String orderDate, String requiredDate, String shippedDate, String storeId, String staffId) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.orderStatus = orderStatus;
        this.firstName = firstName;
        this.orderDate = orderDate;
        this.requiredDate = requiredDate;
        this.shippedDate = shippedDate;
        this.storeId = storeId;
        this.staffId = staffId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getRequiredDate() {
        return requiredDate;
    }

    public void setRequiredDate(String requiredDate) {
        this.requiredDate = requiredDate;
    }

    public String getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(String shippedDate) {
        this.shippedDate = shippedDate;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customerId=" + customerId +
                ", orderStatus='" + orderStatus + '\'' +
                ", firstName='" + firstName + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", requiredDate='" + requiredDate + '\'' +
                ", shippedDate='" + shippedDate + '\'' +
                ", storeId='" + storeId + '\'' +
                ", staffId='" + staffId + '\'' +
                '}';
    }
}
