import java.util.Scanner;

class CrossPattern {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	int input = scan.nextInt();
	
	for(int i = 0; i < input; i++) {
		int yAxis = scan.nextInt();
		int xAxis = scan.nextInt();
		int width = scan.nextInt();
		int height= scan.nextInt();
		
		createPattern(xAxis,yAxis,width,height);
		
	}
	}

	private static void createPattern(int xAxis, int yAxis, int width, int height) {
		
		for(int row = 0; row < yAxis; row++) {
			String line = "";
			for(int col = 0; col < xAxis; col++) {
				line += (row == width - 1 || col == height - 1)? "*": ".";
			}
			System.out.println(line);
		}
		System.out.println();
		
	}
}
