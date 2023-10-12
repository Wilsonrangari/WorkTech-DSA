package com.aanchal.basics;

import java.util.Scanner;

public class WinOrLose {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int n =sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0 ; i<n ;i++) {
			 arr[i]= sc.nextInt();
			
		}
		
		int max=arr[0];
		
		for(int i =1; i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];	
			}
		}
		if(max % 2 == 0) {
			System.out.println("WON");
		}
		else {System.out.println("LOST");}
		
		
		
	}

}
