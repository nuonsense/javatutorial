package com.net.projecteuler;

import java.util.Scanner;

public class Reverse_Right_Triangle {
	
	/*
	 
	 * * * * * 
	 * * * *
	 * * *
	 * *
	 * 
	 
	 */
	
	static void reverseRightTriangle(int n) {
		
		for(int i=n; i>0; i--) {
			System.out.println(" ");
			for(int j=0; j<=i-1; j++) {
				System.out.print(" *");
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter the number of stars: ");
		
		Scanner Sc = new Scanner(System.in);
		int n = Sc.nextInt();
		
		reverseRightTriangle(n);
		 
		 Sc.close();
		

	}

}
