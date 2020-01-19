package com.prime_number;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
	System.out.print("Enter the Number:  ");
		
		Scanner Sc = new Scanner(System.in);
		int num = Sc.nextInt();
		Sc.close();
		
		System.out.println("Is Prime :"+isPrime(num));

	}

	private static boolean isPrime(int num) {
		boolean flag= true;
		if(num ==0 || num == 1){
			flag =false;
		}else {
			for(int i=2; i< num/2; i++){
				if(num%i==0){
					flag=false;
					break;
				}
			}
		}
		return flag;
	}

}
