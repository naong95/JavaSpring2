package staticex;
//class �ӿ��� ���� ������ ����
//public class�� ���� �ȿ� 1���� + �����̸��� ����
public class Student {

	private static int serialNum = 1000;
	private int studentID; //private���� �ϸ� Ŭ������ �ܺο��� ���� �Ұ�
	public String studentName;
	public String address;
//��ü ������ �ϴµ� �ʿ��� �ʱ�ȭ �۾��� �Ҷ� �����ڰ� ���δ�
//���� �̸��� �޼ҵ尡 �Ű������� �ٸ� ��� == �����ε�
	
	public Student(String name) {
		studentName = name;
		serialNum++;
		studentID = serialNum;
	}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "�ּ� ����";
		serialNum++;
		studentID = serialNum;
	}
//�޼���� ��ü�� ����� �����ϱ� ���� Ŭ���� ���ο� �����Ǵ� �Լ�
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public int getStudentID() {
		return studentID;
	}

	public static int getSerialNum() {
		//studentName = "Lee"; static method �ȿ��� �ν��Ͻ� ������ �� �� ����.
		//static method�� �׳� �ٷ� �� �� �ִµ� �ν��Ͻ��� new �ؾ� ����� ����
		//static ������ ���α׷��� �ε� �� �� �ٷ� ������ ������ ���� 
		//���� static�� ū �� ���� �ε� �� �� ������ ������ �δ�
		//���� ���α׷��� �ƴϴ�.
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
	
	
}
