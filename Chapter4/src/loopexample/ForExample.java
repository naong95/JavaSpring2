package loopexample;

public class ForExample {

	public static void main(String[] args) {

		int count = 1;
		int sum = 0;
		
		for(int i = 0; i < 10; i++, count++) { //10���̶�� Ƚ���� ����Ҷ��� 0����
			sum += count;
		}
		
		System.out.println(sum);
		
		for(;;) { //for���� ���ѷ��� == while(true)
			
		}
	}

}
