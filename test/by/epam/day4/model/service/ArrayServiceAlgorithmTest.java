package by.epam.day4.model.service;

import by.epam.day4.model.entity.IntegerArray;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ArrayServiceAlgorithmTest {
    static ArrayServiceAlgorithm arrayServiceAlgorithm = new ArrayServiceAlgorithm();

    @Test
    public void testFindMax() {
        IntegerArray array = new IntegerArray(1, 3, 6, 8, 5, 6);
        int expected = 8;
        int actual = arrayServiceAlgorithm.findMax(array);
        assertEquals(actual, expected);
    }

    @Test
    public void testFindMin() {
        IntegerArray array = new IntegerArray(1, 3, 6, 8, 5, 6);
        int expected = 1;
        int actual = arrayServiceAlgorithm.findMin(array);
        assertEquals(actual, expected);
    }

    @Test
    public void testFindAllPrimary() {
        IntegerArray array = new IntegerArray(1, 3, 6, 8, 5, 6);
        IntegerArray expected = new IntegerArray(1, 3, 5);
        IntegerArray actual = arrayServiceAlgorithm.findAllPrimary(array);
        assertEquals(actual, expected);
    }

    @Test
    public void testFindAllFibonacci() {
        IntegerArray array = new IntegerArray(1, 3, 6, 8, 5, 6);
        IntegerArray expected = new IntegerArray(1, 3, 8, 5);
        IntegerArray actual = arrayServiceAlgorithm.findAllFibonacci(array);
        assertEquals(actual, expected);
    }

    @Test
    public void testFindAllWithoutDuplicatedDigits() {
        IntegerArray array = new IntegerArray(136, 165, 125, 444, 458);
        IntegerArray expected = new IntegerArray(136, 165, 125, 458);
        IntegerArray actual = arrayServiceAlgorithm.findAllWithoutDuplicatedDigits(array, 3);
        assertEquals(actual, expected);
    }

    @Test
    public void testCalculateSum() {
        IntegerArray array = new IntegerArray(136, 165, 125, 444, 458);
        int expected = 1328;
        int actual = arrayServiceAlgorithm.calculateSum(array);
        assertEquals(actual, expected);
    }

    @Test
    public void testReverse() {
        IntegerArray actual = new IntegerArray(136, 165, 125, 444, 458);
        IntegerArray expected = new IntegerArray(458, 444, 125, 165, 136);
        arrayServiceAlgorithm.reverse(actual);
        assertEquals(actual, expected);
    }

    @Test
    public void testSwap() {
        IntegerArray actual = new IntegerArray(136, 165, 125, 444, 458);
        IntegerArray expected = new IntegerArray(136, 444, 125, 165, 458);
        arrayServiceAlgorithm.swap(actual, 1, 3);
        assertEquals(actual, expected);
    }
}