package com.embarkx.spring_core;

public class Samosa {

    String name;
    public Samosa(String name){
        System.out.println("This is "+name);
        this.name = name;
    }

    public void eat() {
        System.out.println("Samosa is very spicy");
        System.out.println(name);
    }
}
