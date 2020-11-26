package by.epam.day4.model.service;

import by.epam.day4.model.entity.Array;

public class ArrayServiceSorting {
    private static ArrayServiceAlgorithm arrayServiceAlgorithm = new ArrayServiceAlgorithm();

    public void bubbleSort(Array array) {
        for (int i = 0; i < array.size(); i++) {
            for (int j = 1; j < array.size(); j++) {
                if (array.getElement(j - 1) > array.getElement(j)) {
                    arrayServiceAlgorithm.swap(array, j - 1, j);
                }
            }
        }
    }

    public void bubbleSort(Array array, boolean reversed) {
        bubbleSort(array);
        if (reversed) {
            arrayServiceAlgorithm.reverse(array);
        }
    }

    public void selectionSort(Array array) {
        for (int min = 0; min < array.size() - 1; min++) {
            int least = min;
            for (int j = min + 1; j < array.size(); j++) {
                if (array.getElement(j) < array.getElement(least)) {
                    least = j;
                }
            }
            arrayServiceAlgorithm.swap(array, min, least);
        }
    }

    public void selectionSort(Array array, boolean reversed) {
        selectionSort(array);
        if (reversed) {
            arrayServiceAlgorithm.reverse(array);
        }
    }

    public void insertionSort(Array array) {
        for (int i = 1; i < array.size(); i++) {
            for (int j = i; j > 0; j--) {
                if (array.getElement(j) < array.getElement(j - 1)) {
                    arrayServiceAlgorithm.swap(array, j, j - 1);
                }
            }
        }
    }

    public void insertionSort(Array array, boolean reversed) {
        insertionSort(array);
        if (reversed) {
            arrayServiceAlgorithm.reverse(array);
        }
    }
}
