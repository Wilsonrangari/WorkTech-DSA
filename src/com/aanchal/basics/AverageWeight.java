package com.aanchal.basics;

import java.text.DecimalFormat;

import java.util.Scanner;

public class AverageWeight {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double sum=0 ;
		
		double arr[] = new double[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]= sc.nextDouble();
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			sum = sum + arr[i];
			
		}
		DecimalFormat df = new DecimalFormat("#.000000");
		System.out.println(df.format(sum/10));

	}

}
