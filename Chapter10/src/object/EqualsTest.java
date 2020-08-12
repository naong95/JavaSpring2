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
	} //물리적으로 다른 주소값에 있지만 논리적으로 같은 객체를 같다고 처리하기 위한 equals 재정의
	
	
	
}

public class EqualsTest {

	public static void main(String[] args) {

		Student Lee = new Student(100, "이순신");
		Student Lee2 = Lee;
		Student Shin = new Student(100, "이순신");
		
		System.out.println(Lee == Shin);
		System.out.println(Lee.equals(Shin));
		
		
		/*
		String str1 =new String("abc");
		String str2 =new String("abc");
	
		System.out.println(str1 == str2); //==은 두 개의 메모리 주소가 같냐?
		System.out.println(str1.equals(str2)); //같은 문자열이냐?
		*/
		
		System.out.println(Lee.hashCode());
		System.out.println(Shin.hashCode());
	}

}
