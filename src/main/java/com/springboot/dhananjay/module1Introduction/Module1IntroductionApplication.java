package com.springboot.dhananjay.module1Introduction;

import com.springboot.dhananjay.module1Introduction.Impl.EmailNotigication;
import com.springboot.dhananjay.module1Introduction.Impl.SmsNotification;
import jakarta.annotation.Priority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
public class Module1IntroductionApplication implements CommandLineRunner {
	@Autowired
	//paymentService paymentservice;
     Notification notificationObj;
	public static void main(String[] args) {
		SpringApplication.run(Module1IntroductionApplication.class, args);

	}
	@Override
	public void run(String... args) throws Exception {
		//paymentservice.pay();
		notificationObj.send("Hi It is done successfully");

	}
}
