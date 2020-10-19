package operator;

public class OperatorEx1 {

	public static void main(String[] args) {

		int num1 = -10;
		int num2 = 20;
		
		System.out.println(+num1);
		System.out.println(+num2);
		
		System.out.println(-num1);
		System.out.println(-num2); //직접 그 값을 바꾸진 않는다
		
		System.out.println(num1);
		System.out.println(num2); 
		
		num1 = -num1;
		
		System.out.println(num1); //직접 바꾸고 싶다면 대입 연산자로
	}
	//update

}
