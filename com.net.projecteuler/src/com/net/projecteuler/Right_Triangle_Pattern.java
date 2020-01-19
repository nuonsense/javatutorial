package com.net.projecteuler;

import java.util.Scanner;

public class Right_Triangle_Pattern {
	/*
	 
	 *
	 * *
	 * * *
	 * * * *

	 */
	public static void rightTriangle(int n) {
		
		for(int i=1; i<=n; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter the number of stars: ");
		Scanner Sc = new Scanner(System.in);
		int n = Sc.nextInt();
		
		rightTriangle(n);
		
		Sc.close();
	}

}
