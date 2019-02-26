import java.util.Scanner;

class Divisibility {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int cases = scan.nextInt();

		while (cases > 0) {
			cases--;

			int limit = scan.nextInt();
			int divideBy = scan.nextInt();
			int dontDivideBy = scan.nextInt();

			String result = "";

			for (int i = 0; i < limit; i += divideBy) {

				if (i % divideBy == 0 && i % dontDivideBy != 0) {
					result += i+" ";
				}

			}
			System.out.println(result);
		}

	}

}
