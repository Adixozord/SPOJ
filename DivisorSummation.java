import java.util.Scanner;

class DivisorSummation {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();

		for (int i = 0; i < cases; i++) {

			int input = scan.nextInt();
			int result = 1;

			if (input == 1) {
				System.out.println("0");
			} else {
				for (int j = 2; j <= Math.sqrt(input); j++) {

					if (input % j == 0) {
						if (j == input / j) {
							result += j;
						} else {
							result += j + input / j;
						}
					}
				}
				System.out.println(result);
			}
		}
	}
}
