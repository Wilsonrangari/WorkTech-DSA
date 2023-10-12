package com.aanchal.basics;

import java.util.Scanner;

public class AddOne {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		int age = sc.nextInt();
		
		
		System.out.println("Hello "+name+"! Next year, you will be " + (age+1)+" years old");

	}

}
