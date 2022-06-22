package chapter72;

public class Rectangle extends Shape {
	private double width;
	private double height;
	
	public Rectangle(double width,double height) {
		this.width =width;
		this.height=height;
	}
	@Override
	public double area() {
		return (width+height)*2;
	}
	@Override
	public double perimeter() {
		return width*height;
	}
	public String toString() {
		return String.format("도형의 종류: 사각형, 둘레:"+area()+"cm, 넓이:"+perimeter()+"cm²");
	}
}

