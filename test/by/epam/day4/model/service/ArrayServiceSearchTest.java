package by.epam.day4.model.service;

import by.epam.day4.model.entity.IntegerArray;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayServiceSearchTest {
    static ArrayServiceSearch arrayServiceSearch = new ArrayServiceSearch();

    @Test
    public void testSearchElementIndexBinary() {
        IntegerArray array = new IntegerArray(1, 2, 3, 4, 5);
        int expected = 1;
        int actual = arrayServiceSearch.searchElementIndexBinary(array, 2);
        assertEquals(actual, expected);
    }

    @Test
    public void testSearchElementIndex() {
        IntegerArray array = new IntegerArray(5, 2, 1, 44, -55);
        int expected = 1;
        int actual = arrayServiceSearch.searchElementIndex(array, 2);
        assertEquals(actual, expected);
    }
}