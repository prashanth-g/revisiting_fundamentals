package com.prashanth.hackerearth.practices;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        scanner.close();

        // #1 -> time: O(n^2) space: O(1)
        for (int i = 2; i < max; i++) {
            int divisorCount = 0;
            for (int j = 1; j < max; j++) {
                if(i%j == 0) {
                    divisorCount +=1;
                }
            }
            if(divisorCount == 2) {
                System.out.println(i);
            }
        }

        // #2 -> time: O(n^2) space: O(1)
        for(int i = 2; i < max; i++) {
            boolean isPrime = true;
            for(int j = 2; j <= i/2; j++) {
                if(i%j==0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.print(i);
            }
        }
    }
}
