package com.aanchal.basics;



public class TwoCharacterLine {

	public static void main(String[] args) {
	
		String que = "WORKATTECH";
		
		for(int i =0 ; i<que.length(); i+=2) {
			
			System.out.println(que.substring(i, i+2));
		}

	}

}
