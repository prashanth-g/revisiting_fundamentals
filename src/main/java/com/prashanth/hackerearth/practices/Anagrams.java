package com.prashanth.hackerearth.practices;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Anagrams {

    public static void main(String[] args) {
        // Get number of test cases
        Scanner scanner = new Scanner(System.in);
        Map<String, String> stringPair = new HashMap<>();
        // Get test cases count
        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            String firstString = scanner.next();
            String secondString = scanner.next();
            stringPair.put(firstString, secondString);
        }

        Set<Map.Entry<String, String>> entries = stringPair.entrySet();
        entries.stream().forEach((entry) -> {
            findMinRemoval(entry.getKey(), entry.getValue());
        });
    }

    private static void findMinRemoval(String firstString, String secondString) {
        int[] firstStringCount = new int[26];
        int[] secondStringCount = new int[26];
        int minRemovalCount = 0;

        for (int i = 0; i < firstString.length(); i++) {
            firstStringCount[firstString.charAt(i)  - 'a']++;
        }

        for (int i = 0; i < secondString.length(); i++) {
            secondStringCount[secondString.charAt(i)  - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            minRemovalCount += Math.abs(firstStringCount[i] - secondStringCount[i]);
        }
        System.out.println(minRemovalCount);
    }
}
