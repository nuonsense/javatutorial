package com.net.projecteuler;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter the number: ");
		
		Scanner Sc = new Scanner(System.in);
		int n = Sc.nextInt();
		int length = calLength(n);
		System.out.println(reverse(n,length));
		Sc.close();
		

	}
	static int calLength(int n){
		int num = n;
		int count =0;
		while(n%10!=n){
			n=n/10;
			count++;
		}
		return count;
	}
	
	static int reverse(int n,int length){
		int remainder=0;
		int reverse=0;
		while(n%10!=n){
			remainder= n%10;
			reverse +=remainder*Math.pow(10, length--);
			n=n/10;
		}
		reverse +=n;
		return reverse;
	}

}
