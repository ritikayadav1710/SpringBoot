package com.ritika.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired //field injection
    @Qualifier("laptop")

    private Computer comp;
//    public Dev(Laptop laptop){  //constructor injection
//        this.laptop=laptop;
//    }

//    @Autowired
//    public void setLaptop(Laptop laptop){
//        this.laptop=laptop;
//    }

    public void build(){

        comp.compile();

        System.out.println("working on awesome project");

    }
}
