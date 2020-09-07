package collection.set;

public class MemberHashSetTest {

	public static void main(String[] args) {

		MemberHashSet manager = new MemberHashSet();
		
		Member memberLee = new Member(100, "Lee");
		Member memberKim = new Member(200, "Kim");
		Member memberPark = new Member(300, "Park");
		Member memberPark2 = new Member(300, "Park2");
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		manager.addMember(memberPark2);
		
		manager.showAllMember();
		
		manager.removeMember(100);
		manager.showAllMember();
	}

	//Set을 쓸때는 관리할 객체가 논리적으로 같냐를 재정의 해줘야됨 equals
	//기존에 있는 정수형이나 문자열은 정의가 되어있어서 자동으로 되지만 다른 자료형은 오버라이드로 재정의 해줘야됨
}
