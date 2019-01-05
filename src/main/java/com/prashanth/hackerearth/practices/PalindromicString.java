package com.prashanth.hackerearth.practices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromicString {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String inputString = bufferedReader.readLine();
            StringBuilder builder = new StringBuilder();
            for (int i = inputString.length() - 1; i >= 0; i--) {
                builder.append(inputString.charAt(i));
            }

            if(builder.toString().equals(inputString)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
