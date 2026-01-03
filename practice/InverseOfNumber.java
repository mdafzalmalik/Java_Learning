package practice;

import java.util.Scanner;

public class InverseOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int posi = 1;
		int inverse = 0;
		
		while(n > 0) {
			int rem = n % 10;
			inverse = (int)(inverse + posi * Math.pow(10, rem-1));
			inverse += posi * (int) Math.pow(10, rem-1); // internal type casting
			n = n / 10;
			posi++;
		}
		System.out.print(inverse);

	}

}
