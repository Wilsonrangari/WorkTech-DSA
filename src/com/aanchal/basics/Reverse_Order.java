package com.aanchal.basics;

import java.util.Scanner;

public class Reverse_Order {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number =  sc.nextInt();
		int arr[] = new int[number];
		for(int i =0 ; i<arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		reverseOrder(arr);
	}
	private static void reverseOrder(int[] arr) {
		for (int i = arr.length-1; i >=0; i--) {
			System.out.print(arr[i]+ " ");
		}
		
	}

}
