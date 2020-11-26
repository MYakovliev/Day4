package by.epam.day4.model.service;

import by.epam.day4.model.entity.Array;
import by.epam.day4.util.Input;

import java.util.Random;

public class ArrayServiceFulfill {

    public void fulfillArrayFromConsole(Array array) {
        Input input = new Input();
        int a = input.getIntFromConsole("Enter " + array.size() + " integer numbers: ");
        for (int i = 0; i < array.size(); i++) {
            array.setElement(i, a);
            if (a != array.size() - 1) {
                a = input.getIntFromConsole();
            }
        }
    }

    public void fulfillArrayFromFile(String filename, Array array) {
        Input input = new Input();
        input.getIntArrayFromFile(filename, array);
    }

    public void fulfillArrayRandomly(Array array) {
        Random random = new Random();
        for (int i = 0; i < array.size(); i++) {
            int num = random.nextInt();
            array.setElement(i, num);
        }
    }

    public void fulfillArrayRandomly(Array array, int end) {
        Random random = new Random();
        for (int i = 0; i < array.size(); i++) {
            int num = random.nextInt(end);
            array.setElement(i, num);
        }
    }

    public void fulfillArrayRandomly(Array array, int start, int end) {
        Random random = new Random();
        for (int i = 0; i < array.size(); i++) {
            int num = random.nextInt() % end + start;
            array.setElement(i, num);
        }
    }
}
