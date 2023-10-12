package com.aanchal.basics;

import java.util.Scanner;

public class OutputFormat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			String que = sc.next();
			int lastIndex = que.length() - 1;
			int startingIndex = 0;
			boolean result = isPalindrome(que, startingIndex, lastIndex);
			System.out.println(result? "True" : "False");
			
		}
	}

	public static boolean isPalindrome(String que, int startingIndex, int lastIndex) {
		while (startingIndex < lastIndex) {
			if (que.charAt(startingIndex) != que.charAt(lastIndex)) {
				return false;
			}
			startingIndex++;
			lastIndex--;
		}
		return true;
	}
	

}
