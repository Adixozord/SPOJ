import java.util.*;
import java.lang.*;

class NestedLoops5 {

	public static void main(String[] args) throws java.lang.Exception {

		Scanner scan = new Scanner(System.in);

		int cases = scan.nextInt();

		for (int j = 0; j < cases; j++) {

			int rows = scan.nextInt();
			int columns = scan.nextInt();
			int width = scan.nextInt();

			for (int k = 0; k <= (rows * width) + rows; k++) {
				
				String oneRow = "";

				for (int i = 0; i <= (columns * width) + columns; i++) {

					if (i % (width + 1) == 0 || k % (width + 1) == 0) {

						oneRow += "*";

					} else if ((k / (width + 1) + i / (width + 1)) % 2 == 0) {

						oneRow += (k % (width + 1) == i % (width + 1) ? '\\' : '.');
					} else {
						
						oneRow += (k % (width + 1) == (width + 1) - (i % (width + 1)) ? '/' : '.');
					}
				}
				System.out.println(oneRow);
			}
			System.out.println("");
		}
	}
}