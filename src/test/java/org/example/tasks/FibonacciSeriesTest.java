package org.example.tasks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FibonacciSeriesTest {
    private FibonacciSeries fibonacciNumbers;

    @BeforeEach
    public void setup() {
        fibonacciNumbers = new FibonacciSeries();
    }

    @Test
    public void testFibonacciNumbers() {
        List<Integer> fibonacciList = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            fibonacciList.add(fibonacciNumbers.fibonacci(i));
        }
        assertTrue(fibonacciList.contains(8));
    }
}
