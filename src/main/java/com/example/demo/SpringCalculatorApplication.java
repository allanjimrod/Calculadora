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

	/*private static void menu() throws Exception {

		double num1;
		double num2;
		String signo;
		Double resultado;

		System.out.println("Bienvenido a la calculadora del futuro!!!");

		System.out.println("Digite el primer numero");
		num1 = Double.parseDouble(sc.nextLine());

		System.out.println("Digite el signo");
		signo = sc.nextLine();

		System.out.println("Digite el segundo numero");
		num2 = Double.parseDouble(sc.nextLine());

		resultado = tipoOperacion(signo, num1, num2);

		System.out.println("EL resultado de la operacion es: " + resultado);
	}

	private static double tipoOperacion(String signo, double pnum1, double pnum2) throws Exception {

		double respuesta=0.0;

		switch (signo) {
			case "+":
				 respuesta = cc.getOperationSum(pnum1, pnum2);
				break;
			case "*":
				respuesta = cc.getOperationMultiplication(pnum1, pnum2);
				break;
			case "/":
				respuesta = cc.getOperationDivision(pnum1, pnum2);
				break;
			case "-":
				respuesta = cc.getOperationSubtraction(pnum1, pnum2);
				break;
		}

		return respuesta;
	}*/

	/*@Override
	public void start(Stage primaryStage) throws Exception{
		*//*Parent root = FXMLLoader.load(getClass().getResource("/resources/Index.fxml"));
		primaryStage.setScene(new Scene(root, 300, 390));
		primaryStage.show();*//*
	}*/

}
