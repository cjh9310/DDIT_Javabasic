package chapter71;

public class Taxi extends Vehicle{
	String model = "소나타";
	String name = "카카오";
	
	
	public void run() {
		System.out.println("택시가 달립니다.");
	}
	public String getModel() {
		return model;
	}
	public void stop() {
		System.out.println("택시가 멈춥니다.");
	}
}
