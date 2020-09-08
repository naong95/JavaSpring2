package collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2) * (-1); //원래의 반대로 정렬 ㅎ부터
	}
	
}

public class ComparatorTest {

	public static void main(String[] args) {

		TreeSet<String> treeSet = new TreeSet<String>(new MyCompare()); //어떤 방식으로 할지 넣어주면 그걸로 정렬한다
		treeSet.add("홍길동");
		treeSet.add("강감찬");
		treeSet.add("이순신");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
	}

}
