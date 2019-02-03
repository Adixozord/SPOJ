import java.util.Scanner;

public class Main {
	// checking method
	static void checkIfPrime(int number) {
		// flag
		int flag = 0;
		// loop limiter
		int limit = number / 2;
		if (number == 0 || number == 1) {
			System.out.println("NIE");
		} else {
			// start with 2 (first prime num)
			for (int i = 2; i <= limit; i++) {
				if (number % i == 0) {
					System.out.println("NIE");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println("TAK");
			}
		}
	}

	public static void main(String[] args) throws java.lang.Exception {

		Scanner scan = new Scanner(System.in);
//		System.out.println("How many cases am i dealing with?");
		int cases = 0;
		// force correct input
		while (true) {
			int casesCheck = scan.nextInt();
			if (casesCheck < 100000 && casesCheck > 0) {
				cases = casesCheck;
				break;
			} else {
				continue;
			}
		}

		// determine # of numbers to check
		for (int i = 0; i < cases; i++) {

//			System.out.println("Enter your num: ");
			int num = scan.nextInt();
			checkIfPrime(num);
		}
	}
}
