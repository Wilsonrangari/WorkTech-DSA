package com.aanchal.basics;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t > 0) {
			double temp = sc.nextDouble();

			double tempInFahrenheit = ((9 * temp) / 5.0) + 32;
			DecimalFormat df = new DecimalFormat("#.00");
			String ans = df.format(tempInFahrenheit);
			System.out.println(ans);
			t--;
		}

	}

}
