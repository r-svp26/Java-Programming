import java.util.Scanner;

public class SolutionArray {
	static int[] firstPair(int x[], int y) {

		int p[] = new int[2];
		for (int i = 0; i < x.length; i++) {
			int sum = 0;
			for (int j = i + 1; j <= x.length; j++) {
				sum = sum + (x[i] + x[j]);
				if (sum == y) {
					p[0] = x[i];
					p[1] = x[j];
					break;
				}
			}
		}
		return p;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the Array");
		int n = sc.nextInt();

		int pp[] = new int[n];
		for (int i = 0; i < pp.length; i++) {
			pp[i] = sc.nextInt();
		}
		System.out.println("Enter the value of key");
		int k = sc.nextInt();

		int ppp[] = firstPair(pp, k);

		for (int i = 0; i < ppp.length; i++) {
			System.out.println(ppp[i] + " ");
		}
		sc.close();
	}

}
