package pdf06;

public class Plane {
	private String manufacture;
	private String model;
	private int maxNumberOfPassengers;
	int numberOfPlanes;
	
	public Plane() {
		
	}
	public Plane(String manufacture, String model, int maxNumberOfPassengers) {
		this.manufacture=manufacture;
		this.model=model;
		this.maxNumberOfPassengers=maxNumberOfPassengers;
		
	}
	public String getManufacture() {
		return manufacture;
	}
	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getMaxNumberOfPassengers() {
		return maxNumberOfPassengers;
	}
	public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
		this.maxNumberOfPassengers = maxNumberOfPassengers;
	}
	public int getNumberOfPlanes() {
		return 3;
	}

}
