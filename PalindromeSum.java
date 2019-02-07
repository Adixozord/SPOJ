import java.util.Scanner;

public class PalindromeSum {

	static int reverse(int num) {
		int reversed = 0;
		while (num != 0) {
			reversed = reversed * 10;
			reversed = reversed + num % 10;
			num = num / 10;
		}
		return reversed;
	}

	// checking method
	static void checkIfPalindrome(int number) {
		int count = 0;
		int unreversed = number;
		int reversed = reverse(unreversed);
		while (unreversed != reverse(unreversed)) {
			unreversed += reverse(unreversed);
			count++;
		}
		System.out.println(unreversed + " " + count);
	}

	public static void main(String[] args) throws java.lang.Exception {

		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();

		for (int i = 0; i < cases; i++) {

			int num = scan.nextInt();
			checkIfPalindrome(num);

		}
	}
}
