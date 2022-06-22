package chapter9;

public class Anonymous_1Example {
	public static void main(String[] args) {
		Anonymous_1 anony = new Anonymous_1();
		anony.field.run();
		anony.method1();
		anony.method2(
			new Vehicle() {
				public void run() {
					System.out.println("트럭이 달립니다.");
				}
			}
		);
		
		
	}
}
