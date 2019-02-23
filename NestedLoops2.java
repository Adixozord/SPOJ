import java.util.*;
import java.lang.*;

public class NestedLoops2 {
	public static void main(String[] args) throws java.lang.Exception {

		Scanner scan = new Scanner(System.in);

		int cases = scan.nextInt();

		for (int j = 0; j < cases; j++) {

			int rows = scan.nextInt();
			int columns = scan.nextInt();

			for (int k = 0; k < rows; k++) {
				String oneRow = "";

				for (int i = 0; i < columns; i++) {
					
					if(i == 0 || k == 0 || k == rows - 1 || i == columns - 1) {
						oneRow += "*";
					} else {
						oneRow+= ".";
					}
					
				}
				System.out.println(oneRow);

			}
			System.out.println("");
		}
	}
}