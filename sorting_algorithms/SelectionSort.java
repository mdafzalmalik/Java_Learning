package sorting_algorithms;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,0,3,9,-7,2,6};
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
	
	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int minIdx = minIndex(arr, i);
			int temp = arr[i];
			arr[i] = arr[minIdx];
			arr[minIdx] = temp;
		}
	}
	
	public static int minIndex(int[] arr, int i) {
		int idx = i;
		for(int j = i+1; j < arr.length; j++) {
			if(arr[j] < arr[idx]) {
				idx = j;
			}
		}
		return idx;
	}

}
