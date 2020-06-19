package ifexample;

import java.util.Scanner;

public class problem1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		char rank;
		int score = scanner.nextInt();
		
		if( 89 < score && score < 101) {
			rank = 'A';
		}
		else if( score > 79) {
			rank = 'B';
		}
		else if( score > 69) {
			rank = 'C';
		}
		else if( score > 59) {
			rank = 'D';
		}
		else {
			rank = 'F';
		}
		
		System.out.println("ÇÐÁ¡: " + rank);
		
		/*
		int a = 10;
		int b = 20;
		
		int max;
		
		max = (a > b)? a : b;
		System.out.println(max);
		*/
	}

}
