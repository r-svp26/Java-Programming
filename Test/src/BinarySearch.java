import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static int binary(int[] arr, int key) {

		Arrays.sort(arr);

		int low = 0;
		int high = arr.length - 1;
		int mid = (low + high) / 2;

		while (low < high) {
			if (arr[mid] == key)
				return mid;

			else if (key < mid)
				high = mid - 1;

			else
				low = mid + 1;
		}
		return -1;
	}

	public static int[] read() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size");

		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.println("ENTER THE ELEMENT");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = read();
		int key = 65;

		binary(arr, key);
	}
}
