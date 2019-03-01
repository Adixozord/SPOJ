import java.util.Scanner;

class NestedLoops8 {

	public static void main(String[] args) throws java.lang.Exception {

		Scanner scan = new Scanner(System.in);

		int cases = scan.nextInt();

		for (int j = 0; j < cases; j++) {

			int vertical = scan.nextInt();
			int horizontal = scan.nextInt();
			int size = scan.nextInt();

			int tmp = 2 * size;
			int rows = vertical * tmp;
			int columns = horizontal * tmp;

			int mod1 = size - 1;
			int mod2 = size;

			for (int k = 0; k < rows; k++) {
				String oneRow = "";

				for (int i = 0; i < columns; i++) {

					if (mod1 == (k + i) % tmp) {
						oneRow += '/';

					} else if (mod2 == Math.abs(k - i) % tmp) {
						oneRow += '\\';

					} else if (isInside(i, k, size)) {
						oneRow += '*';

					} else {
						oneRow += '.';
					}
				}
				System.out.println(oneRow);
			}
			System.out.println("");
		}
	}

	// check if its inner diamond
	private static boolean isInside(int row, int col, int size) {

		int tmp = 2 * size;

		while (row > tmp) {
			row -= tmp;
		}
		while (col > tmp) {
			col -= tmp;
		}

		if (row + col - size + 1 <= 0) {
			return false;
		}
		if (col - row - size >= 0) {
			return false;
		}
		if (col + row - 3 * size + 1 >= 0) {
			return false;
		}
		if (col - row + size <= 0) {
			return false;
		}

		return true;
	}
}