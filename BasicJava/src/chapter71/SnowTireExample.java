package chapter71;

public class SnowTireExample {
	public static void main(String[] args) {
		Tire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		snowTire.run();
		tire.run();
		((Tire)tire).run();
	}
}
