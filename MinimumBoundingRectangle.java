import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class MinimumBoundingRectangle {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(reader.readLine());

		while (cases > 0) {
			cases--;

			int elements = Integer.parseInt(reader.readLine());
			

			
			while (elements > 0) {
				String[] obj = reader.readLine().split("\\s");
				elements--;
				
				switch (obj[0]) {
				case "p":
					pointCalc(Integer.parseInt(obj[1]), Integer.parseInt(obj[2]));
					break;
				case "c":
					circleCalc(Integer.parseInt(obj[1]), Integer.parseInt(obj[2]), Integer.parseInt(obj[3]));
					break;
				case "l":
					lineCalc(Integer.parseInt(obj[1]), Integer.parseInt(obj[2]), Integer.parseInt(obj[3]),
							Integer.parseInt(obj[4]));
					break;
				}
				System.out.println(" ");
			}
		}
	}

	private static void lineCalc(int x1, int y1, int x2, int y2) {
		
		int minX = 1000;
		int minY = 1000;
		int maxX = -1000;
		int maxY = -1000;

		int temp;

		if (x1 > x2) {
			temp = x1;
			x1 = x2;
			x2 = temp;
		}

		if (y1 > y2) {
			temp = y1;
			y1 = y2;
			y2 = temp;
		}

		minX = Math.min(minX, x1);
		minY = Math.min(minY, y1);
		maxX = Math.max(maxX, x2);
		maxY = Math.max(maxY, y2);

		System.out.println(minX + " " + minY + " " + maxX + " " + maxY);

	}

	private static void circleCalc(int x, int y, int r) {

		int minX = 1000;
		int minY = 1000;
		int maxX = -1000;
		int maxY = -1000;

		minX = Math.min(minX, x - r);
		minY = Math.min(minY, y - r);
		maxX = Math.max(maxX, x + r);
		maxY = Math.max(maxY, y + r);

		System.out.println(minX + " " + minY + " " + maxX + " " + maxY);
	}

	private static void pointCalc(int x, int y) {

		int minX = 1000;
		int minY = 1000;
		int maxX = -1000;
		int maxY = -1000;

		minX = Math.min(minX, x);
		minY = Math.min(minY, y);
		maxX = Math.max(maxX, x);
		maxY = Math.max(maxY, y);

		System.out.println(minX + " " + minY + " " + maxX + " " + maxY);

	}

}
