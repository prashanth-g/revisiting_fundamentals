package com.prashanth.hackerearth.practices;

import java.util.Scanner;

public class BricksGame {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int bricksCount = scanner.nextInt();
        scanner.close();

        int remainingBricks = bricksCount;
        for (int i = 1; i <= bricksCount; i++) {
            // For potlu
            if(remainingBricks == 0 || remainingBricks <= i) {
                System.out.println("Patlu");
                break;
            } else {
                remainingBricks = remainingBricks - i;
            }

            // For Motu
            if(remainingBricks < i * 2 || remainingBricks == i * 2) {
                System.out.println("Motu");
                break;
            }
            remainingBricks = remainingBricks - i * 2;
        }
    }
}
