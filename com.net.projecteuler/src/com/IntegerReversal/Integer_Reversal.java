package com.IntegerReversal;

import java.util.Scanner;

public class Integer_Reversal {
	
	public static int revInt(int num) {
		
		int rem;
		int rev = 0;
		
		while(num!=0) {
			rem = num%10;
			rev = rev * 10 + rem;
			num = num/10;			
		}
		return rev;
	}
	
	
	public static String stringReversal(String literal) {
		String reverse = "";
		for(int i=literal.length()-1; i>=0; i--) {
			char indexes = literal.charAt(i);
			reverse = reverse + String.valueOf(indexes);
		}
		return reverse;
	}
	public static String stringReversal2(String literal) {
		String reverse = "";
		for(int i=0; i<literal.length(); i++) {
			reverse = reverse + literal.substring(literal.length()-1-i,literal.length()-i);
		}
		return reverse;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		System.out.print("Enter the Number:  ");
		
		Scanner Sc = new Scanner(System.in);
		int num = Sc.nextInt();
		Sc.close();
		
		System.out.println(revInt(num));
		*/
		System.out.print("Enter the String:  ");
		
		Scanner Sc = new Scanner(System.in);
		String string = Sc.next();
		Sc.close();
		
		System.out.println(stringReversal2(string));

	}

}
