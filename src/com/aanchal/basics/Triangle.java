package com.aanchal.basics;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t>0) {
			int L1 = sc.nextInt();
			int L2 = sc.nextInt();
			int L3 = sc.nextInt();
			
			
			if(isvalidTriangle(L1,L2,L3)) {
				int circumference = L1 + L2 + L3;
                System.out.println(circumference);
			}
			else {
				System.out.println("-1");
			}
			
			t--;
		}

	}
	public static boolean isvalidTriangle(int L1, int L2, int L3) {
		return (L1+L2 > L3) && (L1+L3 > L2) && (L2+L3 > L1)  ;
	}

}
