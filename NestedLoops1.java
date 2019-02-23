import java.util.Scanner;

public class NestedLoops1 {

	public static void main(String[] args) throws java.lang.Exception {

		Scanner scan = new Scanner(System.in);

		int cases = scan.nextInt();

		for (int j = 0; j < cases; j++) {

			int rows = scan.nextInt();
			int columns = scan.nextInt();

			for (int k = 0; k < rows; k++) {
				String oneRow = "";

				for (int i = 0; i < columns; i++) {
					if (k % 2 == 0) {
						if (i % 2 == 0) {
							oneRow += "*";
						} else {
							oneRow += ".";
						}
					} else {
						if (i % 2 != 0) {
							oneRow += "*";
						} else {
							oneRow += ".";
						}
					}
				}
				System.out.println(oneRow);

			}
		}
	}
}