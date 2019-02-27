import java.util.Scanner;

class SumOfSquares {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int firstOperand = scan.nextInt();
		int secondOperand = scan.nextInt();

		printSum(firstOperand, secondOperand);
	}

	private static void printSum(int firstOperand, int secondOperand) {
		int result = 0;
		for (int i = firstOperand; i <= secondOperand; i++) {
			result += i * i;
		}
		System.out.println(result);
	}
}