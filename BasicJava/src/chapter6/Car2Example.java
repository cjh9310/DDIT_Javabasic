package chapter6;

public class Car2Example {

	public static void main(String[] args) {
		Car2 Car = new Car2();
		Car.keyTurnOn();
		Car.run();
		int speed = Car.getSpeed();
		System.out.println("현재 속도: "+speed+"km/h");

	}

}
