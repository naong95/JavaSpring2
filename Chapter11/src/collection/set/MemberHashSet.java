package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {

	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId) { //멤버 아이디를 지정하면 그 멤버를 삭제
		
		Iterator<Member> ir = hashSet.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			if(member.getMemberId() == memberId) {
				hashSet.remove(member);
				return true;
			
			}
		}
		
		System.out.println(memberId + "아이디가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
