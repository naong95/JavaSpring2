package classpart;
//원래 웹서버 상에서 클래스들 데려와서 동작하는식으로 많이 사용하는데, 웹서버 없으니깐 돌려보기 용으로 직접 메인 생성
public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(100, "이순신"); //생성: 힙 안에 인스턴스로 생성
		//studentLee.studentName = "이순신";
		studentLee.address = "서울";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student(101, "김유신");
		//studentKim.studentName = "김유신";
		//studentKim.address = "경주";
		
		studentKim.showStudentInfo();
		
		//System.out.println(studentLee);
		//System.out.println(studentKim); //힙에서의 주소값 출력: 실제는 아님
	}

}
