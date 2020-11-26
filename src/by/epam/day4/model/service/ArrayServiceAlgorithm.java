package by.epam.day4.model.service;

import by.epam.day4.model.entity.IntegerArray;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;


public class ArrayServiceAlgorithm {
    private static final Logger logger = LogManager.getLogger();

    private static final NumberAlgorithms NUMBER_ALGORITHMS = new NumberAlgorithms();

    public int findMax(IntegerArray integerArray) {
        int max = integerArray.getElement(0);
        for (int i : integerArray.getArr()) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public int findMin(IntegerArray integerArray) {
        int min = integerArray.getElement(0);
        for (int i : integerArray.getArr()) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public IntegerArray findAllPrimary(IntegerArray integerArray) {
        IntegerArray primary = new IntegerArray(integerArray.size());
        int i = 0;
        for (int element : integerArray.getArr()) {
            if (NUMBER_ALGORITHMS.isPrimary(element)) {
                primary.setElement(i++, element);
            }
        }
        if (i == integerArray.size()) {
            return primary;
        }
        IntegerArray result = new IntegerArray(i);
        if (i >= 0) {
            result = new IntegerArray(Arrays.copyOfRange(primary.getArr(),0, i));
        }
        return result;
    }

    public IntegerArray findAllFibonacci(IntegerArray integerArray) {
        IntegerArray fibonacci = new IntegerArray(integerArray.size());
        int i = 0;
        for (int element : integerArray.getArr()) {
            if (NUMBER_ALGORITHMS.isFibonacciNumber(element)) {
                fibonacci.setElement(i++, element);
            }
        }
        if (i == integerArray.size()) {
            return fibonacci;
        }
        IntegerArray result = new IntegerArray(i);
        if (i >= 0) {
            result = new IntegerArray(Arrays.copyOfRange(fibonacci.getArr(),0, i));
        }
        return result;
    }

    public IntegerArray findAllWithoutDuplicatedDigits(IntegerArray integerArray, int numberOfDigits) {
        IntegerArray withoutDuplicated = new IntegerArray(integerArray.size());
        int i = 0;
        for (int element : integerArray.getArr()) {
            if (element == element % Math.pow(10, numberOfDigits) && element > Math.pow(10, numberOfDigits - 1)) {
                if (NUMBER_ALGORITHMS.noDuplicateDigits(element, numberOfDigits)) {
                    withoutDuplicated.setElement(i++, element);
                }
            }
        }
        if (i == integerArray.size()) {
            return withoutDuplicated;
        }
        IntegerArray result = new IntegerArray(i);
        if (i >= 0) {
            result = new IntegerArray(Arrays.copyOfRange(withoutDuplicated.getArr(),0, i));
        }
        return result;
    }

    public int calculateSum(IntegerArray integerArray) {
        int sum = 0;
        for (int i = 0; i < integerArray.size(); i++) {
            sum += integerArray.getElement(i);
        }
        return sum;
    }

    public void reverse(IntegerArray integerArray) {
        for (int i = 0; i < integerArray.size() / 2; i++) {
            swap(integerArray, i, integerArray.size() - 1 - i);
        }
    }

    public void swap(IntegerArray integerArray, int index1, int index2) {
        int temp = integerArray.getElement(index1);
        integerArray.setElement(index1, integerArray.getElement(index2));
        integerArray.setElement(index2, temp);
    }

}