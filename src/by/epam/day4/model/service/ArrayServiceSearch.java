package by.epam.day4.model.service;

import by.epam.day4.model.entity.Array;

public class ArrayServiceSearch {
    public int searchElementIndexBinary(Array array, int element) {
        int left = 0, right = array.size() - 1;
        while (left != right) {
            int middle = (left + right) / 2;
            if (array.getElement(middle) == element) {
                return middle;
            }

            if (array.getElement(middle) > element) {
                right = middle - 1;
            } else if (array.getElement(middle) < element) {
                left = middle + 1;
            }
        }
        return -1;
    }

    public int searchElement(Array array, int element){
        for (int i = 0; i < array.size(); i++) {
            if (array.getElement(i) == element){
                return i;
            }
        }
        return -1;
    }
}
