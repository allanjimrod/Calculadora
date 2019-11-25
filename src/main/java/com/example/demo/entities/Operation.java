package com.example.demo.entities;

public class Operation {

    double num1;
    double num2;
    double resultado;

    public Operation() {
    }

    public Operation(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public  double CalculateResult(double num1, double num2){
        return 0;
    };
}