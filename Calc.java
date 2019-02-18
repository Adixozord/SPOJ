import java.util.*;
import java.lang.*;

/* Input:
+ 7 9
- 0 4
* 5 6
/ 8 3
% 5 2

Output:
16
-4
30
2
1
*/

class Calc
{
	public static void main (String[] args) throws java.lang.Exception{

		Scanner scan = new Scanner(System.in);
		int i = 0;
		while(i<= 100){
			char operator = scan.next().charAt(0);
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
		switch (operator) {
		case '+':
			System.out.println(num1+num2);
			break;
		case '-':
			System.out.println(num1-num2);
			break;
		case '*':
			System.out.println(num1*num2);
			break;
		case '/':
			System.out.println(num1/num2);
			break;
		case '%':
			System.out.println(num1%num2);
		default:
			i++;
		}
	}
}
}