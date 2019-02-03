import java.util.Scanner;

public class PrimeNumsGenerator {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("No. of cases?");
		int numOfCases = scan.nextInt();
		int[][] cases = new int[numOfCases][2];
		
		for(int i = 0; i < numOfCases; i++) {
			System.out.println("Min: ");
			int min = scan.nextInt();
			System.out.println("Max: ");
			int max = scan.nextInt();
			int[] oneCase = new int[2];
			oneCase[0]=min;
			oneCase[1]=max;
			cases[i]=oneCase;
		}
		
		for(int j = 2; )
		
		
	}
}