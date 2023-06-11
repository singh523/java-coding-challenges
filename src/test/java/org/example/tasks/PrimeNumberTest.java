package org.example.tasks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeNumberTest {

    private PrimeNumber primeNumber;

    @BeforeEach
    public void setup(){
        primeNumber = new PrimeNumber();
    }

    @Test
    public void testPrimeNumber(){

        assertEquals(true, primeNumber.isPrime(5));
        assertEquals(true, primeNumber.isPrime(7));
        assertEquals(false, primeNumber.isPrime(6));
        assertEquals(true, primeNumber.isPrime(13));

    }
}
