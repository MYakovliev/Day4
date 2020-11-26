package by.epam.day4.model.service;

import by.epam.day4.model.entity.IntegerArray;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IntegerArrayServiceSortingTest {
    static ArrayServiceSorting arrayServiceSorting = new ArrayServiceSorting();

    @Test
    public void testBubbleSort() {
        IntegerArray expected = new IntegerArray(1, 2, 3, 4, 5);
        IntegerArray actual = new IntegerArray(4, 5, 1, 3, 2);
        arrayServiceSorting.bubbleSort(actual);
        assertEquals(actual, expected);
    }

    @Test
    public void testBubbleSortReversed() {
        IntegerArray expected = new IntegerArray(5, 4, 3, 2, 1);
        IntegerArray actual = new IntegerArray(4, 5, 1, 3, 2);
        arrayServiceSorting.bubbleSort(actual, true);
        assertEquals(actual, expected);
    }

    @Test
    public void testSelectionSort() {
        IntegerArray expected = new IntegerArray(1, 2, 3, 4, 5);
        IntegerArray actual = new IntegerArray(4, 5, 1, 3, 2);
        arrayServiceSorting.selectionSort(actual);
        assertEquals(actual, expected);
    }

    @Test
    public void testSelectionSortReversed() {
        IntegerArray expected = new IntegerArray(5, 4, 3, 2, 1);
        IntegerArray actual = new IntegerArray(4, 5, 1, 3, 2);
        arrayServiceSorting.selectionSort(actual, true);
        assertEquals(actual, expected);
    }

    @Test
    public void testInsertionSort() {
        IntegerArray expected = new IntegerArray(1, 2, 3, 4, 5);
        IntegerArray actual = new IntegerArray(4, 5, 1, 3, 2);
        arrayServiceSorting.insertionSort(actual);
        assertEquals(actual, expected);
    }

    @Test
    public void testInsertionSortReversed() {
        IntegerArray expected = new IntegerArray(5, 4, 3, 2, 1);
        IntegerArray actual = new IntegerArray(4, 5, 1, 3, 2);
        arrayServiceSorting.insertionSort(actual, true);
        assertEquals(actual, expected);
    }
}