package com.springboot.dhananjay.module1Introduction;

import com.springboot.dhananjay.module1Introduction.Impl.EmailNotigication;
import com.springboot.dhananjay.module1Introduction.Impl.SmsNotification;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
public class AppConfig {
    @Bean
    paymentService PaymentService()
    {
        return new paymentService();
    }

}
