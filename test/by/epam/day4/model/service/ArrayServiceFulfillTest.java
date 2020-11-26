package by.epam.day4.model.service;

import by.epam.day4.model.entity.Array;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayServiceFulfillTest {
    static ArrayServiceFulfill arrayServiceFulfill = new ArrayServiceFulfill();
    @Test
    public void testFulfillArrayFromFilePositive() {
        Array expected = new Array(21, 12, 45, 78, 52);
        Array actual = new Array(5);
        arrayServiceFulfill.fulfillArrayFromFile("data.txt", actual);
        assertEquals(actual, expected);
    }

    @Test
    public void testFulfillArrayFromFileNegative() {
        Array expected = new Array(21, 12, 45, 78, 52, 12);
        Array actual = new Array(6);
        arrayServiceFulfill.fulfillArrayFromFile("data.txt", actual);
        assertNotEquals(actual, expected);
    }

}