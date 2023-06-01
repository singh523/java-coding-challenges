package org.example.java8.functionalinterface;

public class CalculateServiceImpl {
    private int calculate(int a, int b){
        CalculateService calculateService = (x, y) -> x+y;
        return calculateService.add(a,b);
    }
}
