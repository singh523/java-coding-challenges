package org.example.tasks;

public class CountByDigits {
    public int countDigits(int number, int digit) {
        int count = 0;
        int tempNumber;
        while (number > 0) {
            tempNumber = number % 10;
            if (tempNumber == digit) count++;
            number = number / 10;
        }
        return count;
    }
}
