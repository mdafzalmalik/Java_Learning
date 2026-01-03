package practice;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int row = 0;
		int count = 1;
		while(row < n) {
			// printing Pascal triangle
			int i = 0;
			int val = 1;
			while(i < count) {
				System.out.print(val + " ");
				val = ((row-i)*val)/(i+1);
				i++;
			}
			// next row
			System.out.println();
			row++;
			count++;
		}

	}

}
