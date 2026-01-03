package practice;

import java.util.Scanner;

// only for positive number

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int d = 0;
		int power = 0;
		while(n > 0) {
			int rem = n % 10;
			d = d + rem * (int)(Math.pow(2, power));
			n = n / 10;
			power++;
		}
		System.out.print(d);

	}

}
