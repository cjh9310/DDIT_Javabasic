package chapter6;

public class NewCar {
	private double speed;
	private String color;
	private static double MAX_SPEED=200; 
	
	NewCar(){
	}
	
	public NewCar(String color) {
		this.color = color;
	}
	public double getSpeed() {
		return kiloToMile(speed);
		
	}
	public void setSpeed(double speed) {
		this.speed=speed;
	}
	public String getColor() {
		return color;
	}
	public static double getMaxSpeed() {
		return MAX_SPEED;
	}
	public boolean speedUp(double a) {
		if(a>=MAX_SPEED||a<=0) {
			this.speed=0;
			return false;
		}else {
			this.speed+=a;
		}
		mileToKilo(speed);
		return true;
	}
	public double kiloToMile(double distance) {
		this.speed=distance/1.6;
		return speed;
	}
	public double mileToKilo(double distance) {
		this.speed=distance*1.6;
		return speed;
	}
}