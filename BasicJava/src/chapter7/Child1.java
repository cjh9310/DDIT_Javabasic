package chapter7;

public class Child1 extends Parent1{
	private String name;
	public Child1() {
		this("홍길동"); //this라 아래가 먼저 호출된다?
		 //super가 생략되어 있음.
		System.out.println("Child() call");
	}
	public Child1(String name) {
		super(); // super가 생략되면 부모 먼저 호출한다. Parent1()를 우선으로 호출
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
