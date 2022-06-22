package chapter6;

public class Plane {
	private String manufacture;
	private String model;
	private int maxNumberOfPassengers;
	static int numberIfPkanes;
	public Plane() {
		numberIfPkanes++; //this(null,null,0);  주로 //처럼 씀
	}
	public Plane(String manufacture,String model,int maxNumberOfPassengers) {
		this();  //numberOfPlanes;;   주로 //처럼 씀
		this.manufacture=manufacture;
		this.model=model;
		this.maxNumberOfPassengers=maxNumberOfPassengers;
		
}
	public String getManufacture() {
		return manufacture;
}public String getModel() {
	return model;
}
public int getMaxNumberOfPassengers() {
	return maxNumberOfPassengers;
}


	public void setManufacture(String manufacture) {
			this.manufacture=manufacture;
		
	}public void setModel(String model) {
		
			this.model=model;
	}
		public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
			if(maxNumberOfPassengers<0) {
				this.maxNumberOfPassengers=0;
			}
	}
	public int numberIfPkanes() {
		return numberIfPkanes;
	}
	
}