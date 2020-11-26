package by.epam.day4.model.service;

import by.epam.day4.model.entity.IntegerArray;
import by.epam.day4.util.Input;

import java.util.Random;

public class ArrayServiceFulfill {

    public void fulfillArrayFromConsole(IntegerArray integerArray) {
        Input input = new Input();
        int a = input.getIntFromConsole("Enter " + integerArray.size() + " integer numbers: ");
        for (int i = 0; i < integerArray.size(); i++) {
            integerArray.setElement(i, a);
            if (a != integerArray.size() - 1) {
                a = input.getIntFromConsole();
            }
        }
    }

    public void fulfillArrayFromFile(String filename, IntegerArray integerArray) {
        Input input = new Input();
        input.getIntArrayFromFile(filename, integerArray);
    }

    public void fulfillArrayRandomly(IntegerArray integerArray) {
        Random random = new Random();
        for (int i = 0; i < integerArray.size(); i++) {
            int num = random.nextInt();
            integerArray.setElement(i, num);
        }
    }

    public void fulfillArrayRandomly(IntegerArray integerArray, int end) {
        Random random = new Random();
        for (int i = 0; i < integerArray.size(); i++) {
            int num = random.nextInt(end);
            integerArray.setElement(i, num);
        }
    }

    public void fulfillArrayRandomly(IntegerArray integerArray, int start, int end) {
        Random random = new Random();
        for (int i = 0; i < integerArray.size(); i++) {
            int num = random.nextInt() % end + start;
            integerArray.setElement(i, num);
        }
    }
}
