package com.prashanth.practices;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ToggleString {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputString = bufferedReader.readLine();

        StringBuilder builder = new StringBuilder();
        String[] inputStringArray = inputString.split("");
        for (int i = 0; i < inputString.length(); i++) {
            if(inputStringArray[i].toLowerCase().equals(inputStringArray[i])) { // if input is lowercase
                builder.append(inputStringArray[i].toUpperCase());
            } else{
                builder.append(inputStringArray[i].toLowerCase());
            }
        }

        System.out.println(builder.toString());
    }
}
