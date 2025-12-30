package com.springboot.dhananjay.module1Introduction.Impl;

import com.springboot.dhananjay.module1Introduction.Notification;
import org.springframework.stereotype.Component;

@Component
public class EmailNotigication implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Email :" +message);
    }

}
