package chapter8;

public abstract class Shape implements Comparable<Shape>{
	

	private static final String perimeter = null;
	public double area() {
		
		return 0.0;
	}

	public double perimeter() {
		return 0.0;
	}
	public int compareTo(Shape o) {
	if(this.perimeter.compareTo(o.perimeter)>0) {
		return 1;
	}else if(this.perimeter.compareTo(o.perimeter)<0) {
		return -1;
	}else {
		return 0;
	}
	
	}
	


}
