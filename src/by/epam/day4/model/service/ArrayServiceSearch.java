package by.epam.day4.model.service;

import by.epam.day4.model.entity.IntegerArray;

public class ArrayServiceSearch {
    public int searchElementIndexBinary(IntegerArray integerArray, int element) {
        int left = 0, right = integerArray.size() - 1;
        while (left != right) {
            int middle = (left + right) / 2;
            if (integerArray.getElement(middle) == element) {
                return middle;
            }
            if (integerArray.getElement(middle) > element) {
                right = middle - 1;
            } else if (integerArray.getElement(middle) < element) {
                left = middle + 1;
            }
        }
        return element == integerArray.getElement(left) ? left : -1;
    }

    public int searchElementIndex(IntegerArray integerArray, int element) {
        for (int i = 0; i < integerArray.size(); i++) {
            if (integerArray.getElement(i) == element) {
                return i;
            }
        }
        return -1;
    }
}
