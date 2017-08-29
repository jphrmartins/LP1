package br.fundatec.lpi.metodos1;

public class Calculator {

	public static int sum(int num1, int num2) {
		return num1 + num2;
	}

	public static int sub(int num1, int num2) {
		return num1 - num2;
	}

	public static int mult(int num1, int num2) {
		return num1 * num2;
	}

	public static int divide(int num1, int num2) {
		try {
			return num1 / num2;
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Divide by zero");
		}
		return 0;
		
	}

	public static double squareRoot(double num) {
		return Math.sqrt(num);
	}

	public static double cubicRoot(int num) {
		return Math.cbrt(num);
	}

	public static String verifyPairOrOdd(int num) {
		if(num % 2 == 0) {
			return num + " It's Pair";
		}
		return num + " It's Odd";
	}

	public static int factorial(int num) {
		int result = 1;
		for(int loop = num; loop >= 1; loop--) {
			result *= loop;
		}
		return result;
	}

}
