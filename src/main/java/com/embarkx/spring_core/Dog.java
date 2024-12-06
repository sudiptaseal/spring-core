package com.embarkx.spring_core;

import org.springframework.stereotype.Component;

@Component("dog")
public class Dog implements Animal{
    @Override
    public void Play() {
        System.out.println("Dog is playing");
    }
}
