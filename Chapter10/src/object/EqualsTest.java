package object;

class Student{
	int studentNum;
	String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			
			Student std = (Student)obj;
			//return (this.studentNum == std.studentNum);
			
			if(this.studentNum == std.studentNum)
				return true;
			else return false;
		}
		return false;
	} //���������� �ٸ� �ּҰ��� ������ �������� ���� ��ü�� ���ٰ� ó���ϱ� ���� equals ������
	
	
	
}

public class EqualsTest {

	public static void main(String[] args) {

		Student Lee = new Student(100, "�̼���");
		Student Lee2 = Lee;
		Student Shin = new Student(100, "�̼���");
		
		System.out.println(Lee == Shin);
		System.out.println(Lee.equals(Shin));
		
		
		/*
		String str1 =new String("abc");
		String str2 =new String("abc");
	
		System.out.println(str1 == str2); //==�� �� ���� �޸� �ּҰ� ����?
		System.out.println(str1.equals(str2)); //���� ���ڿ��̳�?
		*/
		
		System.out.println(Lee.hashCode());
		System.out.println(Shin.hashCode());
	}

}
