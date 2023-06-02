package org.example.java8.functionalinterface;

public class CalculateServiceImpl {
    public int calculate(int a, int b, CalculateType type){
        Calculator addition = (x, y) -> x+y;
        Calculator subtract = (x, y) -> x-y;
        Calculator multiply = (x, y) -> x*y;
        
        int result = switch(type){
            case ADD -> addition.add(a,b);
            case MULTIPLY -> multiply.multiply(a,b);
            case SUBTRACT -> subtract.subtract(a,b);
            default -> -1;
        };
        return result;
    }
}

