import java.util.*;

class Seinfeld {
	public static void main(String[] args) {

		Stack<Character> stack = new Stack<Character>();
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		StringBuffer s = new StringBuffer(input);
		int change = 0;
		int position = 1;
		
		while (s.charAt(0) != '-') {
			
			change = 0;
			
			for (int i = 0; i < s.length(); i++) {
				
				if (stack.empty()) {
					
					if (s.charAt(i) == '}') {
						change++;
						s.setCharAt(i, '{');
					}
					stack.push(s.charAt(i));
				} else {
					if (s.charAt(i) == '}') {
						if (stack.peek() == '{') {
							stack.pop();
						} else {
							stack.push(s.charAt(i));
						}
					} else {
						stack.push(s.charAt(i));
					}
				}
			}
			int x = 0;
			while (!stack.empty()) {
				stack.pop();
				x++;
			}
			change += x / 2;
			
			System.out.println(position + ". " + change);
			position++;
			
			input = scan.next();
			s = new StringBuffer(input);
		}
	}
}