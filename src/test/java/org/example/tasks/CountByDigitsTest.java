package org.example.tasks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountByDigitsTest {

    private CountByDigits countByDigits;

    @BeforeEach
    public void setup(){
        countByDigits = new CountByDigits();
    }

    @Test
    public void testCountByDigits(){
        assertEquals(3, countByDigits.countDigits(12342322, 2));
    }


}
