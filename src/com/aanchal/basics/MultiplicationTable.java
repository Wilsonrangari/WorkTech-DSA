package com.aanchal.basics;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int num= sc.nextInt();
			
			for (int i = 1; i <=10 ; i++) {
				System.out.print(i*num+" ");
			}
			
			t--;
		}

	}

}
