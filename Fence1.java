import java.util.Scanner;

class Fence1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double length = scan.nextDouble();
		double x = (double) 1 / (2 * Math.PI);
		
		while (length != 0) {
			
			double area = (double) (1 / (2 * Math.PI)) * length * length;
			System.out.printf("%.2f\n", area);
			length = scan.nextDouble();
			
		}
	}
}