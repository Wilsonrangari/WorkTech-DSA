package com.aanchal.basics;

import java.util.Scanner;

public class PrintDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); //number of test cases
		
		for(int i =0; i<t; i++) {
			int num = sc.nextInt();
			int firstDigit = num / 10;
			int secondDigit = num%10;
			
			System.out.println(firstDigit+" "+secondDigit);
		}
		
		

		

	}

}
