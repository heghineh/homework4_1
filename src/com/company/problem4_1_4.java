package com.company;

import java.util.Random;
import java.util.Scanner;

public class problem4_1_4 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int[] copyArray = new int[array.length-1];
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        for(int i=0; i< array.length; i++){
            array[i] = random.nextInt(10);
        }

        for(int i=0; i< array.length; i++){
            System.out.print(array[i] + ", ");
        }
        for(int i=0; i< array.length; i++){
           if(number == array[i]){
               continue;
           }
        }
        System.out.println();
        for(int i=0; i< array.length; i++){
            System.out.print(array[i] + ", ");
        }

    }
}
