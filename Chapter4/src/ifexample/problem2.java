package ifexample;

import java.util.Scanner;

public class problem2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("��¥ ���� �˰� ���� ���� �Է��ϼ���.");
		int day;
		int month = scanner.nextInt();
		
		switch(month) {
			case 2: day = 28;
				break;
			case 4: case 6: case 9: case 11: day = 30;
				break;
			default: day = 31;
		}
		
		System.out.println(month + "���� �� " + day + "���Դϴ�.");
	}

}
