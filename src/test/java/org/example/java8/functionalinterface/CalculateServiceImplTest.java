package org.example.java8.functionalinterface;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class CalculateServiceImplTest {

    private CalculateServiceImpl calculateServiceImpl;

    @BeforeEach
    void setUp() {
        calculateServiceImpl = new CalculateServiceImpl();
    }


}