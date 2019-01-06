package com.prashanth.practices;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int input = scanner.nextInt();
       System.out.println(factorial(input));
    }

    private static int factorial(int input) {
        if(input == 0) {
            return 0;
        }  else if (input == 1) {
            return 1;
        }
        return input * factorial(input - 1);
    }
}
