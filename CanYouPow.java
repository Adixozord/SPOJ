import java.util.Scanner;

class CanYouPow {

	public static void main(String[] args) throws java.lang.Exception {
		Scanner scanner = new Scanner(System.in);

		for (int i = scanner.nextInt(); i > 0; i--)
			System.out.println(((int) Math.pow(scanner.nextInt() % 10, 4 + scanner.nextInt() % 4) % 10));
	}
}