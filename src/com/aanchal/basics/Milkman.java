package com.aanchal.basics;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Milkman {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int radius = sc.nextInt();
		int height = sc.nextInt();
		sc.close();
		
		
		double vol= 3.14*radius*radius*height;
			
		//String que =String.format("%.2f", vol);
		  // Format the output to two decimal places
        DecimalFormat df = new DecimalFormat("#.00");
		
		
		//double number = Double.parseDouble(que);
		
		double cost;
		
		if(vol> 1000) {
			
			cost= (vol*40)/1000;
			System.out.println(df.format(cost));
		}
		else {
			cost =((vol*40)/1000);
			System.out.println(df.format(cost));
		}
		
		
	

	}

}
