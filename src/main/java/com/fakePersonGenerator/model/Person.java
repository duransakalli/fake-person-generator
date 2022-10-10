package com.fakePersonGenerator.model;

import com.github.javafaker.Faker;
import lombok.Data;

@Data
public class Person {

    private Integer id;
    private String prefix;
    private String firstName;
    private String lastName;
    private String title;
    private String userName;
    private String phoneNumber;
    private Address address;

    public Person() {
        Faker fake = new Faker();
        this.id = fake.hashCode();
        this.prefix = fake.name().prefix();
        this.firstName = fake.name().firstName();
        this.lastName = fake.name().lastName();
        this.title = fake.name().title();
        this.userName = lastName.toLowerCase()+"."+firstName.toLowerCase();
        this.phoneNumber = fake.phoneNumber().cellPhone();
        this.address = new Address();

    }

}
