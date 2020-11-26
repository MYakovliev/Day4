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
        int amount = integerArray.size();
        int index = 0;
        try(FileInputStream file = new FileInputStream(filename)) {
            int i;
            String buf = "";
            while (file.available() > 0 && index < amount) {
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
            if (index < amount) {
                throw new NotEnoughDataInFileException("not enough data in " + filename);
            }
        } catch (IOException | NotEnoughDataInFileException e) {
            logger.error(e.getMessage());
        }
    }
}
