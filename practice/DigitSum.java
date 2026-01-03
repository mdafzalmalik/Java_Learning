package practice;

import java.util.Scanner;

public class DigitSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int digit = sc.nextInt();
		int sum = 0;
		while(digit > 0) {
			int rem = digit % 10;
			sum += rem;
			digit = digit/10;
		}
		System.out.print(sum);

	}

}
