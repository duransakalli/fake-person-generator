package com.fakePersonGenerator.controller;

import com.fakePersonGenerator.model.Person;
import com.fakePersonGenerator.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService service;

    @GetMapping("/all")
    public List<Person> getAll() {
        return service.getAll();
    }

    @GetMapping("/get/{id}")
    public Person findById(@PathVariable int id) {
        return service.findById(id);
    }

    @PostMapping("/save")
    public Person save() {
        return service.save();
    }

    @PutMapping("/update/{id}")
    public Person update(@PathVariable int id) {
        return service.update(id);
    }

    @DeleteMapping("/delete/{id}")
    public Person delete(@PathVariable int id) {
        return service.delete(id);
    }

}
