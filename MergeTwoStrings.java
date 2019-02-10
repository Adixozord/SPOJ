import java.util.Scanner;

public class MergeTwoStrings {

	static void merge(String stringOne, String stringTwo) {

		int iterations = 0;
		String merged = "";
		// check which string is shorter
		if (stringOne.length() > stringTwo.length()) {
			iterations = stringTwo.length();
		} else {
			iterations = stringOne.length();
		}

		for (int i = 0; i < iterations; i++) {
			merged += stringOne.charAt(i);
			merged += stringTwo.charAt(i);
		}
		System.out.println(merged);

	}

	public static void main(String[] args) throws java.lang.Exception {

		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();

		for (int i = 0; i < cases; i++) {

			merge(scan.next(), scan.next());
		}
	}
}
