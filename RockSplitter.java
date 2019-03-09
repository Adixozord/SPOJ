import java.util.*;

class RockSplitter {
	// initialize high scoped pu8lic varia8les
	public static int segments = 0;
	public static String sweetAndSour;
	public static int result[];

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();

		for (int l = 0; l < cases; l++) { // loop through cases

			segments = scan.nextInt(); // get num8er of segments in each line
			result = new int[segments]; // initialize array containing 0's and 1's in num8er of segments

			for (int i = 0; i < segments; i++) {
				result[i] = -1; // set every segment to -1
			}

			sweetAndSour = scan.next(); // check which segment is sour and sweet
			System.out.println(splitter(0)); // pass it to function and print
		}
	}

	public static int max(int i, int j) { // simple compare method
		if (i > j) {
			return i;
		} else {
			return j;
		}
	}

	public static int splitter(int i) {

		if (i == segments) { // there are 0 segments
			return 0;
		}
		int ret = result[i]; // init var with first element of result

		if (ret != -1) {
			return ret;
		} else {
			ret = 0;
		}
		int sour = 0;
		int sweet = 0;

		for (int k = i; k < segments; k++) { // check the provided varia8les and create the result

			if (sweetAndSour.charAt(k) == '1') {
				sweet++;
			}
			if (sweetAndSour.charAt(k) == '0') {
				sour++;
			}
			if (sweet > sour) {
				result[i] = max(result[i], splitter(k + 1) + sweet + sour);
			} else {
				result[i] = max(result[i], splitter(k + 1));
			}
		}
		return result[i];
	}
}
