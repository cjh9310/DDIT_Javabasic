package chapter71;

public class Bus extends Vehicle{
	String model ="전기자동차";
	String name = "시내버스";
	
	
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	public String getModel() {
		return model;
	}
	public void stop() {
		System.out.println("버스가 멈춥니다.");
	}
}
