package com.prashanth.practices;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class ProfilePicture {

    private static int minLength = 0;

    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        minLength = Integer.parseInt(bufferedReader.readLine());
        int numberOfImages = Integer.parseInt(bufferedReader.readLine());

        List<List<Integer>> dimensions = new ArrayList<>();

        for (int i = 0; i < numberOfImages; i++) {
            String[] dimension = bufferedReader.readLine().split(" ");
           List<Integer> dimensionList = new ArrayList<>();
                dimensionList.add(Integer.parseInt(dimension[0]));
                dimensionList.add(Integer.parseInt(dimension[1]));
                dimensions.add(dimensionList);
        }

        dimensions.stream().forEach(dimension -> {
            isValidPhoto(dimension.get(0), dimension.get(1));
        });

    }

    private static void isValidPhoto(int width, int height) {
        if (width < minLength || height < minLength) {
            System.out.println("UPLOAD ANOTHER");
        } else if(width >= minLength && height >= minLength) {
            if (width == height) {
                System.out.println("ACCEPTED");
            } else {
                System.out.println("CROP IT");
            }
        }
    }
}
