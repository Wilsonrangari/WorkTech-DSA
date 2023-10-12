package com.aanchal.basics;

import java.util.Scanner;

public class SquareTheNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t= sc.nextInt();
		
		for (int i = 0; i < t; i++) {
            // Read the next number
            int ni = sc.nextInt();

            // Calculate the square
            int si = ni * ni;

            // Print the square
            System.out.println(si);
        }

        // Close the scanner when done
        sc.close();

	}

}
