import java.util.*;
import java.io.*;
import java.lang.*;

class Parser {
	final private int BUFFER_SIZE = 1 << 16;

	private DataInputStream din;
	private byte[] buffer;
	private int bufferPointer, bytesRead;

	public Parser(InputStream in) {
		din = new DataInputStream(in);
		buffer = new byte[BUFFER_SIZE];
		bufferPointer = bytesRead = 0;
	}

	public int nextInt() throws Exception {

		int ret = 0;
		byte c = read();
		while (c <= ' ')
			c = read();
		boolean neg = c == '-';
		if (neg)
			c = read();
		do {
			ret = ret * 10 + c - '0';
			c = read();
		} while (c > ' ');
		if (neg)
			return -ret;
		return ret;
	}

	public StringBuilder next() throws Exception {
		StringBuilder inputline = new StringBuilder("");
		int ret = 0;
		byte c = read();
		while (c != '\n') {
			inputline.append((char) c);
			c = read();
		}

		return inputline;
	}

	private void fillBuffer() throws Exception {
		bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
		if (bytesRead == -1)
			buffer[0] = -1;
	}

	private byte read() throws Exception {
		if (bufferPointer == bytesRead)
			fillBuffer();
		return buffer[bufferPointer++];
	}
}

public class AddingSevens {

	public static void timeCode(StringBuilder code) {
		String num_to_code[] = { "063", "010", "093", "079", "106", "103", "119", "011", "127", "107" };
		int code_to_num[] = new int[128];
		code_to_num[63] = 0;
		code_to_num[10] = 1;
		code_to_num[93] = 2;
		code_to_num[79] = 3;
		code_to_num[106] = 4;
		code_to_num[103] = 5;
		code_to_num[119] = 6;
		code_to_num[11] = 7;
		code_to_num[127] = 8;
		code_to_num[107] = 9;

		// convert the code to nums
		String a = code.substring(0, code.indexOf("+"));
		String b = code.substring(code.indexOf("+") + 1, code.indexOf("="));
		String anum = "";
		String bnum = "";

		System.out.println("A: " + a + "\nB: " + b);

		// convert a from code to num
		for (int i = 0; i < a.length(); i += 3) {
			if (a.charAt(i) == '0') {
				anum += code_to_num[Integer.parseInt(a.substring(i + 1, i + 3))];
			} else {
				anum += code_to_num[Integer.parseInt(a.substring(i, i + 3))];
			}
		}

		// convert b from code to nums
		for (int i = 0; i < b.length(); i += 3) {
			if (b.charAt(i) == '0') {
				bnum += code_to_num[Integer.parseInt(b.substring(i + 1, i + 3))];
			} else {
				bnum += code_to_num[Integer.parseInt(b.substring(i, i + 3))];
			}
		}

		System.out.println("Converted A: " + anum + "\nConverted B: " + bnum);

		// sum of nums
		String sum1 = String.valueOf(Integer.parseInt(anum) + Integer.parseInt(bnum));
		String sum2 = "";
		System.out.println("Sum: " + sum1);
		for (int j = 0; j < sum1.length(); j++) {
			sum2 += num_to_code[Integer.parseInt(sum1.substring(j, j + 1))];
		}
		System.out.println("Converted sum: " + sum2);
		code.append(sum2);
		System.out.println(code);

	}

	public static void main(String[] args) throws Exception {
		
		Parser scan = new Parser(System.in);
		StringBuilder input = scan.next();

		while (!input.toString().equals("BYE")) {
			timeCode(input);
			input = scan.next();
		}
	}
}