package co.calculate;

public class Calculator {
	
	public static int addition(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	public static int subtraction(int a, int b) {
		int sub = a - b;
		return sub;
	}
	
	public static int multiplication (int a, int b) {
		int mult = a * b;
		return mult;
	}
	
	public static int division (int a, int b) {
		int div = a / b;
		return div;
	}
	
	static int power (int num, int pow) {
		int result = 1;
		while (pow != 0) {
			result = result*num;
			--pow;
		}
		return result;
	}
	static int powerRecursive(int num,int pow){
		if(pow==1){
			return num;
		} else {
			return num* powerRecursive(num,--pow);
		}
	}
}



