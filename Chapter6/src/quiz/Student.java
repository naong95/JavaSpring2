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
		System.out.print(studentName + " �л��� ���� å�� : ");
		for(Book book : bookList) {
			System.out.print(book.bookName + " ");
		}
		System.out.print("�Դϴ�.");
		System.out.println();
	}
}
