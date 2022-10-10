package com.fakePersonGenerator;

import com.fakePersonGenerator.model.Person;
import com.github.javafaker.Address;
import com.github.javafaker.Faker;
import org.apache.commons.lang3.ArrayUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FakePersonGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(FakePersonGeneratorApplication.class, args);

	}

}
