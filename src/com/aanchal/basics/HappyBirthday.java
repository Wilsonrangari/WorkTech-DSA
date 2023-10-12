package com.aanchal.basics;

import java.util.Calendar;
import java.util.Scanner;

public class HappyBirthday {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int birthYear =  sc.nextInt();
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - birthYear -3;
        
        System.out.println("Happy Birthday "+name+"! Your current age is "+age);
		
	}

}
