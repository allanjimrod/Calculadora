package com.example.demo.controllers;

import com.example.demo.services.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private final CalculatorService cs;

    @Autowired
    public CalculatorController(CalculatorService cs) {
        this.cs = cs;
    }

    @RequestMapping(value = "/sum/{pnum1}/{pnum2}", method = RequestMethod.GET)
    public double getOperationSum(@PathVariable double pnum1, @PathVariable double pnum2) throws Exception {
        double result = cs.getSum(pnum1, pnum2);
        return result;
    }

    @RequestMapping(value = "/multiplication/{pnum1}/{pnum2}", method = RequestMethod.GET)
    public double getOperationMultiplication(@PathVariable double pnum1, @PathVariable double pnum2) throws Exception {
        double result = cs.getMultiplication(pnum1, pnum2);
        return result;
    }

    @RequestMapping(value = "/division/{pnum1}/{pnum2}", method = RequestMethod.GET)
    public double getOperationDivision(@PathVariable double pnum1, @PathVariable double pnum2) throws Exception {
        double result = cs.getDivision(pnum1, pnum2);
        return result;
    }

    @RequestMapping(value = "/subtraction/{pnum1}/{pnum2}", method = RequestMethod.GET)
    public double getOperationSubtraction(@PathVariable double pnum1, @PathVariable double pnum2) throws Exception {
        double result = cs.getSubtraction(pnum1, pnum2);
        return result;
    }

}
