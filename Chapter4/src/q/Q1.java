package q;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String operator = scanner.next();
		
		int num1 = 10;
		int num2 = 5;
		int result;
		
		/*if (operator.equals("+")) {
			result = num1 + num2;
		}
		else if(operator.equals("-")) {
			result = num1 - num2;
		}
		else if(operator.equals("*")) {
			result = num1 * num2;
		}
		else {
			result = num1 / num2;
		}*/
		
		switch(operator) {
		case "+": result = num1 + num2;
			break;
		case "-": result = num1 - num2;
			break;
		case "*": result = num1 * num2;
			break;
		default: result = num1 / num2;
		}
		
		System.out.println("결과값은 " + result + " 입니다.");
	}

}
