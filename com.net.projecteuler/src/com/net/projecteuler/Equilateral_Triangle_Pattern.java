package com.net.projecteuler;

import java.util.Scanner;

public class Equilateral_Triangle_Pattern {
	/*
	 
	   *
	  * *
	 * * *
	* * * *
	
	 */
	public static void equilateralTriangle(int n) {
		
		for(int i=1; i<=n; i++) {
			for(int j=0; j<n-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<i; k++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number of stars: ");
		Scanner Sc = new Scanner(System.in);
		int n = Sc.nextInt();
		
		equilateralTriangle(n);
		
		Sc.close();
	}

}
