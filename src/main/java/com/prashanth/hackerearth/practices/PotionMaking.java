package com.prashanth.hackerearth.practices;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PotionMaking {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String ISBN = bufferedReader.readLine();

        if(ISBN.length() < 10 || !isValidInteger(ISBN)) {
            System.out.println("Illegal ISBN");
        } else if(!isValidISBN(ISBN)){
            System.out.println("Illegal ISBN");
        } else {
            System.out.println("Legal ISBN");
        }
    }

    private static boolean isValidISBN(String isbn) {
        int isbnNumbers[] = new int[10];
        String isbnNumberString[] = isbn.split("");
        for (int i = 0; i < isbn.length(); i++) {
            isbnNumbers[i] = Integer.parseInt(isbnNumberString[i]);
        }

        int sum = 0;
        for (int i = 0; i < isbnNumbers.length; i++) {
            sum += isbnNumbers[i] * (i + 1);
        }

        if (sum % 11 == 0) {
            return true;
        }
        return false;
    }

    private static boolean isValidInteger(String isbn) {
        try{
            Integer.parseInt(isbn);
        }
        catch(NumberFormatException ne) {
            return false;
        }
        return true;
    }
}
