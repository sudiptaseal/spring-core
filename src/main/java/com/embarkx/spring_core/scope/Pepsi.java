package com.embarkx.spring_core.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Scope("prototype")
public class Pepsi {

    public Pepsi(){
        System.out.println("Creating pepsi");
    }

    public void drink() {
        System.out.println("Pepsi is very cool");
    }
}
