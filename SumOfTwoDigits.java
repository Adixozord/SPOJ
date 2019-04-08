import java.util.Scanner;

class SumOfTwoDigits {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int number = scan.nextInt();

		for (int i = 1; i <= number; i++) {

			System.out.println(i +""+ (number - i) + " = " + i + " + " + (number - i) + " = " + (number));

		}

	}

}
