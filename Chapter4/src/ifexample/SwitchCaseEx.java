package ifexample;

import java.util.Scanner;

public class SwitchCaseEx {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		char medalColor;
		int rank = scanner.nextInt();
		
		switch(rank) {
			case 1: medalColor = 'G';
				System.out.println("금메달");
				break; //안 쓰면 계속 문장 수행
			case 2: medalColor = 'S';
				System.out.println("은메달");
				break;
			case 3: medalColor = 'B';
			    System.out.println("동메달");
				break;
			default: medalColor = 'A';
		}
		
		System.out.println( rank + "등은 " + medalColor + "메달 입니다");
	}

}
