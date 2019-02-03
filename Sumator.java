import java.util.Scanner;
import java.util.stream.IntStream;

public class Sumator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// System.out.println("How many cases am i dealing with?");
		int cases = 0;
		
		// force correct input
		while (true) {
			int casesCheck = scan.nextInt();
			if (casesCheck < 100 && casesCheck > 0) {
				cases = casesCheck;
				break;
			}else {
				continue;
			}
		}
		
		// determine # of numbers to add
		for (int i = 0; i < cases; i++) {

			// System.out.println("How many nums are we adding?");
			int numOfNums = scan.nextInt();

		// initialize array to store numbers
			int[] allNums = new int[numOfNums];

		// determine numbers to add
			for (int j = 0; j < numOfNums; j++) {
				int num = scan.nextInt();
		// store numbers into array
				allNums[j] = num;
			}
		// print the result
			System.out.println(IntStream.of(allNums).sum());
		}
		scan.close();

	}

}
