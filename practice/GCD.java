package practice;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dividend = 60;
		int divisor = 36;
//		int rem = dividend % divisor;
		while(dividend % divisor != 0) {
			int rem = dividend % divisor;
			dividend = divisor;
			divisor = rem;
		}
		System.out.print(divisor);

	}

}
