package com.example.demo.entities;

public class Division extends Operation {

    @Override
    public double CalculateResult(double num1, double num2) {
        return resultado = num1 / num2;
    }
}
