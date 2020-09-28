package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}
	
	public static void main(String[] args) {

		ThrowsException test = new ThrowsException();
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) { //최상위 예외이기 때문에 맨 앞에다 걸면 무조건 걸려서 끝나버림
			System.out.println(e);
		}
		System.out.println("end");
	}

}
