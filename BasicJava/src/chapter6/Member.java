package chapter6;

public class Member {
	
	String name ;
	String id ;
	String password ;
	int age=0;
	String nation = null;
	int ssn =0;
	public Member(){ //아무것도 없으면 default(디폴트) 생성자인 public Member()가 자동으로 만들어짐.
		this(null,0,null,0);
	}
	public Member(String name) {
		this(name,0,null,0);
	}
	public Member(String name, int age) { //매개변수
		this(name,age,null,0);
}
	public Member(String name, int age, String nation) {
		this(name,age , nation,0);
	}
	public Member(String name, int age, String nation , int ssn) {
		this.name= name;
		this.age = age;
		this.nation = nation;
		this.ssn = ssn;
	}
	
}