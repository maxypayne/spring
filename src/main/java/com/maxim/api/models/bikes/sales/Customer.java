package com.maxim.api.models.bikes.sales;

import jakarta.persistence.*;

@Entity()
@Table(name = "customers")
public class Customer {
    @Id
    @Column(name="customer_id")
    private  int customer_id;
    @Column(name="firstName")
    private String firstName;
    @Column(name="lastName")
    private String lastName;
    @Column(name="phone")
    private String phone;
    @Column(name="email")
    private  int email;
    @Column(name="street")
    private  int street;
    @Column(name="city")
    private  int city;
    @Column(name="state")
    private  int state;
    @Column(name="zip_code")
    private  int zip_code;
    public Customer() {};

    public Customer(int customer_id, String firstName, String lastName, String phone, int email, int street, int city, int state, int zip_code) {
        this.customer_id = customer_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip_code = zip_code;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public int getEmail() {
        return email;
    }

    public int getStreet() {
        return street;
    }

    public int getCity() {
        return city;
    }

    public int getState() {
        return state;
    }

    public int getZip_code() {
        return zip_code;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(int email) {
        this.email = email;
    }

    public void setStreet(int street) {
        this.street = street;
    }

    public void setCity(int city) {
        this.city = city;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setZip_code(int zip_code) {
        this.zip_code = zip_code;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_id=" + customer_id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", email=" + email +
                ", street=" + street +
                ", city=" + city +
                ", state=" + state +
                ", zip_code=" + zip_code +
                '}';
    }
}
