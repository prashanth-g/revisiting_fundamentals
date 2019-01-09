package com.prashanth.practices;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class HorlicksCircle {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfDays = Integer.parseInt(bufferedReader.readLine());

        List<List<Integer>> completeInput = new ArrayList<>();
        for (int i = 0; i < numberOfDays; i++) {
            String[] inputString = bufferedReader.readLine().split(" ");
            List<Integer> dayList = new ArrayList<>();
            dayList.add(Integer.parseInt(inputString[0]));
            dayList.add(Integer.parseInt(inputString[1]));
            completeInput.add(dayList);
        }

        int totalToffees = 0;
        for (List<Integer> dailyActivityList: completeInput) {
            int radius = dailyActivityList.get(0);
            int amountOfHorlicks = dailyActivityList.get(1);
            double circumference = 2 * (22.0/7) * radius;
            double totalDistance = amountOfHorlicks * 100;
            if(totalDistance > circumference) {
                totalToffees++;
            }
        }

        System.out.println(totalToffees);
    }
}
