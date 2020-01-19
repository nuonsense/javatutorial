package com.net.projecteuler;

import java.util.Scanner;

public class Reverse_equilateralTriangle {

	/*
	  
	 * * * * 
	  * * *  
	   * * 
	    * 
 
	 */

	static void equi_triangleReverse(int n) {

		for (int i=1; i<=n; i++) {

			for (int j=1; j<=i-1; j++) {
				System.out.print(" ");
			}

				for(int k=0; k<=n-i; k++) { 
					System.out.print("*"+ " ");
				}
				
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the number of stars: ");

		Scanner Sc = new Scanner(System.in);
		int n = Sc.nextInt();
		Sc.close();

		equi_triangleReverse(n);
	}

}
