package by.epam.day4.model.service;

import by.epam.day4.exceptions.NotEnoughDataInFileException;
import by.epam.day4.model.entity.IntegerArray;
import by.epam.day4.util.Input;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;

public class ArrayServiceFulfill {
    private static Logger logger = LogManager.getLogger();

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
        int index = 0;
        try(FileInputStream file = new FileInputStream(filename)) {
            int i;
            String buf = "";
            while (file.available() > 0 && index < integerArray.size()) {
                i = file.read();
                if (file.available() == 0 && (char)i != ' '){
                    buf += (char)i;
                }
                if ((char) i == ' ' || file.available() == 0) {
                    int element = Integer.parseInt(buf);
                    integerArray.setElement(index++, element);
                    buf = "";
                } else {
                    buf += (char)i;
                }
            }
            if (index < integerArray.size()) {
                throw new NotEnoughDataInFileException("not enough data in " + filename);
            }
        } catch (IOException | NotEnoughDataInFileException e) {
            logger.error(e.getMessage());
        }
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
