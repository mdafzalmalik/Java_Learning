package practice;

import java.util.Scanner;

public class ArmstongNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.println(isArmstrong(n));

	}
	
	public static boolean isArmstrong(int n) {
		int c = countOfDigit(n);
		int p = n;
		int sum = 0;
		while(n > 0) {
			int rem = n % 10;
			sum = (int) (sum + Math.pow(rem, c));
			n = n / 10;
		}
		if(sum == p) {
			return true;
		} else {
			return false;
		}
	}
	
	public static int countOfDigit(int n) {
		int count = 0;
		while(n > 0) {
			n = n/10;
			count++;
		}
		return count;
	}

}
