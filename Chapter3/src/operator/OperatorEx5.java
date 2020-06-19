package operator;

public class OperatorEx5 {

	public static void main(String[] args) {

		int num1 = 0b00001010; //10
		int num2 = 0b00000101; //5
		
		System.out.println(num1 & num2);
		System.out.println(num1 | num2);
		System.out.println(num1 ^ num2);
		
		System.out.println(num2 << 3);
		System.out.println(num2); //민다고 num2 값이 변하진 않음
		System.out.println(num2 <<= 3);
		System.out.println(num2); //변하게 하고 싶으면 대입 연산자 사용
		
		System.out.println(num2 >> 3);
	}

}
