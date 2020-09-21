package innerclass;


class Outer2{
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		
		int num = 100; //지역변수는 그 메서드가 호출돼서 끝날때까지만 유효함
		return new Runnable(){

			@Override
			public void run() { //하지만 run()은 언제든지 불릴 수 있음
				
				//num += 10;
				//i = 200;
				
				System.out.println(num); //결국 상수가 되기때문에 참조는O 변경은X
				System.out.println(i);
				System.out.println(outNum);
				System.out.println(Outer.sNum);
				
			}
		}; //구현의 끝이다 라는 의미의 세미콜론
			
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
