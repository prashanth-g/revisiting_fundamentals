package com.prashanth.practices;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountDivisors {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputArray = bufferedReader.readLine().split(" ");
        int start = Integer.parseInt(inputArray[0]);
        int end = Integer.parseInt(inputArray[1]);
        int inputToDivide = Integer.parseInt(inputArray[2]);

        int divisorCount = 0;
        for (int i = start; i <= end ; i++) {
            if(i % inputToDivide ==0) {
                divisorCount++;
            }
        }
        System.out.println(divisorCount);
    }
}
