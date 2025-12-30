package com.springboot.dhananjay.module1Introduction.Impl;

import com.springboot.dhananjay.module1Introduction.Notification;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("smsNotify")
//@ConditionalOnProperty(name="notification.type", havingValue = "smp")
public class SmsNotification implements Notification {


    @Override
    public void send(String message) {
        System.out.println("SMS :" +message);
    }
}
