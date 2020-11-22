package by.epam.day4.tasks.model.service;

import by.epam.day4.tasks.model.entity.Array;


public class Algorithms {
    public boolean isPrimary(int number) {
        for (int i = number / 2; i > 1; i--) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isFibonacciNumber(int number) {
        int now = 0, next = 1;
        while (now <= number) {
            if (now == number) {
                return true;
            }

            int temp = next;
            next = now + next;
            now = temp;
        }
        return false;
    }

    public boolean noDuplicateDigits(int number, int digitsInNumber) {
        Array array = new Array(digitsInNumber);
        for (int i = 0; i < digitsInNumber; i++) {
            array.setElement(i, -1);
        }
        number = Math.abs(number);
        int i = 0;
        while (number > 0) {
            int digit = number % 10;
            if (array.contains(digit)) {
                return false;
            }
            array.setElement(i++, digit);
            number /= 10;
        }

        return true;
    }

}