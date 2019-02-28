import java.util.Scanner;

class SmpWow {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		String w = "W";
		
		for (int i = 1; i < input; i++) {
			
			w+="o";
			
		}
		// changed i and added "ow" just for esthetics :)
		System.out.println(w+"ow");
		
		
		
	}
	
	
}
