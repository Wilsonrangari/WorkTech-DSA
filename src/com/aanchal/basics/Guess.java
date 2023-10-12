package com.aanchal.basics;

import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();

		while (true) {
			int guess = sc.nextInt();

			if (d == guess) {
				System.out.println("Correct Guess");
				break;
			}
			System.out.println("Incorrect Guess");
		}

	}

}
