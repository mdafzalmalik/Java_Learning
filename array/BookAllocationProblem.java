package array;

public class BookAllocationProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pages = {10, 20, 30, 40};
		int nos = 2;
		
		System.out.println(minPages(pages, nos));

	}
	
	public static int minPages(int[] pages, int nos) {
		int start = 0;
		int end = 0;
		for (int i = 0; i < pages.length; i++) {
			end += pages[i];
		}
		int ans = 0;
		while(start <= end) {
			int mid = (start + end) / 2;
			if(isItPosiible(pages, nos, mid) == true) {
				ans = mid;
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
		return ans;
	}

	public static boolean isItPosiible(int[] pages, int nos, int mid) {
		int student = 1;
		int readPage = 0;
		for(int i = 0; i < pages.length;) {
			if (pages[i] > mid) {
                return false; // single book too large
            }
			if(readPage+pages[i] <= mid) {
				readPage += pages[i];
				i++;
			} else {
				student++;
				readPage = 0;
			}
			if(student > nos) {
				return false;
			}
		}
		return true;
	}

}
