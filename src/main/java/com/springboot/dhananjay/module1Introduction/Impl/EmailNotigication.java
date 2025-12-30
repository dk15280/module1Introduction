package com.springboot.dhananjay.module1Introduction.Impl;

import com.springboot.dhananjay.module1Introduction.Notification;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("emailNotify")
//@ConditionalOnProperty(name="notification.type", havingValue = "email")
public class EmailNotigication implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Email :" +message);
    }

}
