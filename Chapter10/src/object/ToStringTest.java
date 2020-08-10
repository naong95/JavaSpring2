package object;

class Book{
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return author + ", " + title;
	}
	
	
}

public class ToStringTest{

	public static void main(String[] args) {

		Book book = new Book("토지", "박경리");
		
		System.out.println(book);
		
		String str = new String("토지");
		System.out.println(str); //object에 toString 이라는 메서드가 적용된것
	}

}
