package com.aanchal.basics;

import java.util.Scanner;

public class SevenUp7Down {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t>0) {
			int num = sc.nextInt();
			
			if(num > 7 ) {
				System.out.println("UP");
			}
			else if(num < 7) {
				System.out.println("DOWN");
			}
			else {
				System.out.println("EQUAL");
			}
			
			t--;
		}
	}

}
