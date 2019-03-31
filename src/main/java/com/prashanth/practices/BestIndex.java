package com.prashanth.practices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Tried to be readable
public class BestIndex {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbersArray = new int[n];
        scanner.nextLine();
        String[] temp = scanner.nextLine().split(" ");
        for(int i = 0; i < n; i++)
            numbersArray[i] = Integer.parseInt(temp[i]);
        scanner.close();

        List<Integer> specialSum = new ArrayList<>();
        for (int i = 0; i < numbersArray.length; i++) {
            int posIndex = i;
            int numbersToFind = 1;
            int usedNumbers = 0;
            int remaining = numbersArray.length - (posIndex);
            int indexSum = findSpecialSumOfIndex(posIndex, usedNumbers, numbersToFind, remaining, numbersArray, 0);

            specialSum.add(indexSum);
        }

        System.out.println(Collections.max(specialSum));
    }

    private static Integer findSpecialSumOfIndex(
            int posIndex,
            int usedNumbers,
            int numbersToFind,
            int remaining,
            int[] numbersArray, int sum) {

        if (numbersToFind <= remaining) {
            if (numbersToFind == 1) {
                sum += numbersArray[posIndex];
                posIndex = posIndex + 1;
            } else {
                for (int i = posIndex; i < posIndex + numbersToFind; i++) {
                    sum += numbersArray[i];
                }
                posIndex = posIndex + numbersToFind;
            }

            usedNumbers = usedNumbers + numbersToFind;
            numbersToFind = numbersToFind + 1;
            remaining = numbersArray.length - (posIndex);
            return findSpecialSumOfIndex(posIndex, usedNumbers, numbersToFind, remaining, numbersArray, sum);
        }
        else {
            return sum;
        }
    }
}
