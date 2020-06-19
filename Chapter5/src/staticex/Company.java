package staticex;

public class Company {

	private static Company instance = new Company();	
	
	private Company() {}
	
	public static Company getInstance() { 
		//외부에서 인스턴스 생성과 상관없이 
		//호출할 수 있게 하기 위해 static으로 만든다.
		
		if (instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
	
}
