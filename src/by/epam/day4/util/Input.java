package by.epam.day4.util;

import by.epam.day4.exceptions.NotEnoughDataInFileException;
import by.epam.day4.model.entity.IntegerArray;
import by.epam.day4.veiw.Output;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Logger logger =  LogManager.getLogger();

    public int getIntFromConsole(){
        return scanner.nextInt();
    }

    public int getIntFromConsole(String msg){
        Output output = new Output();
        output.consolePrint(msg);
        return getIntFromConsole();
    }

    public void getIntArrayFromFile(String filename, IntegerArray integerArray) {

    }
}
