import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String:");
		String st = sc.nextLine();
		
		int[] a=new int[26];
		
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			if(ch>='A' && ch<='Z') {
				a[ch-65]++;
			}
		}
		
		for(int i=0;i< a.length; i++) {
			if(a[i]!=0) {
				System.out.println(a[i]);
			}
		}
		sc.close();
	}

}
