package com.prashanth.practices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CharactersCount {

    private static final int MAX_CHAR_SIZE = 256;

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String inputString = bufferedReader.readLine();
            int[] count = new int[MAX_CHAR_SIZE];
            for (int i = 0; i < inputString.length(); i++) {
                count[inputString.charAt(i)]++;
            }

            List<Character> characterList = new ArrayList<>();
            for (int i = 0; i < inputString.length(); i++) {
                if(!characterList.contains(inputString.charAt(i))) {
                    System.out.println(inputString.charAt(i) +" : "+count[inputString.charAt(i)]);
                    characterList.add(inputString.charAt(i));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
