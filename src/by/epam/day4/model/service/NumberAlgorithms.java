package by.epam.day4.model.service;

import by.epam.day4.model.entity.IntegerArray;


public class NumberAlgorithms {
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
        IntegerArray integerArray = new IntegerArray(digitsInNumber);
        for (int i = 0; i < digitsInNumber; i++) {
            integerArray.setElement(i, -1);
        }
        number = Math.abs(number);
        int i = 0;
        ArrayServiceSearch arrayServiceSearch = new ArrayServiceSearch();
        while (number > 0) {
            int digit = number % 10;
            if (arrayServiceSearch.searchElementIndex(integerArray, digit) != -1) {
                return false;
            }
            integerArray.setElement(i++, digit);
            number /= 10;
        }

        return true;
    }

}