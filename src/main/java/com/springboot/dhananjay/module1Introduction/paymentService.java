package com.springboot.dhananjay.module1Introduction;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Component
//@Service --> Business logic
//@Controller --> Web layer
//@Repository --> Database access
public class paymentService {

    public void pay(){
        System.out.println("Paying.........");
    }
    @PostConstruct
    public void BeforePayment()
    {
        System.out.println("Before payment...............");
    }
    @PreDestroy
    public void AfterPayment()
    {
        System.out.println("After Payment done..............");
    }
}
