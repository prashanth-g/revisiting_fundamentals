package com.prashanth.practices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FindProduct {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int numbers[] = new int[N];
        String s = "";// bufferedReader.readLine();

        String strings[] = s.split(" ");
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(strings[i]);
        }

        long result = 1;
        for (int i = 0; i < N; i++) {
            result = ( result *  numbers[i] ) % ((long) Math.pow(10, 9) + 7);
        }
        System.out.println(result);
    }
}
