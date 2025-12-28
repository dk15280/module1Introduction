package com.springboot.dhananjay.module1Introduction.Impl;

import com.springboot.dhananjay.module1Introduction.Notification;

public class SmsNotification implements Notification {


    @Override
    public void send(String message) {
        System.out.println("SMS :" +message);
    }
}
