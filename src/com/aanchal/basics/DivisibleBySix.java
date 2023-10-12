package com.aanchal.basics;

import java.util.Scanner;

public class DivisibleBySix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); //number of test cases
		
		while(t>0) {
			int num = sc.nextInt();
			if(num % 6 ==0 ) {
				System.out.println("True");
			}
			else {
				System.out.println("False");
			}
			t--;
		}

	}

}
