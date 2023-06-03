package org.example.tasks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowerOfNumberTest {

    private PowerOfNumber powerOfNumber;

    @BeforeEach
    public void setup(){
        powerOfNumber = new PowerOfNumber();
    }

    @Test
    public void testPowerOfThreeAndExpectFalse(){
        assertEquals(false, powerOfNumber.isPowerOf(12, 3));
    }

    @Test
    public void testPowerOfAndExpectBoolean(){
        assertEquals(true, powerOfNumber.isPowerOf(9, 3));
    }

    @Test
    public void testPowerOfFourAndExpectBoolean(){
        assertEquals(true, powerOfNumber.isPowerOf(16, 4));
    }

}
