package com.infoshare.refactoring._3_exercise.data;

import java.math.BigDecimal;

public class Transaction {

    private String city;
    private String district;
    private String street;
    private String typeOfMarket;
    private BigDecimal price;

    public Transaction() {
    }

    public Transaction(String city, String district, String street, String typeOfMarket, BigDecimal price) {
        this.city = city;
        this.district = district;
        this.street = street;
        this.typeOfMarket = typeOfMarket;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", street='" + street + '\'' +
                ", typeOfMarket='" + typeOfMarket + '\'' +
                ", price=" + price +
                '}';
    }

    // ************GETTER AND SETTER***********

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTypeOfMarket() {
        return typeOfMarket;
    }

    public void setTypeOfMarket(String typeOfMarket) {
        this.typeOfMarket = typeOfMarket;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
