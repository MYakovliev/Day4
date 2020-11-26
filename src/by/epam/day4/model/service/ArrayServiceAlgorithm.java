package by.epam.day4.model.service;

import by.epam.day4.model.entity.Array;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ArrayServiceAlgorithm {
    private static final Logger logger = LogManager.getLogger();

    private static final NumberAlgorithms NUMBER_ALGORITHMS = new NumberAlgorithms();

    public int findMax(Array array) {
        int max = array.getElement(0);
        for (int i : array.getArr()) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public int findMin(Array array) {
        int min = array.getElement(0);
        for (int i : array.getArr()) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public Array findAllPrimary(Array array) {
        Array primary = new Array(array.size());
        int i = 0;
        for (int element : array.getArr()) {
            if (NUMBER_ALGORITHMS.isPrimary(element)) {
                primary.setElement(i++, element);
            }
        }
        if (i == array.size()) {
            return primary;
        }
        Array result = new Array(i);
        if (i >= 0) {
            System.arraycopy(primary.getArr(), 0, result.getArr(), 0, i);
        }
        return result;
    }

    public Array findAllFibonacci(Array array) {
        Array fibonacci = new Array(array.size());
        int i = 0;
        for (int element : array.getArr()) {
            if (NUMBER_ALGORITHMS.isFibonacciNumber(element)) {
                fibonacci.setElement(i++, element);
            }
        }
        if (i == array.size()) {
            return fibonacci;
        }
        Array result = new Array(i);
        if (i >= 0) {
            System.arraycopy(fibonacci.getArr(), 0, result.getArr(), 0, i);
        }
        return result;
    }

    public Array findAllWithoutDuplicatedDigits(Array array, int numberOfDigits) {
        Array withoutDuplicated = new Array(array.size());
        int i = 0;
        for (int element : array.getArr()) {
            if (element == element % Math.pow(10, numberOfDigits)) {
                if (NUMBER_ALGORITHMS.noDuplicateDigits(element, numberOfDigits)) {
                    withoutDuplicated.setElement(i++, element);
                }
            }
        }
        if (i == array.size()) {
            return withoutDuplicated;
        }
        Array result = new Array(i);
        if (i >= 0) {
            System.arraycopy(withoutDuplicated.getArr(), 0, result.getArr(), 0, i);
        }
        return result;
    }

    public int calculateSum(Array array) {
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.getElement(i);
        }
        return sum;
    }

    public void reverse(Array array) {
        for (int i = 0; i < array.size() / 2; i++) {
            swap(array, i, array.size() - 1 - i);
        }
    }

    public void swap(Array array, int index1, int index2) {
        int temp = array.getElement(index1);
        array.setElement(index1, array.getElement(index2));
        array.setElement(index2, temp);
    }

}