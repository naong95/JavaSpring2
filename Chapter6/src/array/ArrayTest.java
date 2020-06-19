package array;

public class ArrayTest {

	public static void main(String[] args) {

		int[] arr = new int[10];
		//선언과 동시에 초기화를 같이 하면 
		//new 생략 가능 + length 안에 숫자 쓰면 안 됨
		
		int total = 0;
		
		for(int i = 0, num = 1; i < arr.length; i++, num++) {
			arr[i] = num;
		}
		
		for(int i = 0; i < arr.length; i++) {
			total += arr[i];
			System.out.print(arr[i] + " ");
		}
		System.out.println(total);
		
		double[] darr = new double[5];
		int count = 0;
		darr[0] = 1.1; count++;
		darr[1] = 2.1; count++;
		darr[2]	= 3.1; count++;
		//3개만 값을 줬으니 나머지 2개는 0.0으로 초기화
		//유효한 값의 범위만 사용하기 위해서 count 변수 사용했음
		double mtotal = 1;
		for(int i = 0; i < count; i++) {
			mtotal *= darr[i]; 
		}
		
		System.out.print(mtotal);
			
		}

}
