package com.aanchal.basics;

import java.util.Scanner;

public class NumberReversal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.println(reverse(num));

	}

	public static int reverse(int num) {
		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			sum = sum * 10 + rem;
			num = num / 10;
		}

		return sum;
	}

}
