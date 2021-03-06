package staticex;
//class 속에는 보통 메인이 없다
//public class는 파일 안에 1개만 + 파일이름과 동일
public class Student {

	private static int serialNum = 1000;
	private int studentID; //private으로 하면 클래스의 외부에서 참조 불가
	public String studentName;
	public String address;
//객체 생성을 하는데 필요한 초기화 작업을 할때 생성자가 쓰인다
//같은 이름의 메소드가 매개변수가 다른 경우 == 오버로딩
	
	public Student(String name) {
		studentName = name;
		serialNum++;
		studentID = serialNum;
	}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "주소 없음";
		serialNum++;
		studentID = serialNum;
	}
//메서드는 객체의 기능을 구현하기 위해 클래스 내부에 구현되는 함수
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
		//studentName = "Lee"; static method 안에서 인스턴스 변수는 쓸 수 없다.
		//static method는 그냥 바로 쓸 수 있는데 인스턴스는 new 해야 생기기 때문
		//static 변수는 프로그램이 로드 될 때 바로 데이터 영역에 생성 
		//따라서 static은 큰 걸 쓰면 로드 될 때 데이터 영역에 부담
		//좋은 프로그램이 아니다.
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
	
	
}
