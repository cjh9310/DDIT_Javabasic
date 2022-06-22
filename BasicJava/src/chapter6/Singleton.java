package chapter6;

public class Singleton {
	private static Singleton instance = new Singleton();  // new Singleton() 힙에 보유
	                                                      // 
	public static Singleton getInstance() {
		return instance;
	}
	private String name;
	private int age;
	private Singleton() {
		
	}
}
