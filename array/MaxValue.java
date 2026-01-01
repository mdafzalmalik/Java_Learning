package array;

public class MaxValue {

	public static void main(String[] args) {
		int[] arr = {1, 8, 9, 5, 24};
		System.out.println(max(arr));
		System.out.println(max1(arr));
	}
	public static int max(int[] arr) {
		int m = arr[0];
		for(int i = 1; i < arr.length; i++) {
			m = Math.max(m, arr[i]);
		}
		return m;
	}
	
	public static int max1(int[] arr) {
		int m = Integer.MIN_VALUE; // 2^31
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > m) {
				m = arr[i];
			}
		}
		return m;
	}

}
