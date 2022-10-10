package com.fakePersonGenerator.model;

import com.github.javafaker.Faker;
import lombok.Data;

@Data
public class Address {

    private String buildingNumber;
    private String streetName;
    private String city;
    private String state;
    private String zipCode;

    public Address() {
        Faker fake = new Faker();
        this.buildingNumber = fake.address().buildingNumber();
        this.streetName = fake.address().streetName();
        this.city = fake.address().city();
        this.state = fake.address().state();
        this.zipCode = fake.address().zipCode();
    }



}
