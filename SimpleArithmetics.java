import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class SimpleArithmetics {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Pattern regex = Pattern.compile("[*+-]");

		int cases = scan.nextInt();
		scan.nextLine();

		while (cases > 0) {

			String input = scan.nextLine();

			long first = Integer.parseInt(input.substring(0, indexOf(regex, input)));
			String operator = Character.toString(input.charAt(indexOf(regex, input)));
			long second = Integer.parseInt(input.substring(indexOf(regex, input) + 1, input.length()));
			long result = 0;

			int firstLineLength = String.valueOf(first).length();
			int secondLineLength = String.valueOf(second).length();

			int repeats = secondLineLength;
			int[] expressions = new int[repeats];

			switch (operator.charAt(0)) {
			case '+':
				result += first + second;
				break;
			case '*':

				for (int i = repeats - 1; i >= 0; i--) {

					int reversedIndex = 0;
					expressions[i] = (int) (first * Character.getNumericValue(Integer.toString((int) second).charAt(i)));
				}
				result += first * second;
				break;
			case '-':
				result += first - second;
				break;
			case '/':
				result += first / second;
				break;
			}
			String firstLine = "";
			String secondLine = "";

			if (operator.charAt(0) != '*') {
				if (firstLineLength > secondLineLength) {
					for (int filler = 0; filler < firstLineLength - secondLineLength - 1; filler++) {
						secondLine += " ";
					}

				} else {
					for (int filler = 0; filler <= secondLineLength - firstLineLength; filler++) {
						firstLine += " ";
					}
				}
				secondLine += operator + second;
				firstLine += first;

				System.out.println(firstLine);
				System.out.println(secondLine);
				createLine(0, secondLine.length());
				System.out.println(result);
			} else {
				if (firstLineLength > secondLineLength) {
					for (int filler = 0; filler < firstLineLength - secondLineLength + expressions.length; filler++) {
						secondLine += " ";
						firstLine += " ";
					}
				} else {
					for (int filler = 0; filler <= secondLineLength - firstLineLength + expressions.length
							- 1; filler++) {
						firstLine += " ";
						secondLine += " ";
					}
				}
				secondLine += operator + second;
				firstLine += first;
				System.out.println(firstLine);
				System.out.println(secondLine);
				createLine(expressions.length + 1, secondLine.length());
				for (int i = expressions.length - 1; i >= 0; i--) {
//					createLine()
					System.out.println(expressions[i]);
				}
				createLine(0, String.valueOf(result).length());
				System.out.println(result);

			}
			System.out.println("");
			cases--;
		}
	}

	private static void createLine(int start, int length) {
		String line = "";
		for (int i = 0; i < length; i++) {
			line += (i < start) ? " " : "-";
		}
		System.out.println(line);
	}

	public static int indexOf(Pattern pattern, String string) {
		Matcher matcher = pattern.matcher(string);
		return matcher.find() ? matcher.start() : -1;
	}
}
