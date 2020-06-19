package staticex;

public class Company {

	private static Company instance = new Company();	
	
	private Company() {}
	
	public static Company getInstance() { 
		//�ܺο��� �ν��Ͻ� ������ ������� 
		//ȣ���� �� �ְ� �ϱ� ���� static���� �����.
		
		if (instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
	
}
