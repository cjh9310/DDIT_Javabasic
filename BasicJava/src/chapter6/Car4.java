package chapter6;

public class Car4 {
	private double speed;
	private String color;
	private static double MAX_SPEED;

	Car4() {
	}

	public Car4(String color) {
		this.color = color;
		this.MAX_SPEED = 200;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public static double getMaxSpeed() {
		return MAX_SPEED;
	}

	public boolean speedUp(double speed) {

		if (this.speed+speed <= MAX_SPEED && this.speed+speed >= 0) {   //틀림.
			this.speed += speed;
			return true;
		} // if가 참이면 true로 반환하고 끝나서  반환값이 있으면 else를 안써도 괜찮다.(미국 스타일)
			return false;
		
	}

}
