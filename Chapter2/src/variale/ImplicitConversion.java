package variale;

public class ImplicitConversion {

	public static void main(String[] args) {

		//묵시적 형 변환
		byte bNum = 10;
		int iNum = bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum; //정수가 플롯으로 플롯의 결과가 더블로 2번 형 변환
		
		System.out.println(dNum);
	}

}
