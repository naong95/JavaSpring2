package reader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {

		/*
		FileInputStream fis = new FileInputStream("reader.txt");
		InputStreamReader isr = new InputStreamReader(fis); */
		//���Ͽ��� �������� ������ ����Ʈ ������ �аԵǹǷ� �ѱ��� ���� -> Reader�� ���μ� ��ȯ
		
		FileReader fis = new FileReader("reader.txt");
		
		int i;
		while( (i = fis.read()) != -1) {
			System.out.print((char)i);
		}
		
		fis.close();
	}

}
