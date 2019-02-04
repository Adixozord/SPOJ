import java.util.Scanner;

public class TrickyFactorial {
// factorial method returns String (no need for int after calculation)
	static String calcFactorial(int num) {

		long factorial = 1;
		for (long j = num; j >= 1; j--) {
			factorial *= j;
		}
		return factorial + "";
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int numOfCases = scan.nextInt();

		for (int i = 0; i < numOfCases; i++) {

			int num = scan.nextInt();
			if (num < 10) {
				String calculated = calcFactorial(num);

				if (calculated.length() < 2) {
					System.out.println(0 + " " + calculated.charAt(0));
				} else {
					System.out.println(calculated.charAt(calculated.length() - 2) + " "
							+ calculated.charAt(calculated.length() - 1));
				}
			} else {
				System.out.println(0 + " " + 0);
			}
		}
	}
}