package by.epam.day4.tasks.util;

import by.epam.day4.tasks.exceptions.NotEnoughDataInFileException;
import by.epam.day4.tasks.model.entity.Array;
import by.epam.day4.tasks.veiw.Output;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

    public Array getIntArrayFromFile(String filename, int amount) {
        Array array = new Array(amount);
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
                    array.setElement(index++, element);
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

        return array;
    }
}
