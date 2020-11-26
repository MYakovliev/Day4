package by.epam.day4.model.service;

import by.epam.day4.model.entity.IntegerArray;

public class ArrayServiceSorting {
    private static ArrayServiceAlgorithm arrayServiceAlgorithm = new ArrayServiceAlgorithm();

    public void bubbleSort(IntegerArray integerArray) {
        for (int i = 0; i < integerArray.size(); i++) {
            for (int j = 1; j < integerArray.size(); j++) {
                if (integerArray.getElement(j - 1) > integerArray.getElement(j)) {
                    arrayServiceAlgorithm.swap(integerArray, j - 1, j);
                }
            }
        }
    }

    public void bubbleSort(IntegerArray integerArray, boolean reversed) {
        bubbleSort(integerArray);
        if (reversed) {
            arrayServiceAlgorithm.reverse(integerArray);
        }
    }

    public void selectionSort(IntegerArray integerArray) {
        for (int min = 0; min < integerArray.size() - 1; min++) {
            int least = min;
            for (int j = min + 1; j < integerArray.size(); j++) {
                if (integerArray.getElement(j) < integerArray.getElement(least)) {
                    least = j;
                }
            }
            arrayServiceAlgorithm.swap(integerArray, min, least);
        }
    }

    public void selectionSort(IntegerArray integerArray, boolean reversed) {
        selectionSort(integerArray);
        if (reversed) {
            arrayServiceAlgorithm.reverse(integerArray);
        }
    }

    public void insertionSort(IntegerArray integerArray) {
        for (int i = 1; i < integerArray.size(); i++) {
            for (int j = i; j > 0; j--) {
                if (integerArray.getElement(j) < integerArray.getElement(j - 1)) {
                    arrayServiceAlgorithm.swap(integerArray, j, j - 1);
                }
            }
        }
    }

    public void insertionSort(IntegerArray integerArray, boolean reversed) {
        insertionSort(integerArray);
        if (reversed) {
            arrayServiceAlgorithm.reverse(integerArray);
        }
    }
}
