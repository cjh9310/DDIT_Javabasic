package chapter6;

public class MemberExample {

	public static void main(String[] args) {
		Member member = new Member();
		
		member.name = "최하얀";
		member.age =23;
		System.out.println(member.name);
		System.out.println(member.age);
		
		Member member2 = new Member();
		
		member2.name = "최량";
		member2.age =24;
		System.out.println(member2.name);
		System.out.println(member2.age);
		
		Member mem3 = new Member("류관순",15);
		System.out.println(mem3);
	}

}
