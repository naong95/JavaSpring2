package variale;

public class IntergerTest {
	
	public static void main(String[] args) {
		
		byte bs = 127;
		
		System.out.println(bs);
		
		//int iVal = 12345678900; out of range
		long lval = 12345678900L; //자바는 기본적으로 들어오는 숫자를 int(4byte)에 집어넣음 -> L 써줘야 long으로 쓸 수 있다
		System.out.println(lval);
	}

}
