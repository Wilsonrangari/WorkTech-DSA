package com.aanchal.basics;

import java.util.Scanner;

public class MaxinMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int m = sc.nextInt(); // Number of rows
        int n = sc.nextInt(); // Number of columns

        int largest = Integer.MIN_VALUE; // Initialize largest as smallest possible value

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int num = sc.nextInt(); // Read the next number
                if (num > largest) {
                    largest = num; // Update largest if current number is greater
                }
            }
        }

        System.out.println(largest); // Print the largest number

        sc.close(); // Close the scanner when done
    }
}