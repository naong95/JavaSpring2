package innerclass;


class Outer{
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		
		int num = 100; //���������� �� �޼��尡 ȣ��ż� ������������ ��ȿ��
		class MyRunnable implements Runnable{

			@Override
			public void run() { //������ run()�� �������� �Ҹ� �� ����
				
				//num += 10;
				//i = 200;
				
				System.out.println(num); //�ᱹ ����� �Ǳ⶧���� ������O ������X
				System.out.println(i);
				System.out.println(outNum);
				System.out.println(Outer.sNum);
				
			}
			
		}
		
		return new MyRunnable();
				
	}
}


public class LocalInnerClassTest {

	public static void main(String[] args) {

		Outer outer = new Outer();
		Runnable runnable = outer.getRunnable(50);
		
		runnable.run();
	}

}
