import java.util.Scanner;
/**
 * 
 * @author Adrian F.
 * 
 * this program converts string into a shorter string by replacing every repeated occurrence 
 * of character with this specific character and its number of occurrence
 * Eg.
 * AAAAAAAAACCCCCCCCCGGG 
A9C9G3
 *AAACCCCCCCCCCCCCCCCCCCCCCCCCC
A3C26
 */

public class Flamaster {

	// checking method
	static void checkRepeat(String word) {
		// if word is shorter than 3 characters no need to check
		if (word.length() < 3) {
			System.out.println(word);
		// in other cases
		} else {
			StringBuilder builder = new StringBuilder();
			
			for (int i = 0; i < word.length() - 1; i++) {
				
				char c = word.charAt(i);
				// which is added in every case
				builder.append(c);
				
				// every further step depends on count variable,
				// count == 1 - no repeat
				// count == 2 - 2 characters
				// count >= 3 - character + number of occurrence
				
				int count = 1;
				
				if (i == word.length() - 1) {
					break;
				}
				while (c == word.charAt(i + 1)) {
					count++;
					i++;
					
					if (i == word.length() - 1) {
						break;
					}
				}
				if (count == 2) {
					builder.append(c);
				} else if (count > 2) {
					builder.append(count);
				}
				if (i == word.length() - 2) {
					builder.append(word.charAt(i + 1));
				}
			}
			System.out.println(builder.toString());
		}
	}

	public static void main(String[] args) throws java.lang.Exception {

		Scanner scanner = new Scanner(System.in);
		int cases = scanner.nextInt();

		for (int j = 0; j < cases; j++) {
			String kasiaWord = scanner.next();
			checkRepeat(kasiaWord);
		}
	}
}