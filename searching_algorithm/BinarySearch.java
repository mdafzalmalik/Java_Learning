package searching_algorithm;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, 1, 2, 3, 7, 9};
		int item = -9;
		
		System.out.println(search(arr, item));

	}
	
	public static int search(int[] arr, int item) {
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
			if(arr[mid] == item) {
				return mid;
			}
			else if(item > arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}

}
