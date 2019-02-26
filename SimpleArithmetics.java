import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleArithmetics {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Pattern regex = Pattern.compile("[*+-]");

		int cases = scan.nextInt();
		scan.nextLine();

		while (cases > 0) {

			String input = scan.nextLine();

			int first = Integer.parseInt(input.substring(0, indexOf(regex, input)));
			String operator = Character.toString(input.charAt(indexOf(regex, input)));
			int second = Integer.parseInt(input.substring(indexOf(regex, input) + 1, input.length()));
			int result = 0;
			
			switch (operator.charAt(0)) {
			case '+':
				result += first + second;
				break;
			case '*':
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
			String secondLine = operator+second;
			
			int firstLineLength = String.valueOf(first).length();
			int secondLineLength = String.valueOf(second).length();
			
			for(int filler = 0; filler <= secondLineLength-firstLineLength; filler++) {
				firstLine += " ";
			}
			
			
			firstLine += first;
		
			System.out.println(firstLine);
			System.out.println(secondLine);
			createLine(secondLineLength);
			System.out.println(result);
			
			cases--;
		}
	}

	private static void createLine(int length) {
		String line = "";
		for(int i = 0; i < length; i++) {
			line+= "-";
		}
		System.out.println(line);
	}

	public static int indexOf(Pattern pattern, String string) {
		Matcher matcher = pattern.matcher(string);
		return matcher.find() ? matcher.start() : -1;
	}

}
