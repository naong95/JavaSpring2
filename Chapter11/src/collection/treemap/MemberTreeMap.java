package collection.treemap;


import java.util.Iterator;
import java.util.TreeMap;

public class MemberTreeMap {

	private TreeMap<Integer, Member> treeMap;
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if ( treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
			return true;
		}
		
		System.out.println("회원 아이디가 없습니다.");
		return false;
	}
	
	public void showAllMember() {
		
		Iterator<Integer> ir  = treeMap.keySet().iterator(); //키셋은 셋으로, 벨류즈는 콜렉션으로
		while( ir.hasNext()) {
			int key = ir.next();
			Member member = treeMap.get(key);
			System.out.println(member);
		}
		
		System.out.println();
	}
}
