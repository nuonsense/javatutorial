package com.arr.minmax;

import java.util.Scanner;

public class MinMaxDigitOfNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the Number:  ");

		Scanner Sc = new Scanner(System.in);
		int n = Sc.nextInt();
		Sc.close();

		findMinAndMax(n);
		System.out.println("Reverse :" + reverserNum(n));
		System.out.println("Is Magic Number"+isMagicNumber(n) );

	}

	public static void findMinAndMax(int num) {
		int length = findLength(num);
		int[] numarr = new int[findLength(num)];
		int rem = 0;
		int index = 0;
		while (num != rem) {
			rem = num % 10;
			if (rem != num) {
				num = num / 10;
			}
			numarr[index] = rem;
			index++;
			System.out.print(rem);
		}
		System.out.println("Maximum digit is :" + findMax(numarr));
		System.out.println("Minimum digit is :" + findMin(numarr));
	}

	public static int findLength(int num) {
		int count = 0;
		while (num % 10 != num) {
			num = num / 10;
			++count;
		}
		return count > 0 ? ++count : 0;
	}

	public static int findMin(int[] numarr) {
		int min = numarr[0];
		for (int i = 1; i < numarr.length; i++) {
			if (numarr[i] < min) {
				min = numarr[i];
			}
		}

		return min;
	}

	public static int findMax(int[] numarr) {
		int max = numarr[0];
		for (int i = 1; i < numarr.length; i++) {
			if (numarr[i] > max) {
				max = numarr[i];
			}
		}

		return max;
	}

	public static int reverserNum(int num) {
		int reverse = 0;
		int length = findLength(num)-1;
		int rem = 0;
		int index = 0;
		while (num != rem) {
			rem = num % 10;
			if (rem != num) {
				num = num / 10;
			}
			reverse= reverse + rem * (int)Math.pow(10,length--);

		}
		return reverse;
	}
	
	public static int sumDigit(int num){
		int sumDigit=0;
		int rem = 0;
		while (num != rem) {
			rem = num % 10;
			if (rem != num) {
				num = num / 10;
			}
			sumDigit= sumDigit + rem;

		}
		return sumDigit;
	}
	public static boolean isMagicNumber(int num){
		int sumDigNum = sumDigit(num);
		int reverse= reverserNum(sumDigNum);
		return num == reverse*sumDigNum;
	}
}
