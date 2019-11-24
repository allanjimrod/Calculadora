package com.example.demo.services;

import com.content.transferlist.Tl_operation;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    private Tl_operation operation;

    public CalculatorService(){
        operation = new Tl_operation();
    }
    public double getSum(double pnum1, double pnum2) throws Exception {
        double result = operation.createSum(pnum1, pnum2);
        return result;
    }

    public double getMultiplication(double pnum1, double pnum2) throws Exception {
        double result = operation.createMultiplication(pnum1, pnum2);
        return result;
    }

    public double getDivision(double pnum1, double pnum2) throws Exception{
        double result = operation.createDivision(pnum1, pnum2);
        return result;
    }

    public double getSubtraction(double pnum1, double pnum2) throws Exception{
        double result = operation.createSubtraction(pnum1, pnum2);
        return result;
    }
}
