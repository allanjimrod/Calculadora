package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@SpringBootApplication
@ComponentScan({"com.example.demo.controllers", "com.example.demo.services"})
@Configuration
public class SpringCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCalculatorApplication.class, args);
	}


}
