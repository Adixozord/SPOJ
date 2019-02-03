import java.util.Scanner;


public class PrimeChecker {

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
			if (num == 1 
					|| (num % 2 == 0 && num != 2) 
					|| (num % 3 == 0 && num != 3) 
					|| (num % 5 == 0 && num != 5) 
					|| (num % 7 == 0 && num != 7)) 
			{
				System.out.println("NIE");
			} else {
				System.out.println("TAK");
			};
		}
		scan.close();
	}
}
