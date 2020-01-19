package com.office;

import java.util.*;

public class Profit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int emp_DeptA = 20;
		int emp_DeptB = 50;
		
		int avgBonus_DeptA = 5000;
		int avgBonus_DeptB = 7000;
		
		System.out.println("Enter Gross Profit: ");
		int grossProfit = sc.nextInt();
		
		sc.close();
		
		if (grossProfit == 2*avgBonus_DeptA) {
			int extraBonus_A = 10*5000/100;
			System.out.println("Department rewarded at 10%: " + extraBonus_A);
			
			System.out.println("Reward to each Employee: " + (extraBonus_A / emp_DeptA)); 
		}
		else if (grossProfit == 2*avgBonus_DeptB) {
			int extraBonus_B = 10*7000/100;
			System.out.println("Department rewarded at 10%: " + extraBonus_B);
			
			System.out.println("Reward to each Employee: " + (extraBonus_B / emp_DeptB));
		}
		
	}
}
