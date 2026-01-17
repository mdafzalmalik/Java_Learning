package two_d_array;

public class WavePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1, 2, 3, 4, 5},
				        {6, 7, 8, 9, 10},
				        {11, 12, 13, 14, 15},
				        {16, 17, 18, 19, 20}};
		
		verticalWavePrint(arr);

	}
	
	public static void verticalWavePrint(int[][] arr) {
		int n = arr.length;
		int m = arr[0].length;
		
		for (int j = 0; j < m; j++) {
			if(j % 2 == 0) {
				for(int i = 0; i < n; i++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			} else {
				for (int i = n-1; i >= 0; i--) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
	
	public static void horizontalWavePrint(int[][] arr) {
		int n = arr.length;
		int m = arr[0].length;
		
		for (int i = 0; i < n; i++) {
			if(i % 2 == 0) {
				for(int j = 0; j < m; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			} else {
				for (int j = m-1; j >= 0; j--) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
	}

}
