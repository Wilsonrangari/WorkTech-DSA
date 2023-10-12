package com.aanchal.basics;

import java.util.Scanner;

public class candies {

	public static void main(String[] args) {
		
//		int divident = 35;
//		int divisor = 10;
		Scanner sc =new Scanner(System.in);
		
		int divident = sc.nextInt();
		int divisor = sc.nextInt();
		
		
		
		if(divident % divisor == 0) {
			//int result = divident/divisor;
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		

	}

}
