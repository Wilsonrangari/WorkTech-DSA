package com.aanchal.basics;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			int num = sc.nextInt();
			
			if(num %2==0) {
				System.out.println("EVEN");
			}
			else {
				System.out.println("ODD");
			}
			t--;
			
			
			
		}
		

	}

}
