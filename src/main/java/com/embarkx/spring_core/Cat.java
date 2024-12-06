package com.embarkx.spring_core;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("cat")
public class Cat implements Animal{
    @Override
    public void Play() {
        System.out.println("Cat is playing");
    }
}
