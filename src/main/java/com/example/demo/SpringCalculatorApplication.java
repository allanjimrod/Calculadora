package com.example.demo;


import com.example.demo.controllers.CalculatorController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;


@SpringBootApplication
@ComponentScan({"com.example.demo.controllers", "com.example.demo.services"})
@Configuration
public class SpringCalculatorApplication  {

	static Scanner sc = new Scanner(System.in);
	@Autowired
	static CalculatorController cc;

	public static ConfigurableApplicationContext context;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringCalculatorApplication.class, args);

	}

}
