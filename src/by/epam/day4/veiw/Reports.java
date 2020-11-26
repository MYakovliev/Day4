package by.epam.day4.veiw;

import by.epam.day4.model.entity.Array;
import by.epam.day4.model.service.ArrayServiceAlgorithm;
import by.epam.day4.model.service.ArrayServiceSearch;

import java.util.Random;

public class Reports {
    private static ArrayServiceAlgorithm arrayServiceAlgorithm = new ArrayServiceAlgorithm();
    private static ArrayServiceSearch arrayServiceSearch = new ArrayServiceSearch();

    public String binarySearchReport(Array array) {
        int element = new Random().nextInt(1000);
        int index = arrayServiceSearch.searchElementIndexBinary(array, element);
        StringBuilder sb = new StringBuilder("Searching for ").append(element);
        sb.append(" in Array... \n The result is ").append(index == -1 ? "not found" : "by index ").append(index);
        return sb.toString();
    }

    public String findingMaxAndMinReport(Array array){
        StringBuilder sb = new StringBuilder();
        int max = arrayServiceAlgorithm.findMax(array);
        int min = arrayServiceAlgorithm.findMin(array);
        sb.append("\nMaximal number in array: ").append(max);
        sb.append(" Minimal number in array: ").append(min);
        return sb.toString();
    }

    public String findingAllPrimaryReport(Array array){
        StringBuilder sb = new StringBuilder();
        Array array1 = arrayServiceAlgorithm.findAllPrimary(array);
        sb.append("\nAll primary numbers in array: ").append(array1);
        return sb.toString();
    }

    public String findingAllFibonacciReport(Array array){
        StringBuilder sb = new StringBuilder();
        Array array1 = arrayServiceAlgorithm.findAllFibonacci(array);
        sb.append("\nAll fibonacci numbers in array:").append(array1);
        return sb.toString();
    }

    public String findingAllNoDuplicateAboveThousand(Array array){
        StringBuilder sb = new StringBuilder();
        Array array1 = arrayServiceAlgorithm.findAllWithoutDuplicatedDigits(array, 3);
        sb.append("\nAll numbers above thousand in array that has no duplicated numbers").append(array1);
        return sb.toString();
    }


}
