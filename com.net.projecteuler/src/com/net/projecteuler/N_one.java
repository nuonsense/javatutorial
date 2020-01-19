package com.net.projecteuler;

import java.util.Scanner;

public class N_one {
	
	static int nOne(int n) {
		int result = n-1; 
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the value of n: ");
		
		Scanner Sc = new Scanner(System.in);
		int n = Sc.nextInt();
		Sc.close();
		
		System.out.println(nOne(n));
		
		
	}

}
