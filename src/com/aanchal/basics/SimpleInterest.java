package com.aanchal.basics;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double principle = sc.nextDouble();
		double rate = sc.nextDouble();
		double time = sc.nextDouble();
		
		double interest= (principle*rate*time)/100; 
		
		
		//String.format("%.6f", arg) --> it will give fix 6 digits
		System.out.println(String.format("%.6f", interest));
	}

}
