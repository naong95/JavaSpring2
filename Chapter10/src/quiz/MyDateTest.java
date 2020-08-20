package quiz;

class MyDate{
	int day;
	int month;
	int year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate d1 = (MyDate)obj;
			
			if(this.day == d1.day && this.month == d1.month && this.year == d1.year) {
				return true;
			}
			else return false;
		}
		return false;
	}
	
	
	
}

public class MyDateTest {

	public static void main(String[] args) {

		MyDate date1 = new MyDate(7, 8, 1995);
		MyDate date2 = new MyDate(7, 8, 1995);
		
		System.out.println(date1.equals(date2));
	}

}
