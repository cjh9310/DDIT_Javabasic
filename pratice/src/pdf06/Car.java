package pdf06;

public class Car {
	private double speed;
	private String color;
	private static double MAX_SPEED;
	
	public Car() {
	}
	public Car(String color) {
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
	public void setColor(String color) {
		this.color = color;
	}
	public boolean speedUP(double speed) {
		if(speed>0||speed<200) {
			this.speed+=speed;
			
		}else  {
			
			
		}return true;
		
	}
	public static double getMaxSpeed() {
		return MAX_SPEED;
	}

	
	
	
	
	
}
