package com.aanchal.basics;

import java.util.Scanner;

public class DigitSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		while (t > 0) {
			int n = sc.nextInt();
			System.out.println(digitSum(n));
			t--;
		}

	}

	private static int digitSum(int n) {
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}
		return sum;

	}

}
