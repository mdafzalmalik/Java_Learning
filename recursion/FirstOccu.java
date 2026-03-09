package recursion;

public class FirstOccu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 6, 8, 3, 6, 7, 4, 3, 7, 8 };
		int item = 34;
		int idx = 0;
		System.out.println(find(arr, item, idx));
	}

	public static int find(int[] arr, int item, int idx) {
		if (idx == arr.length) {
			return -1;
		}
		if (arr[idx] == item) {
			return idx;
		}
		return find(arr, item, idx + 1);
	}

}
