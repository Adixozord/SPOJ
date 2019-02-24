import java.util.Scanner;

class NestedLoops6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int cases = scan.nextInt();

		while (cases > 0) {

			cases--;

			int rows = scan.nextInt();
			int columns = scan.nextInt();
			int height = scan.nextInt();
			int width = scan.nextInt();

			for (int rowIndex = 0; rowIndex < (rows * height + rows) + height; rowIndex++) {

				String oneRow = "";

				for (int colIndex = 0; colIndex < (columns * width + columns) + width; colIndex++) {

					if (colIndex == width & rowIndex != height) {
						oneRow += "|";
					} else if (rowIndex % height == 0){
						oneRow += "+";
					} else {
						oneRow += ".";
					}

				}
				System.out.println(oneRow);
			}
			System.out.println("");
		}
	}
}
