package classpart;
//class �ӿ��� ���� ������ ����
//public class�� ���� �ȿ� 1���� + �����̸��� ����
public class Student {

	private int studentID; //private���� �ϸ� Ŭ������ �ܺο��� ���� �Ұ�
	public String studentName;
	public String address;
//��ü ������ �ϴµ� �ʿ��� �ʱ�ȭ �۾��� �Ҷ� �����ڰ� ���δ�
//���� �̸��� �޼ҵ尡 �Ű������� �ٸ� ��� == �����ε�
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "�ּ� ����";
	}
//�޼���� ��ü�� ����� �����ϱ� ���� Ŭ���� ���ο� �����Ǵ� �Լ�
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
}
