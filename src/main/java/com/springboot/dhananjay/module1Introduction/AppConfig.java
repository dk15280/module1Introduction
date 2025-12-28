package com.springboot.dhananjay.module1Introduction;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    paymentService PaymentService()
    {
        return new paymentService();
    }
}
