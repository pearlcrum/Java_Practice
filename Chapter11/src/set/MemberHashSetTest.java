package set;

public class MemberHashSetTest {

	public static void main(String[] args) {

		MemberHashSet manager = new MemberHashSet();
		
		Member memberLee = new Member(100,"LEE");
		Member memberKim = new Member(200,"KIM");
		Member memberPark = new Member(300,"Park");
		Member memberPark2 = new Member(300,"Park");

		
		manager.addMember(memberLee);

		manager.addMember(memberKim);

		manager.addMember(memberPark);
		
		manager.addMember(memberPark2);

		
		manager.showAllMemer();
		
		manager.removeMember(100);
	
		manager.showAllMemer();

	}

}
