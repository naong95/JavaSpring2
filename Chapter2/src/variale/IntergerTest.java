package variale;

public class IntergerTest {
	
	public static void main(String[] args) {
		
		byte bs = 127;
		
		System.out.println(bs);
		
		//int iVal = 12345678900; out of range
		long lval = 12345678900L; //�ڹٴ� �⺻������ ������ ���ڸ� int(4byte)�� ������� -> L ����� long���� �� �� �ִ�
		System.out.println(lval);
	}

}
