package by.epam.day4.veiw;

import by.epam.day4.model.entity.IntegerArray;
import by.epam.day4.model.service.ArrayServiceAlgorithm;
import by.epam.day4.model.service.ArrayServiceSearch;

import java.util.Random;

public class Reports {
    private static ArrayServiceAlgorithm arrayServiceAlgorithm = new ArrayServiceAlgorithm();
    private static ArrayServiceSearch arrayServiceSearch = new ArrayServiceSearch();

    public String binarySearchReport(IntegerArray integerArray) {
        int element = new Random().nextInt(1000);
        int index = arrayServiceSearch.searchElementIndexBinary(integerArray, element);
        StringBuilder sb = new StringBuilder("Searching for ").append(element);
        sb.append(" in Array... \n The result is ").append(index == -1 ? "not found" : "by index ").append(index);
        return sb.toString();
    }

    public String findingMaxAndMinReport(IntegerArray integerArray){
        StringBuilder sb = new StringBuilder();
        int max = arrayServiceAlgorithm.findMax(integerArray);
        int min = arrayServiceAlgorithm.findMin(integerArray);
        sb.append("\nMaximal number in array: ").append(max);
        sb.append(" Minimal number in array: ").append(min);
        return sb.toString();
    }

    public String findingAllPrimaryReport(IntegerArray integerArray){
        StringBuilder sb = new StringBuilder();
        IntegerArray integerArray1 = arrayServiceAlgorithm.findAllPrimary(integerArray);
        sb.append("\nAll primary numbers in array: ").append(integerArray1);
        return sb.toString();
    }

    public String findingAllFibonacciReport(IntegerArray integerArray){
        StringBuilder sb = new StringBuilder();
        IntegerArray integerArray1 = arrayServiceAlgorithm.findAllFibonacci(integerArray);
        sb.append("\nAll fibonacci numbers in array:").append(integerArray1);
        return sb.toString();
    }

    public String findingAllNoDuplicateAboveThousand(IntegerArray integerArray){
        StringBuilder sb = new StringBuilder();
        IntegerArray integerArray1 = arrayServiceAlgorithm.findAllWithoutDuplicatedDigits(integerArray, 3);
        sb.append("\nAll numbers above thousand in array that has no duplicated numbers").append(integerArray1);
        return sb.toString();
    }


}
