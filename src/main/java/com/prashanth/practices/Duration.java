package com.prashanth.practices;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Duration {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String testCases = bufferedReader.readLine();
        List<String> timeDifferences = new ArrayList<>();
        for (int i = 0; i < Integer.parseInt(testCases); i++) {
            String timeInput = bufferedReader.readLine();
            String timeInputArray[] = timeInput.split(" ");
            int firstTime = Integer.parseInt(timeInputArray[0]) * 60 + Integer.parseInt(timeInputArray[1]) ;
            int secondTime = Integer.parseInt(timeInputArray[2]) * 60 + Integer.parseInt(timeInputArray[3]) ;
            int timeDifference = secondTime - firstTime;
            timeDifferences.add((timeDifference / 60)+" "+(timeDifference % 60));
        }
        timeDifferences.stream().forEach(timeDifference -> {
            System.out.println(timeDifference);
        });
    }
}
