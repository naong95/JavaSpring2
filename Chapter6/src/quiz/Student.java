package quiz;

import java.util.ArrayList;

public class Student {

	String studentName;
	ArrayList<Book> bookList;
	
	public Student(String studentName) {
		this.studentName = studentName;
		
		bookList = new ArrayList<Book>();
	}
	
	public void addBook(String bookName) {
		Book book = new Book(bookName);
		
		bookList.add(book);
	}
	
	public void showInfo() {
		System.out.print(studentName + " 학생이 읽은 책은 : ");
		for(Book book : bookList) {
			System.out.print(book.bookName + " ");
		}
		System.out.print("입니다.");
		System.out.println();
	}
}
