import java.util.Scanner;

public class MinimumBoundingRectangle {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int cases = scan.nextInt();

		while (cases > 0) {
			cases--;

			String obj = scan.next();
			int elements = scan.nextInt();

			int minX = 0;
			int minY = 0;
			int maxX = 0;
			int maxY = 0;
			
			while (elements > 0) {
				elements--;
				switch (obj) {
				case "p":
					pointCalc();
				case "c":
					circleCalc();
				case "l":
					lineCalc();
				}
			}
		}
	}

	private static void lineCalc() {
		Scanner scan = new Scanner(System.in);
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();

	}

	private static void circleCalc() {
		Scanner scan = new Scanner(System.in);
		int xx = scan.nextInt();
		int yy = scan.nextInt();
		int r = scan.nextInt();

	}

	private static void pointCalc() {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		
	}

}

