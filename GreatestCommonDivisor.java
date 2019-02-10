import java.util.Scanner;

public class GreatestCommonDivisor {

	static int recurrentCheck(int num1, int num2) {
		if (num2 == 0) {
			return num1;
		} else {
			return recurrentCheck(num2, num1 % num2);
		}
	}

	public static void main(String[] args) throws java.lang.Exception {

		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();

		for (int i = 0; i < cases; i++) {

			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			System.out.println(recurrentCheck(num1, num2));

		}
	}
}
