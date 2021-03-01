
public class SolutionString {

	public static void printOccurance(String st) {

		String s = st.toLowerCase();
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length - 1; i++) {
			if (ch[i] >= 0) {
				for (int j = i + 1; j < ch.length; j++) {
					if (ch[i] == ch[j]) {
						ch[j] = (char) -1;

					}
				}
			}
		}
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 97 && ch[i] <= 122)
				System.out.print(ch[i]);
		}
	}

	public static void main(String[] args) {

		String s = "aasdvasvavda";
		printOccurance(s);
	}
}
