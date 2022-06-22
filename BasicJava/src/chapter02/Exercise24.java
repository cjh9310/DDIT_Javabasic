package chapter02;

import java.util.Scanner;

public class Exercise24 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("원기둥 밑변의 반지름을 입력하시오.(단위:cm)");
		double r = scanner.nextDouble();
		System.out.print("원기둥의 높이를 입력하시오.(단위:cm)");
		double height = scanner.nextDouble();
		double result1 = Math.PI*r*r;
		double result2 = Math.PI*(r*r)*height;
		System.out.println(result1);
		System.out.println(result2);

	}

}
