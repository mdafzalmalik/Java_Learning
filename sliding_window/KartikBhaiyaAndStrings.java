package sliding_window;

public class KartikBhaiyaAndStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abaaabaabbaaa";
		int k = 2;
		int flipa = maxLen(str, k, 'a');
		int flipb = maxLen(str, k, 'b');
		System.out.println(Math.max(flipa, flipb));

	}

	public static int maxLen(String str, int k, char ch) {
		int si = 0;
		int ei = 0;
		int ans = 0;
		int flip = 0;
		while (ei < str.length()) {
			// growing
			if (str.charAt(ei) == ch) {
				flip++;
			}
			// shrinking
			while (flip > k) {
				if (str.charAt(si) == ch) {
					flip--;
				}
				si++;
			}
			ans = Math.max(ans, (ei - si + 1));
			ei++;
		}
		return ans;
	}

}
