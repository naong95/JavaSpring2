package classpart;
//���� ������ �󿡼� Ŭ������ �����ͼ� �����ϴ½����� ���� ����ϴµ�, ������ �����ϱ� �������� ������ ���� ���� ����
public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(100, "�̼���"); //����: �� �ȿ� �ν��Ͻ��� ����
		//studentLee.studentName = "�̼���";
		studentLee.address = "����";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student(101, "������");
		//studentKim.studentName = "������";
		//studentKim.address = "����";
		
		studentKim.showStudentInfo();
		
		//System.out.println(studentLee);
		//System.out.println(studentKim); //�������� �ּҰ� ���: ������ �ƴ�
	}

}
