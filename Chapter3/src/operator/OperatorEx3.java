package operator;

public class OperatorEx3 {

	public static void main(String[] args) {

		int score = 100;
		
		System.out.println(++score);
		//score = score + 1;
		//score += 1;
		
		System.out.println(score++); //++이 뒤에 있기 때문에 출력 먼저 하고 값 증가
		System.out.println(score);
		System.out.println(--score);
		System.out.println(score--);
		System.out.println(score);
	}

}
