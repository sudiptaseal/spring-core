package com.embarkx.spring_core;

public class Person {

    Animal animal;

    public Person(Animal animal) {
        this.animal = animal;
    }

    public void playWith() {
        animal.Play();
    }
}
