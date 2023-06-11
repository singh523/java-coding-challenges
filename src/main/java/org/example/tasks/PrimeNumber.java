package org.example.tasks;

public class PrimeNumber {
    public boolean isPrime(int num) {
        boolean result = false;

            boolean flag = false;
            for (int i = 2; i < num/2; ++i) {
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                result=true;
                System.out.println("given number is prime " + num);
            } else
                System.out.println("Given number is not prime " + num);

        return result;
    }
}
