package com.fakePersonGenerator.service;

import com.fakePersonGenerator.model.Person;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PersonService {

    private final Map<Integer, Person> db = new HashMap<>();

    public List<Person> getAll() {
        System.out.println("All: ");
        for(Person p : db.values()) {
            System.out.println(p);
        }
        return new ArrayList<>(db.values());
    }

    public Person findById(int id) {
        return db.get(id);
    }

    public Person save() {
        Person person = new Person();
        db.put(person.getId(), person);
        System.out.println("Saved person: "+person);
        return person;
    }

    public Person update(int id) {
        Person person = db.get(id);
        if(Objects.nonNull(person)) {
            person = new Person();
            person.setId(id);
            db.put(id, person);
        }
        System.out.println("Updated person: "+person);
        return person;
    }

    public Person delete(int id) {
        Person person = db.get(id);
        if(Objects.nonNull(person)) {
            db.remove(id);
        }
        System.out.println("Deleted person: "+person);
        return person;
    }



}
