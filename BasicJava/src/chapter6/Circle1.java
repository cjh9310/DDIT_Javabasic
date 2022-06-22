package chapter6; //선생님이 하심.

public class Circle1 {
	private double radius;
	private double x;
	private double y;
	public Circle1() {
		
	}
	public double getArea() {
		return Math.PI*radius*radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		if(radius>0) {
			this.radius=radius;
		} // radius가 0보다 클때 실행한다.
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x=x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y=y;
	}
	
}
