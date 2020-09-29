package exception;

public class IDFormatTest {

	private String userID;
	 
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) throws IDFormatException {
		
		if(userID == null) {
			throw new IDFormatException("���̵�� null�� �� �����ϴ�.");
		}
		else if(userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("���̵�� 8�� �̻� 20�� ���Ϸ� ������.");
		}
		
		this.userID = userID;
	}

	public static void main(String[] args) {

		IDFormatTest idTest = new IDFormatTest();
		
		String myID = null;
		
		try {
			idTest.setUserID(myID);
		} catch (IDFormatException e) {
			System.out.println(e);
		}
		
		myID = "123456";
		
		try {
			idTest.setUserID(myID);
		} catch (IDFormatException e) {
			System.out.println(e);
		}
	}

}