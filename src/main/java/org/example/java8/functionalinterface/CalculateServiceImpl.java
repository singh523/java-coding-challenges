package org.example.java8.functionalinterface;

public class CalculateServiceImpl {
    public int calculate(int a, int b, CalculateType type){
        Calculator calculator = (x, y) -> x+y;
        
        int result = switch(type){
            case ADD -> calculator.add(a,b);
            case MULTIPLY -> calculator.multiply(a,b);
            case SUBTRACT -> calculator.subtract(a,b);
            default -> -1;
        };
        return result;
    }
}

