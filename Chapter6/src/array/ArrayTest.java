package array;

public class ArrayTest {

	public static void main(String[] args) {

		int[] arr = new int[10];
		//����� ���ÿ� �ʱ�ȭ�� ���� �ϸ� 
		//new ���� ���� + length �ȿ� ���� ���� �� ��
		
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
		//3���� ���� ������ ������ 2���� 0.0���� �ʱ�ȭ
		//��ȿ�� ���� ������ ����ϱ� ���ؼ� count ���� �������
		double mtotal = 1;
		for(int i = 0; i < count; i++) {
			mtotal *= darr[i]; 
		}
		
		System.out.print(mtotal);
			
		}

}
