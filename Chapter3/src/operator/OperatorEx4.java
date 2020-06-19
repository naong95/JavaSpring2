package operator;

public class OperatorEx4 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		//단락 회로 평가: 앞 조건만 봐도 판단이 가능하기 때문에 뒤 쪽은 적용이 안 돼서 i == 2
		System.out.println(num1);
		System.out.println(i);
		
		System.out.println(value);
		
		boolean value1 = ((num2 = num2 + 10) < 10) || ((i = i + 2) < 10);
		//or 일때는 다른 결과
		System.out.println(num2);
		System.out.println(i);
		
		System.out.println(value1);
		
		
		int num3 = 10;
		int num4 = 20;
		
		int max = (num3 > num4)? num3 : num4;
		System.out.println(max);
		
	}

}
