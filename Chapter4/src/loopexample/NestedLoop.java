package loopexample;

public class NestedLoop {

	public static void main(String[] args) {

		// 2(dan) X 3(count)
		/*int dan;
		int count;
		
		for(dan = 2; dan <= 9; dan++) {
			
			for(count = 1; count <=9; count++) {
				
				System.out.println(dan + " X " + count + " = " + dan * count);
			}
			System.out.println();
		}*/
		
		int dan = 2;
		int count = 1;
		
		while(dan <= 9) {
			count = 1; //count �ʱ�ȭ�� �� �Ǳ� ������ �ʱ�ȭ�� ��������Ѵ�. for���� �ξ� ���ϰ� �б� ����
			while(count <= 9) {
				System.out.println(dan + " X " + count + " = " + dan * count);
				count++;
				
			}
			dan++;
			System.out.println();
		}
	}

}
