package com.embarkx.spring_core;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("dog")
public class Dog implements Animal{
    @Override
    public void Play() {
        System.out.println("Dog is playing");
    }
}
