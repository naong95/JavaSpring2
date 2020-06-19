package hiding;

public class MyDateTest {

	public static void main(String[] args) {

		MyDate date1 = new MyDate(29, 2, 2000);
		MyDate date2 = new MyDate(7, 8, 1995);
		date1.isValid();
		date2.isValid();
	}

}
