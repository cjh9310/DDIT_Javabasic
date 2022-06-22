package chapter72;

public class Triangle extends Shape{
	private double side;
	
	public Triangle(double side) {
		this.side =side;
	}
	@Override
	public double area() {
		return side*3;
	}
	@Override
	public double perimeter() {
		return (double)side*side/2;
	}
	public String toString() {
		return String.format("도형의 종류: 삼각형, 둘레:"+area()+"cm, 넓이:"+perimeter()+"cm²");
	}
}
