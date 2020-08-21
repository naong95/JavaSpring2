package string;

public class StringBufferTest {

	public static void main(String[] args) {

		String java = new String("java");
		String android = new String("android");
		
		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(buffer));
		buffer.append("android");
		
		java = buffer.toString();
		System.out.println(System.identityHashCode(buffer));
		
		//빌더로 연결하면 새 주소에 새로운 스트링이 되는게 아니라 그 주소에 새로 만드는거라 힙을 아낄 수 있다.
	}

}
