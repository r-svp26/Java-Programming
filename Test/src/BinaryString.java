import java.util.HashSet;
import java.util.Scanner;

public class BinaryString {

	public static String rev(String str1, int... j) {

		int f;
		try {
			f = j[1];
		} catch (Exception e) {
			f = str1.length();
		}
		String temp = str1.substring(j[0], f);
		StringBuffer sb = new StringBuffer(temp);
		sb.reverse();
		return sb.toString();
	}

	static int countStep(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return -1;
		}
		int count = 0;

		HashSet<String> possibility = new HashSet<String>();
		possibility.add(str1);
		if (possibility.contains(str2)) {
			return count;
		}

		for (int i = 2; i <= str1.length(); i++) {
			HashSet<String> curPossibility = new HashSet<String>(possibility);
			HashSet<String> rem = new HashSet<String>();

			for (String st : curPossibility) {
				for (int j = 0; i + j <= str1.length(); j++) {
					String temp = "";
					if (i + j < str1.length()) {
						temp = st.substring(0, j) + rev(st, j, (i + j)) + st.substring(i + j);
					} else {
						temp = st.substring(0, j) + rev(st, j);
					}
					possibility.add(temp);
					if (curPossibility.contains(str2)) {
						return count;
					}
				}
				rem.add(st);
			}
			count++;
			possibility.removeAll(rem);
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");

		String str1 = sc.next();
		String str2 = sc.next();
		int count = countStep(str1, str2);

		System.out.println(count);
		sc.close();
	}
}