import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) throws java.lang.Exception {

		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();

		for (int i = 0; i < cases; i++) {

			int arrayLength = scan.nextInt();
			int[] reversedArray = new int[arrayLength];

			for (int j = arrayLength; j > 0; j--) {
				reversedArray[j - 1] = scan.nextInt();
			}

			System.out.println(Arrays.toString(reversedArray).replaceAll("[,\\[\\]]", ""));

		}
	}
}
