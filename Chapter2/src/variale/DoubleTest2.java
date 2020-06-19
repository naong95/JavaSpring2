package variale;

public class DoubleTest2 {
	
	public static void main(String[] args) {
		
		double dNum = 1;
		
		for(int i = 0; i < 10000; i++) {
			
			dNum = dNum + 0.1;
		}
		
		//1001로 나오지 않음
		System.out.println(dNum);
	}

}
