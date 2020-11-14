package com.company;

import java.util.Random;

public class problem4_1_2 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[10];
        int sum = 0;
        int average;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            sum = sum + array[i];
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

        average = sum / array.length;
        System.out.println("\nThe sum is " + sum + "\nThe average is " + average);
    }
}
