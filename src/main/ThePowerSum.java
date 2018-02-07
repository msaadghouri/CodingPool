package main;

import java.util.Scanner;

public class ThePowerSum {
	/**
	 * Find the number of ways that a given integer, X, can be expressed as the sum of the Nth powers of unique, 
	 * natural numbers.
	 * If x = 10 and N = 2, we need to find the number of ways that 10 can be represented as the sum of squares
	 * of unique numbers. This is the only way in which  can be expressed as the sum of unique squares.
	 * 1square + 3square = 10
	 * This is the only way in which 10 can be expressed as the sum of unique squares.
	 */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int X = in.nextInt();
		int N = in.nextInt();
		System.out.println(powerOfSum(X, N, 1));
		in.close();
	}

	private static int powerOfSum(int number, int power, int incValue) {
		int pow=(int) Math.pow(incValue, power);
		if(pow<number)
			return powerOfSum(number, power, incValue+1) 
					+ powerOfSum( number- (int) Math.pow(incValue, power), power, incValue+1);
		else if(pow==number)
			return 1;
		else
			return 0;
	}

}
