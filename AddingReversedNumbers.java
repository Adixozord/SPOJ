import java.util.Scanner;

class AddingReversedNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// number of cases
		int cases = scan.nextInt();

		for (int i = 0; i < cases; i++) {

			int first = scan.nextInt();
			int second = scan.nextInt();
			// pass arguments to summing method
			sumReversed(first, second);
		}
	}

	private static void sumReversed(int first, int second) {
		System.out.println(reverse(first) + reverse(second));
	}

	private static int reverse(int number) {
		// reverse given integer and store it as String to use .charAt() method below
		String reversedString = String.valueOf(number);
		// empty string to store digits starting from the end
		// this variable will be parsed into integer at the end of method
		String reversedInteger = "";
		// index of last digit
		int j = reversedString.length() - 1;

		for (int i = 0; i < reversedString.length(); i++) {
			// add last digit to String variable (result)
			reversedInteger += reversedString.charAt(j);
			j--;
		}
		return Integer.parseInt(reversedInteger);
	}
}
