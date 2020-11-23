package by.epam.day4.controller;

import by.epam.day4.model.entity.Array;
import by.epam.day4.model.entity.JaggerArray;
import by.epam.day4.model.service.ArrayService;
import by.epam.day4.model.service.JaggerArrayService;
import by.epam.day4.veiw.Output;
import by.epam.day4.veiw.Reports;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Output output = new Output();
        try {
            Reports reports = new Reports();
            ArrayService arrayService = new ArrayService();
            JaggerArrayService jaggerArrayService = new JaggerArrayService();
            Array array = new Array(15);
            arrayService.fulfillArrayRandomly(array);
            sb.append("Array fulfilled randomly:\n").append(array);
            arrayService.insertionSort(array);
            logger.warn("Warning, a huge warning");
            sb.append("\n After insertion sorting:\n").append(array);
            sb.append(reports.binarySearchReport(array));
            sb.append(reports.findingMaxAndMinReport(array));
            sb.append(reports.findingAllPrimaryReport(array));
            sb.append(reports.findingAllFibonacciReport(array));
            sb.append(reports.findingAllNoDuplicateAboveThousand(array));

            JaggerArray jaggerArray = new JaggerArray(10, 5);
            for (int i = 0; i < 10; i++){
                arrayService.fulfillArrayRandomly(jaggerArray.getElement(i));
            }
            sb.append("\nJagger Array made randomly: ").append(jaggerArray);
            jaggerArrayService.sortByRowsSum(jaggerArray);
            sb.append("\njagger array, sorted by sum of each row: ").append(jaggerArray);
            jaggerArrayService.sortByMaxElement(jaggerArray);
            sb.append("\njagger array, sorted by max element of each row: ").append(jaggerArray);
            jaggerArrayService.sortByMinElement(jaggerArray);
            sb.append("\njagger array, sorted by min element of each row: ").append(jaggerArray);
        } catch (Exception e){
            logger.error(e.getMessage());
        } finally {
            output.consolePrintLine(sb);
        }
    }
}