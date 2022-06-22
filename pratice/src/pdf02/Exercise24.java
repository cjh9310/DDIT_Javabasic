package pdf02;

import java.util.Scanner;

public class Exercise24 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("반지름 입력: ");
		double radius = scanner.nextDouble();
		System.out.print("높이 입력: ");
		double height = scanner.nextDouble();		
		double area = radius*radius*Math.PI;
		double v = radius*radius*Math.PI*height;
		System.out.println(area);
		System.out.println(v);
	}
}
