package by.epam.day4.tasks.veiw;

import by.epam.day4.tasks.model.entity.Array;
import by.epam.day4.tasks.model.service.ArrayService;

import java.util.Random;

public class Reports {
    private static ArrayService arrayService = new ArrayService();

    public String binarySearchReport(Array array) {
        int element = new Random().nextInt();
        int index = arrayService.findElementIndexBinary(array, element);
        StringBuilder sb = new StringBuilder("Searching for ").append(element);
        sb.append(" in Array... \n The result is ").append(index == -1 ? "not found" : "by index ").append(index);
        return sb.toString();
    }

    public String findingMaxAndMinReport(Array array){
        StringBuilder sb = new StringBuilder();
        int max = arrayService.findMax(array);
        int min = arrayService.findMin(array);
        sb.append("\nMaximal number in array: ").append(max);
        sb.append(" Minimal number in array: ").append(min);
        return sb.toString();
    }

    public String findingAllPrimaryReport(Array array){
        StringBuilder sb = new StringBuilder();
        Array array1 = arrayService.findAllPrimary(array);
        sb.append("\nAll primary numbers in array: ").append(array1);
        return sb.toString();
    }

    public String findingAllFibonacciReport(Array array){
        StringBuilder sb = new StringBuilder();
        Array array1 = arrayService.findAllFibonacci(array);
        sb.append("\nAll fibonacci numbers in array:").append(array1);
        return sb.toString();
    }

    public String findingAllNoDuplicateAboveThousand(Array array){
        StringBuilder sb = new StringBuilder();
        Array array1 = arrayService.findAllWithoutDuplicatedDigits(array, 3);
        sb.append("\nAll numbers above thousand in array that has no duplicated numbers").append(array1);
        return sb.toString();
    }


}
