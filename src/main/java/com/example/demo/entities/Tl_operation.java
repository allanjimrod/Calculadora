package com.example.demo.entities;


public class Tl_operation {

    private Operation op;

    public Tl_operation() {

    }

    public double createSum(double pnum1, double pnum2) throws Exception {
        double resultado = 0;
        try {
            op = new Sum();
            resultado = op.CalculateResult(pnum1, pnum2);
        } catch (Exception ex) {
            System.out.println("Error in the operation, please check the numbers" + ex.getCause());
        }
        return resultado;
    }

    public double createDivision(double pnum1, double pnum2) throws Exception {
        double resultado = 0;
        try {
            op = new Division();
            resultado = op.CalculateResult(pnum1, pnum2);
        } catch (Exception ex) {

            System.out.println("Error in the operation, please check the numbers" + ex.getCause());
        }
        return resultado;
    }

    public double createMultiplication(double pnum1, double pnum2) throws Exception {
        double resultado = 0;
        try {
            op = new Multiplication();
            resultado = op.CalculateResult(pnum1, pnum2);
        } catch (Exception ex) {
            System.out.println("Error in the operation, please check the numbers" + ex.getCause());
        }
        return resultado;
    }

    public double createSubtraction(double pnum1, double pnum2) throws Exception {
        double resultado = 0;
        try {
            op = new Subtraction();
            resultado = op.CalculateResult(pnum1, pnum2);
        } catch (Exception ex) {
            System.out.println("Error in the operation, please check the numbers" + ex.getCause());
        }
        return resultado;
    }
}
