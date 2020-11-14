package com.company;

import java.util.Random;
import java.util.Scanner;

public class problem4_1_3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        System.out.print("Enter the number to find the index: ");
        int number = scanner.nextInt();
        int sum = 0;
        int average;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            if (array[i] == number) {
                System.out.println("The index of " + number + " is " + i);
            } else if (array[i] != number && i == array.length - 1) {
                System.out.println("Please try again.");
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "] ---> " + array[i]);
        }
    }
}

