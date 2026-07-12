package recursion;

public class SubSequence {

//	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String qs = "abc";
//		printSubSequence(qs, "");
		System.out.println(countSubSequence(qs, ""));

	}

	public static void printSubSequence(String qs, String ans) {

		if (qs.length() == 0) {
			System.out.println(ans);
//			count++;
			return;
		}

		char ch = qs.charAt(0);
		printSubSequence(qs.substring(1), ans);
		printSubSequence(qs.substring(1), ans + ch);
	}

	public static int countSubSequence(String qs, String ans) {

		if (qs.length() == 0) {
			System.out.println(ans);
			return 1;
		}

		char ch = qs.charAt(0);
		int a1 = countSubSequence(qs.substring(1), ans);
		int a2 = countSubSequence(qs.substring(1), ans + ch);
		return a1 + a2;
	}

}
