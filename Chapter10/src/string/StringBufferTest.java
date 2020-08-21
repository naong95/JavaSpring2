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
		
		//������ �����ϸ� �� �ּҿ� ���ο� ��Ʈ���� �Ǵ°� �ƴ϶� �� �ּҿ� ���� ����°Ŷ� ���� �Ƴ� �� �ִ�.
	}

}
