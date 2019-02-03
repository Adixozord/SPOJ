import java.util.Scanner;
import java.util.stream.IntStream;

public class Sumator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many cases am i dealing with?");
		int cases = scan.nextInt();
		
		for(int i = 0; i < cases; i++) {
			
			System.out.println("How many nums are we adding today?");
			int numOfNums = scan.nextInt();

			int[] allNums = new int[numOfNums];

			for(int j = 0; j < numOfNums; j++) {
				int num = scan.nextInt();
				allNums[j] = num;
			}
			System.out.println(IntStream.of(allNums).sum());
		}
		
	}

}
