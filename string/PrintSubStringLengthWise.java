package string;

public class PrintSubStringLengthWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		subString(str);

	}
	
	public static void subString(String str) {
		for (int len = 1; len <= str.length(); len++) {
			for (int j = len; j <= str.length(); j++) {
				int i = j - len;
				System.out.println(str.substring(i, j));
			}
			System.out.println();
		}
	}

}
