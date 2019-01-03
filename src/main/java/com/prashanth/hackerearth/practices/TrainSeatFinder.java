package com.prashanth.hackerearth.practices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrainSeatFinder {
    public static void main(String[] args) {
        // Get the number of test cases
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        List<Integer> seats = new ArrayList<>();
        for (int i = 0; i < testCases; i++) {
            int seatNumber = scanner.nextInt();
            seats.add(seatNumber);
        }
        seats.stream().forEach(TrainSeatFinder::findOppositeSeat);
    }

    private static void findOppositeSeat(int seatNumber) {
        int temp = seatNumber % 12;
        final String windowSeat = "WS";
        final String middleSeat = "MS";
        final String aisleSeat = "AS";
        int oppositeSeatNumber = 0;
        String oppositeSeatType = "";
        switch (temp) {
            case 0:
                oppositeSeatNumber = seatNumber - 11;
                oppositeSeatType = windowSeat;
                break;
            case 1:
                oppositeSeatNumber = seatNumber + 11;
                oppositeSeatType = windowSeat;
                break;
            case 2:
                oppositeSeatNumber = seatNumber + 9;
                oppositeSeatType = middleSeat;
                break;
            case 3:
                oppositeSeatNumber = seatNumber + 7;
                oppositeSeatType = aisleSeat;
                break;
            case 4:
                oppositeSeatNumber = seatNumber + 5;
                oppositeSeatType = aisleSeat;
                break;
            case 5:
                oppositeSeatNumber = seatNumber + 3;
                oppositeSeatType = middleSeat;
                break;
            case 6:
                oppositeSeatNumber = seatNumber + 1;
                oppositeSeatType = windowSeat;
                break;
            case 7:
                oppositeSeatNumber = seatNumber - 1;
                oppositeSeatType = windowSeat;
                break;
            case 8:
                oppositeSeatNumber = seatNumber - 3;
                oppositeSeatType = middleSeat;
                break;
            case 9:
                oppositeSeatNumber = seatNumber - 5;
                oppositeSeatType = aisleSeat;
                break;
            case 10:
                oppositeSeatNumber = seatNumber - 7;
                oppositeSeatType = aisleSeat;
                break;
            case 11:
                oppositeSeatNumber = seatNumber - 9;
                oppositeSeatType = middleSeat;
                break;
        }
        System.out.println(oppositeSeatNumber + " " + oppositeSeatType);
    }
}
