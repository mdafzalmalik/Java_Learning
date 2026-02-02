package string;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Afzal";
//		System.out.println(s.substring(2, 5));
//		System.out.println(s.substring(3));
		printSubStrings(s);
		

	}
	
	public static void printSubStrings(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j <= s.length(); j++) {
				System.out.println(s.substring(i, j));
			}
			System.out.println();
		}
	}

}
