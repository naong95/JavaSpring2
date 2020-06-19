package array;

public class ArrayQuiz {

	public static void main(String[] args) {

		char[] arr = new char[26];
		char code = 'A';
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = code;
			code++;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}

}
