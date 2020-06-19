package variale;

public class CharTest {
	
	public static void main(String[] args) {
		
		char ch = 'A';
		
		System.out.println(ch);
		System.out.println((int)ch);
		
		int iCh = 66;
		System.out.println(iCh);
		System.out.println((char)iCh);
		
		//char ch2 = -66; 음수는 안 됨
		
		char hangul = '\uAC00'; //'가'의 유니코드
		System.out.println(hangul);
		
		char ch2 = '한';
		System.out.println(ch2);
		
	}

}
