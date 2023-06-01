package org.example.tasks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RotateArrayTest {

    RotateArray rotateArray;

    @BeforeEach
    public void setup() {
        rotateArray = new RotateArray();
    }

    @Test
    public void testRotateArrayThenArrayShouldBeRotated() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int[] rotatedArray = rotateArray.getRotated(array, 3);
        assertEquals(4, rotatedArray[0]);
        assertEquals(5, rotatedArray[1]);
        assertEquals(6, rotatedArray[2]);
    }

    @Test
    public void testRotateArrayWhenScenarioThenArrayShouldBeRotated() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] rotatedArray = rotateArray.getRotated(array, 6);
        assertEquals(7, rotatedArray[0]);
        assertEquals(8, rotatedArray[1]);
        assertEquals(9, rotatedArray[2]);
    }
}