package chapter6;

public class Circle {
	private double radius;
	private double x;
	private double y;
	public double getRadius() {
		return radius;
	}public void setRadius(double radius) {
		if(radius<0) {
			this.radius =0;
		}else {
			this.radius=radius;
		}
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		if(x<0) {
			this.x =0.0;
		}else {
			this.x=x;
		}
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		if(y<0) {
			this.y =0;
		}else {
			this.y=y;
		}
	}
	public double getArea() {
		return(Math.PI*radius*radius);
		
	}
	
}
