package array;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0) {
			int n = sc.nextInt(); // no of stall
			int c = sc.nextInt(); // no of cows
			int[] stall = new int[n];
			for (int i = 0; i < stall.length; i++) {
				stall[i] = sc.nextInt(); // stall ki position wali input
			}
			Arrays.sort(stall);
			System.out.println(largestMinDist(stall, c));
			t--;
		}
	}
	
	public static int largestMinDist(int[] stall, int c) {
		int start = 0; // or can be 1
		int end = stall[stall.length-1] - stall[0];
		int ans = 0;
		while(start <= end) {
			int mid = (start + end) / 2;
			if(isItPossible(stall, c, mid) == true) {
				ans = mid;
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
		}
		return ans;
	}
	
	public static boolean isItPossible(int[] stall, int c, int mid) {
		int cow = 1;
		int pos = stall[0];
		for (int i = 1; i < stall.length; i++) {
			if((stall[i] - pos) >= mid) {
				cow++;
				pos = stall[i];
			}
			if(cow == c) {
				return true;
			}
		}
		return false;
	}

}
