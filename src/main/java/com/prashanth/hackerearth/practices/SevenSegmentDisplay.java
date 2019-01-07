package com.prashanth.hackerearth.practices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SevenSegmentDisplay {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        List<String> numberWithSticks = new ArrayList<>();
        for (int i = 0; i < testCases; i++) {
            String inputNumber = scanner.next();
            numberWithSticks.add(inputNumber);
        }
        scanner.close();
        numberWithSticks.stream().forEach(number -> {
            findMaxNumber(number);
        });
    }

    private static void findMaxNumber(String inputNumber) {
        int totalSticks = 0;
        if(inputNumber.length() > 1) {
            // Split and find the count
            String[] numbers = inputNumber.split("");
            for (int i = 0; i < numbers.length; i++) {
                totalSticks += findSticksCountFromLookup(numbers[i]);
            }
        } else {
            totalSticks = findSticksCountFromLookup(inputNumber);
        }
        // Find the max number to print in the display
        StringBuilder result = new StringBuilder();
        if(totalSticks % 2 == 0) {
            int numberOfOnes = totalSticks / 2;
            for (int i = 0; i < numberOfOnes; i++) {
                result.append("1");
            }
        } else {
            int totalSticksUpdated = totalSticks - 3;
            result.append("7");
            if (totalSticksUpdated > 0) {
                int numberOfOnes = totalSticksUpdated / 2;
                for (int i = 0; i < numberOfOnes; i++) {
                    result.append("1");
                }
            }
        }
        System.out.println(result.toString());
    }

    private static int findSticksCountFromLookup(String inputNumber) {
        // Can use maps
        switch (inputNumber) {
            case "0":
                return  6;
            case "1":
                return  2;
            case "2":
                return  5;
            case "3":
                return  5;
            case "4":
                return  4;
            case "5":
                return  5;
            case "6":
                return  6;
            case "7":
                return  3;
            case "8":
                return  7;
            case "9":
                return  6;
        }
        return 0;
    }
}
