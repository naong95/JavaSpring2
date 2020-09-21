package innerclass;


class Outer2{
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		
		int num = 100; //���������� �� �޼��尡 ȣ��ż� ������������ ��ȿ��
		return new Runnable(){

			@Override
			public void run() { //������ run()�� �������� �Ҹ� �� ����
				
				//num += 10;
				//i = 200;
				
				System.out.println(num); //�ᱹ ����� �Ǳ⶧���� ������O ������X
				System.out.println(i);
				System.out.println(outNum);
				System.out.println(Outer.sNum);
				
			}
		}; //������ ���̴� ��� �ǹ��� �����ݷ�
			
	}
	
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {

			System.out.println("test");
		}
	};
}


public class AnonymousInnerClassTest {

	public static void main(String[] args) {

		Outer2 outer = new Outer2();
		outer.runner.run();
		
		Runnable runnable = outer.getRunnable(50);
		
		runnable.run();
	}

}
