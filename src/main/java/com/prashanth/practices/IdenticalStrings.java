package com.prashanth.practices;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class IdenticalStrings {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(bufferedReader.readLine());

        List<List<String>> stringPair = new ArrayList<>();
        for (int i = 0; i < testCases; i++) {
            String[] inputString = bufferedReader.readLine().split(" ");
            List<String> dimensionList = new ArrayList<>();
            dimensionList.add(inputString[0]);
            dimensionList.add(inputString[1]);
            stringPair.add(dimensionList);
        }

        stringPair.stream().forEach(entry -> {
            findMatchingString(entry.get(0), entry.get(1));
        });
    }

    private static void findMatchingString(String firstString, String secondString) {
        int firstStringCount[] = new int[26];
        int secondStringCount[] = new int[26];
        int removalCount = 0;
        for (int i = 0; i < firstString.length(); i++) {
            firstStringCount[firstString.charAt(i) - 'a']++;
        }
        for (int i = 0; i < secondString.length(); i++) {
            secondStringCount[secondString.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            removalCount += Math.abs(firstStringCount[i] - secondStringCount[i]);
        }

        if(removalCount == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
