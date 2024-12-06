package com.embarkx.spring_core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class Person {

    @Autowired
    Animal animal;

    public Person(Animal animal) {
        this.animal = animal;
    }

    public void playWith() {
        animal.Play();
    }
}
