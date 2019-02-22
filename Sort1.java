
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Sort1 {
	public static void main(String[] args) {
		
		class Point implements Comparator<Point>, Comparable<Point> {
			
			int x;
			int y;
			String name;
			double distance;

			public Point(int x, int y, String name) {
				
				this.x = x;
				this.y = y;
				this.name = name;
				distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
			}

			@Override
			public int compare(Point o1, Point o2) {
				
				if (o1.distance < o2.distance)
					return -1;
				else
					return 1;
			}

			@Override
			public int compareTo(Point o) {
				
				if (this.distance < o.distance)
					return -1;
				else
					return 1;
			}
		}
		
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		Point[] points;
		
		while (t > 0) {
			
			int n = scan.nextInt();
			points = new Point[n];
			while (n > 0) {
				
				String name = scan.next();
				int x = scan.nextInt();
				int y = scan.nextInt();
				points[n - 1] = new Point(x, y, name);
				n--;
			}
			Arrays.sort(points);
			for (Point p : points) {
				
				System.out.println(p.name + " " + p.x + " " + p.y);
			}
			System.out.println();
			t--;
		}
	}
}