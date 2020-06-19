package q;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("홀수를 입력하세요.");
		int line  = scanner.nextInt();
		int space = line / 2 + 1;
		int star = 1;
		
		for(int i = 0; i < line; i++) {
			
			for(int j = 0; j < space; j++) {
				System.out.print(' ');
			}

			for(int j = 0; j < star; j++) {
				System.out.print("*");
			}
			
			for(int j = 0; j < space; j++) {
				System.out.print(' ');
			}
			
			if(i < line/2) {
				space -= 1;
				star += 2;
			}
			
			else {
				space += 1;
				star -= 2;
			}
			System.out.println();
		}
	}
}
