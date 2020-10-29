/**
 * Author: Mohanad Albadri
 * Sub:Classwork Day 4 - Loops and Arrays
 * Date : 29-10-2020
 */

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //A1: Write a program, that prints integers (whole numbers) from 1 to 100.
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
        //A2. Write a program that prints all even numbers between 2 and 100. Example output:
        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }


        //A3. Write a program that asks the user for the first number and the last number and then prints odd numbers between those two.
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter the first NO");
        int n1 = sca.nextInt();
        System.out.println("Enter the second NO");
        int n2 = sca.nextInt();
        for (int j = n1; j <= n2; j++) {

            if (j % 2 != 0) {
                System.out.println(j);
            }

        }


        //A4. Write a program that calculates the sum 1+2+3+…+n where n is a number entered by the user.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the NO");
        int no = sc.nextInt();
        int result = 0;
        for (int k = 1; k <= no; k++) {

            result = result + k;
        }
        System.out.println("the sum is:" + result);


        //A5.Find all occurrences of X in a number array*(i didn't solve it i need more time)
        int list[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1};


        //A6. Fill and Print an array

        int[] arr = new int[10];
        Scanner se = new Scanner(System.in);

        System.out.print("Enter 10 integers of array");

        for (int p = 0; p < 10; p++) {
            arr[p] = se.nextInt();
        }
        System.out.println("You have entered");

        for (int s = 0; s < 10; s++) {
            System.out.print(arr[s]);


            int[] arr1 = new int[10];
            Scanner sce = new Scanner(System.in);

            System.out.println("Enter 10 integers of array");

            for (int l = 0; l < 10; l++) {
                arr1[l] = sc.nextInt();
            }
            System.out.println("the reverse array");
            try {
                for (int m = arr1.length - 1; m < 10; m--) {
                    System.out.println(arr1[m]);

                }

            } catch (Exception e) {
                System.out.println("");
            }
        }
    }
}

