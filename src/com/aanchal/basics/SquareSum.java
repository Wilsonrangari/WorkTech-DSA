package com.aanchal.basics;

import java.util.Scanner;

public class SquareSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		
		while(num>0) {
			int x = sc.nextInt();
			int sum =0;
			
			while(x>0) {
				int rem = x%10;
				sum = (int) (sum + Math.pow(rem, 2));
				x = x/10;
			}
			
			num--;
			System.out.println(sum);
		}
		

	}

}
