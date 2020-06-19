package hiding;

public class MyDate {

	private int day;
	private int month;
	private int year;
	private boolean isValid = true;
	
	public MyDate(int day, int month, int year) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	public void setDay(int day) {
		//멤버변수 day = 매개변수 day
		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				if (day < 0 || day > 31) {
					isValid = false;
				}
				else {
					this.day = day;
				}
				break;
			case 4: case 6: case 9: case 11:
				if (day < 0 || day > 30) {
					isValid = false;
				}
				else {
					this.day = day;
				}
				break;
			case 2:
				if (year % 4 == 0) {
					if (day < 0 || day > 29) {
						isValid = false;
					}
					else {
						this.day = day;
					}
				}
				else {
					if (day < 0 || day > 28) {
						isValid = false;
					}
					else {
						this.day = day;
					}
				}
			}
	}
	
	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		
		if(month < 1 || month > 12) {
			isValid = false;
		}
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	

	public void isValid() {
		
		if(isValid) {
			System.out.println("유효한 날짜입니다.");
		}
		else {
			System.out.println("유효하지 않은 날짜입니다.");
		}
	}
}
