package com.aanchal.basics;

import java.util.Scanner;

public class HighFever {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		while(n>0) {
			
			String name = sc.next();
			double temp =sc.nextDouble();
			
			if(temp >98.6 && n >=2) {
				
				System.out.print(name+", ");
			}
			else if(temp >98.6 && n >= 1) {
				System.out.println(name);
			}
			
			n--;
		}
	}

}
