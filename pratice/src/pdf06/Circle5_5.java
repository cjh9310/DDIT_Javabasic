package pdf06;

public class Circle5_5 {
	private double radius;
	private double x;
	private double y;
public Circle5_5() {
		
}
public double getRadius() {
	return radius;
}
public void setRadius(double radius) {
	if(radius<0) {
		this.radius = 0;
	}else{
		this.radius = radius;
	}
	
}
public double getX() {
	return x;
}
public void setX(double x) {
	this.x = x;
}
public double getY() {
	return y;
}
public void setY(double y) {
	this.y = y;
}
public double getArea() {
	return (Math.PI*(radius*radius));
}

}

