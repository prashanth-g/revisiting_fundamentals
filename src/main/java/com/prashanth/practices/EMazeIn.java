package com.prashanth.practices;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EMazeIn {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String path = bufferedReader.readLine();

        int x = 0;
        int y = 0;
        // X axis movements L, R
        // Y axis movements D, U
        for (char direction: path.toCharArray()) {
            if(direction == 'L') {
                x -= 1;
            } else if (direction == 'R') {
                x += 1;
            } else if (direction == 'U') {
                y += 1;
            } else {
                y -= 1;
            }
        }

        System.out.println(x+" "+y);
    }
}
