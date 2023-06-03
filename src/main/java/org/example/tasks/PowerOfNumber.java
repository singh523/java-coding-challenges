package org.example.tasks;

public class PowerOfNumber {

    public boolean isPowerOf(int number, int power) {
        while (number > 0) {
            if (number % power != 0) return false;
            if (number/power == 1) {
                return true;
            }
            number = number / power;
        }
        return false;
    }
}
