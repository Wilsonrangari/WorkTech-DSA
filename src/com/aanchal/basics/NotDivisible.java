package com.aanchal.basics;

import java.util.Scanner;

public class NotDivisible {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t > 0) {
			int x = sc.nextInt();
			for (int i = 1; i <= x; i++) {
			
				if(i % 3 != 0) {
					System.out.print(i+" ");
				} 

			}
			System.out.println();

			t--;
		}

	}

}
