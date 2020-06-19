package loopexample;

public class ForExample {

	public static void main(String[] args) {

		int count = 1;
		int sum = 0;
		
		for(int i = 0; i < 10; i++, count++) { //10번이라는 횟수를 사용할때는 0부터
			sum += count;
		}
		
		System.out.println(sum);
		
		for(;;) { //for문의 무한루프 == while(true)
			
		}
	}

}
