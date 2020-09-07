package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>(); //ArrayList면 중복을 허용하고 순서대로 나옴
		set.add("이순신");
		set.add("김유신");
		set.add("강감찬");
		set.add("이순신");
	
		Iterator<String> ir = set.iterator();
		
		while(ir.hasNext()) { //다음 엘리먼트가 있느냐?
			String str = ir.next();
			System.out.println(str);
			
		}
	}

}
