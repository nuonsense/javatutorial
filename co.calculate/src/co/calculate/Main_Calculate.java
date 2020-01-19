package co.calculate;

import java.util.Scanner;

public class Main_Calculate {
	
	static int a;
	static int b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		performWhile();
//		performWhileWithBreak();
		
	}
	
	public static void performWhile(){
		String c= "";
		System.out.println("Hello");
		Scanner sc = new Scanner(System.in);
		while(c!="exit"){
			System.out.println("Enter Choice: +\n-\n*\n/\n ^ type 'end' to terminate the program");
			c = sc.next();
			if(c!="end"){
				int result = 0;
			
				switch (c.charAt(0)) {
				case '+':
					Main_Calculate.takeInput(sc);
					result =Calculator.addition(a,b);
					break;
				case '-':
					Main_Calculate.takeInput(sc);
					result= Calculator.subtraction(a,b);
					break;
				case '*':
					Main_Calculate.takeInput(sc);
					result=Calculator.multiplication(a,b);
					break;
				case '/':
					Main_Calculate.takeInput(sc);
					result=Calculator.division(a,b);
					break;
				case '^':
					Main_Calculate.takeInput(sc);
					result=Calculator.powerRecursive(a,b);
					break;
					
				default:
					System.out.println("Please Choose a Valid Operator");
					break;
				}
				System.out.println("Result is "+result);
			}
			
		}
		sc.close();
	}
	
	public static void takeInput( Scanner sc){
		System.out.println("Enter First  Numbers: ");
		 a = sc.nextInt();
		System.out.println("Enter Second Numbers: ");
		 b = sc.nextInt();
	}
	
	public static void performWhileWithBreak(){
		String c= "";
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("Enter Choice: +\n-\n*\n/\n type 'exit' to terminate the program");
			c = sc.next();
			if(c.equals("exit")){
				break;
			}
			System.out.println("Enter First  Numbers: ");
			int a = sc.nextInt();
			System.out.println("Enter Second Numbers: ");
			int b = sc.nextInt();
			int result = 0;
			switch (c.charAt(0)) {
			case '+':
				result =Calculator.addition(a,b);
				break;
			case '-':
				result= Calculator.subtraction(a,b);
				break;
			case '*':
				result=Calculator.multiplication(a,b);
				break;
			case '/':
				result=Calculator.division(a,b);
				break;
				
			default:
				System.out.println("Please Choose a Valid Operator");
				break;
			}
			System.out.println("Result is "+result);
			
		}
		sc.close();
	}

}

