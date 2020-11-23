package by.epam.day4.model.service;

import by.epam.day4.model.entity.Array;

import java.util.Random;

import by.epam.day4.util.Input;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ArrayService {
    private static final Logger logger = LogManager.getLogger();

    private static final Algorithms algorithms = new Algorithms();

    public void reverse(Array array) {
        for (int i = 0; i < array.size() / 2; i++) {
            swap(array, i, array.size() - 1 - i);
        }
    }

    public void bubbleSort(Array array) {
        for (int i = 0; i < array.size(); i++) {
            for (int j = 1; j < array.size(); j++) {
                if (array.getElement(j - 1) > array.getElement(j)) {
                    swap(array, j - 1, j);
                }
            }
        }
    }

    public void bubbleSort(Array array, boolean reversed) {
        bubbleSort(array);
        if (reversed) {
            reverse(array);
        }
    }

    public void swap(Array array, int index1, int index2) {
        int temp = array.getElement(index1);
        array.setElement(index1, array.getElement(index2));
        array.setElement(index2, temp);
    }

    public void selectionSort(Array array) {
        for (int min = 0; min < array.size() - 1; min++) {
            int least = min;
            for (int j = min + 1; j < array.size(); j++) {
                if (array.getElement(j) < array.getElement(least)) {
                    least = j;
                }
            }
            swap(array, min, least);
        }
    }

    public void selectionSort(Array array, boolean reversed) {
        selectionSort(array);
        if (reversed) {
            reverse(array);
        }
    }

    public void insertionSort(Array array) {
        for (int i = 1; i < array.size(); i++) {
            for (int j = i; j > 0; j--) {
                if (array.getElement(j) < array.getElement(j - 1)) {
                    swap(array, j, j - 1);
                }
            }
        }
    }

    public void insertionSort(Array array, boolean reversed) {
        insertionSort(array);
        if (reversed) {
            reverse(array);
        }
    }

    public int findElementIndexBinary(Array array, int element) {
        int left = 0, right = array.size() - 1, prevMiddle = -1;
        while (left != right) {
            int middle = (left + right) / 2;
            if (array.getElement(middle) == element) {
                return middle;
            }
            if (middle == prevMiddle) {
                logger.error("infinite loop ending");
                break;
            } else if (array.getElement(middle) > element) {
                right = middle;
                prevMiddle = middle;
            } else if (array.getElement(middle) < element) {
                left = middle;
                prevMiddle = middle;
            }


        }
        return -1;
    }

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
            if (algorithms.isPrimary(element)) {
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
            if (algorithms.isFibonacciNumber(element)) {
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
                if (algorithms.noDuplicateDigits(element, numberOfDigits)) {
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

    public void fulfillArrayFromConsole(Array array) {
        Input input = new Input();
        int a = input.getIntFromConsole("Enter " + array.size() + " integer numbers: ");
        for (int i = 0; i < array.size(); i++) {
            array.setElement(i, a);
            if (a != array.size() - 1) {
                a = input.getIntFromConsole();
            }
        }
    }

    public void fulfillArrayFromFile(Array array, String filename) {
        Input input = new Input();
        array = input.getIntArrayFromFile(filename, array.size());
    }

    public void fulfillArrayRandomly(Array array) {
        Random random = new Random();
        for (int i = 0; i < array.size(); i++) {
            int num = random.nextInt();
            array.setElement(i, num);
        }
    }
}