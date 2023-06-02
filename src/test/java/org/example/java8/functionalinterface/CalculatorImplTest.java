package org.example.java8.functionalinterface;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorImplTest {

    private CalculateServiceImpl calculateServiceImpl;

    @BeforeEach
    void setUp() {
        calculateServiceImpl = new CalculateServiceImpl();
    }

    @Test
    public void given_valid_input_for_add_function_then_should_return_result(){
        assertEquals(30, calculateServiceImpl.calculate(10,20, CalculateType.ADD));
    }

    @Test
    public void given_valid_input_for_subtract_function_then_should_return_result(){
        assertEquals(10, calculateServiceImpl.calculate(30,20, CalculateType.SUBTRACT));
    }

    @Test
    public void given_valid_input_for_multiply_function_then_should_return_result(){
        assertEquals(600, calculateServiceImpl.calculate(30,20, CalculateType.MULTIPLY));
    }
}