package searching_algorithm;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr = {1, 2, 4, 7, 9, 0, -8};
		int item = -18;
		
		System.out.print(search(arr, item));
	}
	
	public static int search(int[] arr, int item) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == item) {
				return i;
			}
		}
		return -1;
	}

}
