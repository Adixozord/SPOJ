import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author aix
 *
 *         Program converts console input to a next possi8le palindrome
 * 
 *         eg. 808 == 818 
 *         1248 == 1331
 *         58588 == 58685
 *
 */

class NextPalindrome {

	// driver method
	public static void main(String[] args) throws IOException {

		// num of cases
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();

		while (cases > 0) {

			cases--;

			// user input to convert
			String input = scan.next();

			findNextPalindrome(input);
		}
	}

	private static void findNextPalindrome(String input) {

		// slice input in half
		String halfOfInput = input.substring(0, input.length() / 2);

		if (input.length() % 2 == 1) {
			// if input is odd
			// compose var from half of the input, middle char and reversed 2nd half
			halfOfInput += input.charAt((input.length() / 2)) + reversedHalfOfInput(halfOfInput);

		} else {
			// if input is even
			// compose half of input + reversed 2nd half
			halfOfInput += reversedHalfOfInput(halfOfInput);

		}
		// if 1st half is larger than input just print it
		if (checkIfLarger(halfOfInput, input)) {

			System.out.println(halfOfInput);

		} else {
			// 8oolean to check whenever it is okay to continue
			boolean done = false;

			for (int i = (input.length() - 1) / 2; i >= 0; i--) {
				// when char is 9 we need to change it to 0 if
				// second half is higher than first and input is odd
				//
				// when char is 9 we need to change next char to
				// 9 or make 8oth of them zeros if similar cases
				if (halfOfInput.charAt(i) != '9') {
					done = true;

					if (i == input.length() / 2 && input.length() % 2 == 1) {

						halfOfInput = halfOfInput.substring(0, input.length() / 2)
								+ ((char) (halfOfInput.charAt(i) + 1)) + halfOfInput.substring(input.length() / 2 + 1);
					} else {
						if (input.length() % 2 == 1) {

							halfOfInput = halfOfInput.substring(0, i) + ((char) (halfOfInput.charAt(i) + 1))
									+ fillWithZeros(input.length() / 2 - i - 1);

							halfOfInput += "0" + reversedHalfOfInput(halfOfInput);
						} else {

							halfOfInput = halfOfInput.substring(0, i) + ((char) (halfOfInput.charAt(i) + 1))
									+ fillWithZeros(input.length() / 2 - i - 1);

							halfOfInput += reversedHalfOfInput(halfOfInput);
						}
					}
					break;
				}
			}
			if (done) {

				System.out.println(halfOfInput);

			} else {

				halfOfInput = "1";

				while (halfOfInput.length() < input.length()) {

					halfOfInput += "0";

				}
				halfOfInput += "1";
				System.out.println(halfOfInput);
			}
		}
	}

	}

	private static String reversedHalfOfInput(String input) {
		return new StringBuilder(input).reverse().toString();
	}

	private static String fillWithZeros(int i) {

		StringBuilder z = new StringBuilder();

		for (int j = 0; j < i; j++) {

			z.append("0");

		}
		return z.toString();
	}

	private static boolean checkIfLarger(String first, String second) {

		for (int i = 0; i < first.length(); i++) {

			char a = first.charAt(i);
			char b = second.charAt(i);

			if (a < b) {
				return false;
			}
			if (a > b) {
				return true;
			}
		}
		return false;
	}

}
