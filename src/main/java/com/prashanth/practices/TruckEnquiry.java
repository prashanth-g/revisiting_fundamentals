package com.prashanth.practices;

import java.util.Scanner;

public class TruckEnquiry {
    private static final String VOWELS = "AEIOUY";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tag = scanner.nextLine();

        String[] tagChars = tag.split("");
        if ((Integer.parseInt(tagChars[0]) + Integer.parseInt(tagChars[1])) % 2 != 0) { // Check 1, 2
            System.out.println("invalid");
        } else if (VOWELS.contains(tagChars[2])) { // Check 3 is vowel
            System.out.println("invalid");
        } else if ((Integer.parseInt(tagChars[3]) + Integer.parseInt(tagChars[4])) % 2 != 0) { // Check 3, 4
            System.out.println("invalid");
        } else if ((Integer.parseInt(tagChars[4]) + Integer.parseInt(tagChars[5])) % 2 != 0) { // Check 4, 5
            System.out.println("invalid");
        } else if ((Integer.parseInt(tagChars[7]) + Integer.parseInt(tagChars[8])) % 2 != 0) {  // Check 7, 8
            System.out.println("invalid");
        } else {
            System.out.println("valid");
        }
    }
}
