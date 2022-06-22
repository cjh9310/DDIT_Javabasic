package chapter6;

public class NewCar1 {
	private double speed;
	private String color;
	private static double MAX_SPEED=killoToMile(200); 
	
	NewCar1(){
	}
	public NewCar1(String color) {
		this.color = color;
	}
	public double getSpeed() {
		return mileToKillo(speed);
		
	}
	public void setSpeed(double speed) {
		this.speed=killoToMile(speed);
	}
	public String getColor() {
		return color;
	}
	public static double getMaxSpeed() {
		return killoToMile(MAX_SPEED);
	}
	public boolean speedUp(double speed) {
		speed = killoToMile(speed);
		if (this.speed+speed <= MAX_SPEED && this.speed+speed >= 0) {   //틀림.
			this.speed += speed;
			return true;
		}return false;
		
	}
	
	private static double killoToMile(double distance) {
		
		return distance / 1.6;
	}
	private static double mileToKillo(double distance) {
		
		return distance * 1.6;
	}	
}
