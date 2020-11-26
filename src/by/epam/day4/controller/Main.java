package by.epam.day4.controller;

import by.epam.day4.model.entity.IntegerArray;
import by.epam.day4.model.entity.JaggerArray;
import by.epam.day4.model.service.ArrayServiceFulfill;
import by.epam.day4.model.service.ArrayServiceSorting;
import by.epam.day4.model.service.JaggerArrayService;
import by.epam.day4.veiw.Output;
import by.epam.day4.veiw.Reports;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;


public class Main {
    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Output output = new Output();
        try {
            ArrayServiceFulfill arrayServiceFulfill = new ArrayServiceFulfill();
            Reports reports = new Reports();
            ArrayServiceSorting arrayServiceSorting = new ArrayServiceSorting();
            JaggerArrayService jaggerArrayService = new JaggerArrayService();
            IntegerArray integerArray = new IntegerArray(15);
            arrayServiceFulfill.fulfillArrayRandomly(integerArray, 1000);
            sb.append("Array fulfilled randomly:\n").append(integerArray);
            arrayServiceSorting.insertionSort(integerArray);
            logger.warn("Warning, a huge warning");
            sb.append("\n After insertion sorting:\n").append(integerArray);
            sb.append(reports.binarySearchReport(integerArray));
            sb.append(reports.findingMaxAndMinReport(integerArray));
            sb.append(reports.findingAllPrimaryReport(integerArray));
            sb.append(reports.findingAllFibonacciReport(integerArray));
            sb.append(reports.findingAllNoDuplicateAboveThousand(integerArray));

            JaggerArray jaggerArray = new JaggerArray(10, 5);
            Random random = new Random();
            for (int i = 0; i < 10; i++){
                for (int j = 0; j < 5; j++) {
                    jaggerArray.setElement(i, j, random.nextInt(1000));
                }
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
