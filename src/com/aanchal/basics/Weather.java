package com.aanchal.basics;

import java.util.Scanner;

public class Weather {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int t = sc.nextInt();
		while(t>0) {
			int temp= sc.nextInt();
			int humidity = sc.nextInt();
			if(temp >= 30 && humidity >= 90) {	
				System.out.println("Hot and Humid");
			}
			else if(temp >= 30 && humidity < 90) {
				System.out.println("Hot");	
			}
			else if(temp < 30 && humidity >= 90) {
				System.out.println("Cool and Humid");	
			}
			else {
				System.out.println("Cool");
			}
			t--;
		}

	}

}
