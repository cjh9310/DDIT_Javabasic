package chapter71;

public abstract class Animal {
	public String kind;
	
	public void breathr() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();
}
