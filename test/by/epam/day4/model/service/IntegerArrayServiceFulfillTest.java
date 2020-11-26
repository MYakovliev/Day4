package by.epam.day4.model.service;

import by.epam.day4.model.entity.IntegerArray;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IntegerArrayServiceFulfillTest {
    static ArrayServiceFulfill arrayServiceFulfill = new ArrayServiceFulfill();
    @Test
    public void testFulfillArrayFromFilePositive() {
        IntegerArray expected = new IntegerArray(21, 12, 45, 78, 52);
        IntegerArray actual = new IntegerArray(5);
        arrayServiceFulfill.fulfillArrayFromFile("data\\data.txt", actual);
        assertEquals(actual, expected);
    }

    @Test
    public void testFulfillArrayFromFileNegative() {
        IntegerArray expected = new IntegerArray(21, 12, 45, 78, 52, 12);
        IntegerArray actual = new IntegerArray(6);
        arrayServiceFulfill.fulfillArrayFromFile("data\\data.txt", actual);
        assertNotEquals(actual, expected);
    }

}