package by.epam.day4.model.service;

import by.epam.day4.model.entity.IntegerArray;
import by.epam.day4.model.entity.JaggerArray;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class JaggerArrayServiceTest {
    static JaggerArrayService jaggerArrayService = new JaggerArrayService();
    static IntegerArray array1 = new IntegerArray(147, 541, 809, 24, 65);
    static IntegerArray array2 = new IntegerArray(642, 241, 377, 525, 363);
    static IntegerArray array3 = new IntegerArray(765, 391, 313, 844, 761);
    static IntegerArray array4 = new IntegerArray(217, 918, 136, 457, 565);
    static IntegerArray array5 = new IntegerArray(647, 484, 394, 117, 953);


    @Test
    public void testSortByRowsSum() {
        JaggerArray expected = new JaggerArray(array1, array2, array4, array5, array3);
        JaggerArray actual = new JaggerArray(array1, array2, array3, array4, array5);
        jaggerArrayService.sortByRowsSum(actual);
        assertEquals(actual, expected);
    }

    @Test
    public void testTestSortByRowsSum() {
        JaggerArray expected = new JaggerArray(array3, array5, array4, array2, array1);
        JaggerArray actual = new JaggerArray(array1, array2, array3, array4, array5);
        jaggerArrayService.sortByRowsSum(actual, true);
        assertEquals(actual, expected);
    }

    @Test
    public void testSwap() {
        JaggerArray expected = new JaggerArray(array1, array2, array4, array3, array5);
        JaggerArray actual = new JaggerArray(array1, array2, array3, array4, array5);
        jaggerArrayService.swap(actual, 2, 3);
        assertEquals(actual, expected);
    }

    @Test
    public void testReverse() {
        JaggerArray expected = new JaggerArray(array5, array4, array3, array2, array1);
        JaggerArray actual = new JaggerArray(array1, array2, array3, array4, array5);
        jaggerArrayService.reverse(actual);
        assertEquals(actual, expected);
    }

    @Test
    public void testSortByMaxElement() {
        JaggerArray expected = new JaggerArray(array2, array1, array3, array4, array5);
        JaggerArray actual = new JaggerArray(array1, array2, array3, array4, array5);
        jaggerArrayService.sortByMaxElement(actual);
        assertEquals(actual, expected);
    }

    @Test
    public void testTestSortByMaxElement() {
        JaggerArray expected = new JaggerArray(array5, array4, array3, array1, array2);
        JaggerArray actual = new JaggerArray(array1, array2, array3, array4, array5);
        jaggerArrayService.sortByMaxElement(actual, true);
        assertEquals(actual, expected);
    }

    @Test
    public void testSortByMinElement() {
        JaggerArray expected = new JaggerArray(array3, array2, array4, array5, array1);
        JaggerArray actual = new JaggerArray(array1, array2, array3, array4, array5);
        jaggerArrayService.sortByMinElement(actual);
        assertEquals(actual, expected);
    }

    @Test
    public void testTestSortByMinElement() {
        JaggerArray expected = new JaggerArray(array1, array5, array4, array2, array3);
        JaggerArray actual = new JaggerArray(array1, array2, array3, array4, array5);
        jaggerArrayService.sortByMinElement(actual, true);
        assertEquals(actual, expected);
    }
}