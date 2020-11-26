package by.epam.day4.model.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumberAlgorithmsTest {

    static NumberAlgorithms numberAlgorithms = new NumberAlgorithms();

    @Test
    public void testIsPrimaryPositive() {
        boolean actual = numberAlgorithms.isPrimary(5);
        assertTrue(actual);
    }

    @Test
    public void testIsPrimaryNegative() {
        boolean actual = numberAlgorithms.isPrimary(8);
        assertFalse(actual);
    }

    @Test
    public void testIsFibonacciNumberPositive() {
        boolean actual = numberAlgorithms.isFibonacciNumber(8);
        assertTrue(actual);
    }

    @Test
    public void testIsFibonacciNumberNegative() {
        boolean actual = numberAlgorithms.isFibonacciNumber(10);
        assertFalse(actual);
    }

    @Test
    public void testNoDuplicateDigitsPositive() {
        boolean actual = numberAlgorithms.noDuplicateDigits(123, 3);
        assertTrue(actual);
    }

    @Test
    public void testNoDuplicateDigitsNegative() {
        boolean actual = numberAlgorithms.noDuplicateDigits(133, 3);
        assertFalse(actual);
    }
}