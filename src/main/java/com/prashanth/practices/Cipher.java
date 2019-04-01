package com.prashanth.practices;

import java.util.Scanner;

public class Cipher {

    private static final String[] alphabets = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
            "l", "m", "n", "o", "p", "q", "r", "s",
            "t", "u", "v", "w", "x", "y", "z" };

    private static String getAlphabetReplacement(String ch, int key) {

        for (int i = 0; i < alphabets.length; i++) {
            if (ch.equals(alphabets[i])) {
                return alphabets[getOverflowed(key, i)];
            } else if (ch.equals(alphabets[i].toUpperCase())) {
                return alphabets[getOverflowed(key, i)].toUpperCase();
            }
        }
        return null;
    }

    private static int getOverflowed(int key, int i) {
        return (i + key) % alphabets.length;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String message = scanner.next();
        int key = scanner.nextInt();
        scanner.close();

        StringBuilder builder = new StringBuilder();
        for (char c : message.toCharArray()) {
            if(Character.isLetter(c)) { // Alphabets: Replace with Alphabet + key
                builder.append(getAlphabetReplacement(String.valueOf(c), key));
            } else if(Character.isDigit(c)) {// Numbers: Sum with key and get the last digit
                int numberCode = Character.getNumericValue(c);
                builder.append((numberCode + key) % 10);
            } else {
                builder.append(c); // Other Chars: Do nothing
            }
        }
        System.out.println(builder.toString());
    }
}
