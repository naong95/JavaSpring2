package operator;

public class OperatorEx5 {

	public static void main(String[] args) {

		int num1 = 0b00001010; //10
		int num2 = 0b00000101; //5
		
		System.out.println(num1 & num2);
		System.out.println(num1 | num2);
		System.out.println(num1 ^ num2);
		
		System.out.println(num2 << 3);
		System.out.println(num2); //�δٰ� num2 ���� ������ ����
		System.out.println(num2 <<= 3);
		System.out.println(num2); //���ϰ� �ϰ� ������ ���� ������ ���
		
		System.out.println(num2 >> 3);
	}

}
