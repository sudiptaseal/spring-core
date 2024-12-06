package com.embarkx.spring_core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component("person")
public class Person {

    //@Autowired
    //@Qualifier("cat")
    Animal animal;

    @Autowired
    Samosa samosa;

//    @Autowired
//    public Person(@Qualifier("cat") Animal animal) {
//        this.animal = animal;
//    }

    @Autowired
    public void setPerson(@Qualifier("dog") Animal animal){
        this.animal = animal;
    }

    public void playWith() {
        animal.Play();
        samosa.eat();
    }
}
