package by.epam.day4.model.service;

import by.epam.day4.model.entity.Array;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayServiceSortingTest {
    static ArrayServiceSorting arrayServiceSorting = new ArrayServiceSorting();

    @Test
    public void testBubbleSort() {
        Array expected = new Array(1, 2, 3, 4, 5);
        Array actual = new Array(4, 5, 1, 3, 2);
        arrayServiceSorting.bubbleSort(actual);
        assertEquals(actual, expected);
    }

    @Test
    public void testBubbleSortReversed() {
        Array expected = new Array(5, 4, 3, 2, 1);
        Array actual = new Array(4, 5, 1, 3, 2);
        arrayServiceSorting.bubbleSort(actual, true);
        assertEquals(actual, expected);
    }

    @Test
    public void testSelectionSort() {
        Array expected = new Array(1, 2, 3, 4, 5);
        Array actual = new Array(4, 5, 1, 3, 2);
        arrayServiceSorting.selectionSort(actual);
        assertEquals(actual, expected);
    }

    @Test
    public void testSelectionSortReversed() {
        Array expected = new Array(5, 4, 3, 2, 1);
        Array actual = new Array(4, 5, 1, 3, 2);
        arrayServiceSorting.selectionSort(actual, true);
        assertEquals(actual, expected);
    }

    @Test
    public void testInsertionSort() {
        Array expected = new Array(1, 2, 3, 4, 5);
        Array actual = new Array(4, 5, 1, 3, 2);
        arrayServiceSorting.insertionSort(actual);
        assertEquals(actual, expected);
    }

    @Test
    public void testInsertionSortReversed() {
        Array expected = new Array(5, 4, 3, 2, 1);
        Array actual = new Array(4, 5, 1, 3, 2);
        arrayServiceSorting.insertionSort(actual, true);
        assertEquals(actual, expected);
    }
}