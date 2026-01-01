package sorting_algorithms;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,0,2,9,3,8,5,6,7,4};
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
	
	public static void sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			placeElementFromLastToRightPosition(arr, i);
		}
	}
	
	public static void placeElementFromLastToRightPosition(int[] arr, int i) {
		int item = arr[i];
		int j = i-1;
		while(j >= 0 && arr[j] > item) {
			arr[j+1] = arr[j];
			j--;
		}
		arr[j+1] = item;
	}

}
