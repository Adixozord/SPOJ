import java.util.Scanner;

public class TreasureFinder {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int tests = scan.nextInt();
		
		for(int i = 0; i < tests; i++) {
			
			int clues = scan.nextInt();
			int horizontal = 0;
			int vertical = 0;
			
			for(int j = 0; j < clues; j++) {
				
				int direction = scan.nextInt();
				int stepsClue = scan.nextInt();
				
				if (direction == 0) {
					horizontal+=stepsClue;
				} else if (direction == 1) {
					horizontal-=stepsClue;
				} else if (direction == 2) {
					vertical+= stepsClue;
				} else if (direction == 3) {
					vertical-= stepsClue;
				}
			}
				// higher equal / lower equal
			if (horizontal > 0 && vertical == 0) {
				System.out.println("0 "+horizontal);
			} else if (horizontal < 0 && vertical == 0) {
				System.out.println("1 "+Math.abs(horizontal));
				// higher equal / lower equal
				
				// higher / higher
			} else if (horizontal > 0 && vertical > 0) {
				System.out.println("0 "+horizontal);
				System.out.println("3 "+vertical);
			} else if (horizontal < 0 && vertical < 0) {
				System.out.println("1 "+Math.abs(horizontal));
				System.out.println("2 "+Math.abs(vertical));
				// lower / lower
				
				// equal higher / equal lower
			} else if (horizontal == 0 && vertical > 0) {
				System.out.println("3 "+ vertical);
			} else if (horizontal == 0 && vertical < 0) {
				System.out.println("2 "+ Math.abs(vertical));
				// equal higher / equal lower
				
				// lower higher / higher lower
			} else if (horizontal < 0 && vertical > 0) {
				System.out.println("1 "+Math.abs(horizontal));
				System.out.println("3 "+vertical);
			} else if (horizontal > 0 && vertical < 0) {
				System.out.println("0 "+horizontal);
				System.out.println("3 "+Math.abs(vertical));
				// lower higher / higher lower
			} else {
				System.out.println("studnia");
			}
		}		
	}
}
