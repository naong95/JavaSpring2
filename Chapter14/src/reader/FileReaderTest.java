package reader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {

		/*
		FileInputStream fis = new FileInputStream("reader.txt");
		InputStreamReader isr = new InputStreamReader(fis); */
		//소켓에서 읽을때는 무조건 바이트 단위로 읽게되므로 한글이 깨짐 -> Reader로 감싸서 변환
		
		FileReader fis = new FileReader("reader.txt");
		
		int i;
		while( (i = fis.read()) != -1) {
			System.out.print((char)i);
		}
		
		fis.close();
	}

}
