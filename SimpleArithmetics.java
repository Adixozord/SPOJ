import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class SimpleArithmetics {

	static Pattern p = Pattern.compile("(\\d+)(\\+|\\-|\\*)(\\d+)");
	static Matcher m = null;

	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = 0;

		Stack<String> operations = new Stack<String>();

		try {
			t = Integer.parseInt(br.readLine());

			while (t > 0) {
				operations.push(br.readLine());
				t--;
			}

			for (String s : operations) {
				procesor(s);
				System.out.println();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void procesor(String operation) {
		BigDecimal firstOperand, secondOperand, result, tempResult, tempNum;
		String operator, operandStr = "";
		int largeLine = 0, largeResult = 0;

		m = p.matcher(operation);
		m.matches();

		firstOperand = new BigDecimal(m.group(1));
		secondOperand = new BigDecimal(m.group(3));
		operator = m.group(2);

		operandStr = operator + secondOperand.toPlainString();

		if (!operator.equals("*")) {
			if (operator.equals("-")) {
				secondOperand = secondOperand.negate();
			}
			result = firstOperand.add(secondOperand);

			largeResult = result.toPlainString().length();
			largeLine = Math.max(operandStr.length(), largeResult);

			System.out.println(padLeft(firstOperand.toPlainString(), largeLine));
			System.out.println(padLeft(operandStr, largeLine));
			System.out.println(line(largeLine));
			System.out.println(padLeft(result, largeLine));

		} else {
			result = firstOperand.multiply(secondOperand);

			largeResult = result.toPlainString().length();
			largeLine = Math.max(firstOperand.toPlainString().length(), operandStr.length());

			System.out.println(padLeft(firstOperand.toPlainString(), largeResult));
			System.out.println(padLeft(operandStr, largeResult));

			int n = operandStr.length();
			boolean hayLine = false;
			if (n > 2) {
				int k = 0;
				for (int i = n - 1; i >= 1; i--) {
					tempNum = new BigDecimal(operandStr.charAt(i) + "");
					tempResult = firstOperand.multiply(tempNum);
					if (!hayLine) {
						hayLine = true;
						largeLine = Math.max(operandStr.length(), tempResult.toPlainString().length());
						System.out.println(padLeft(line(largeLine), largeResult));
					}

					System.out.println(padLeft(tempResult, largeResult - (k++)));
				}
			}

			System.out.println(line(largeResult));
			System.out.println(result);
		}
	}

	public static String line(int n) {
		return String.format(String.format("%%0%dd", n), 0).replace("0", "-");
	}

	public static String padLeft(String s, int n) {
		return String.format("%1$" + n + "s", s);
	}

	public static String padLeft(BigDecimal bd, int n) {
		return padLeft(bd.toPlainString(), n);
	}
}