import java.util.Scanner;

class Anti8lotSystem {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		String s[] = new String[5];
		int x = 0;
		int arr[] = new int[5];
		
		for (int i = 0; i < cases; i++) {
			for (int j = 0; j < 5; j++) {
				s[j] = scan.next();
				
				if (s[j].contains("machula")) {
					x = j;
				} else if (j != 1 && j != 3) {
					arr[j] = Integer.parseInt(s[j]);
				}
			}
			if (x == 0) {
				System.out.println((arr[4] - arr[2]) + " " + "+" + " " + arr[2] + " " + "=" + " " + arr[4]);
			} else if (x == 2) {
				System.out.println(arr[0] + " " + "+" + " " + (arr[4] - arr[0]) + " " + "=" + " " + arr[4]);
			} else if (x == 4) {
				System.out.println(arr[0] + " " + "+" + " " + arr[2] + " " + "=" + " " + (arr[2] + arr[0]));
			}
		}
	}
}