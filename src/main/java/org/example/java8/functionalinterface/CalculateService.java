package org.example.java8.functionalinterface;

@FunctionalInterface
public interface Calculator {
    int add(int a, int b);

    default int multiply(int a, int b){
        return a*b;
    }

    default int substract(int a, int b){
        return a-b;
    }

}
