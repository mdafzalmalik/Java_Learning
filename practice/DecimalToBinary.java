package practice;

import java.util.Scanner;

//only for positive number

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int b = 0;
		int power = 0;
		while(n > 0) {
			int rem = n % 2;
			b = b + rem * (int)(Math.pow(10, power));
			n = n / 2;
			power++;
		}
		System.out.print(b);

	}

}
