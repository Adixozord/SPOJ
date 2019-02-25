import java.util.Scanner;

/* this program takes users input and returns every 2nd character of half of the string 
Created by - Adrian F.
*/

public class HalfOfTheHalf {
	
		public static void main(String[] args) throws java.lang.Exception {

			Scanner scan = new Scanner(System.in);

			int cases = scan.nextInt();
			
			for (int j = -1; j < cases; j++) {
				String word = scan.nextLine();
				String result = "";
				for (int i = 0; i < word.length() / 2; i += 2) {
					result += word.charAt(i);
				}
				System.out.println(result);
			}
		}
	}
