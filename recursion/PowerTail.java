package recursion;

public class PowerTail {
	
	public static void main(String[] args) {
		int a = 3;
		int b = 3;
		System.out.println(pow(a, b, 1));
	}
	
	public static int pow(int a, int b, int ans) {
		if(b == 0) {
			return ans;
		}
		return pow(a, b-1, ans*a);
		
	}

}
