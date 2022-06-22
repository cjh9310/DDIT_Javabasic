package pratice;

import java.util.Scanner;



public class Exercise {

	public static void main(String[] args) {
//		Scanner scanner =new Scanner(System.in);
//		System.out.println("가로의 길이는? (단위:m): ");
//		double width =scanner.nextDouble();
//		System.out.println("세로의 길이는? (단위:m): ");
//		double height =scanner.nextDouble();
//		double result = width*height;
//		double result1 = (width+height)*2;
//		System.out.println("직사각형의 넓이 : " + result);
//		System.out.println("직사각형의 둘레 : " + result1);
//		
		
//		double distance = 40e12;
//		double s = 300000;
//		double result = distance / (s*60*60*24*365);
//		System.out.println(result);
//		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("원기둥 밑변의 반지름을 입력하시오.(단위:cm): ");
		double r = scanner.nextDouble();
		System.out.println("원기둥의 높이를 입력하시오.(단위:cm) :");
		double height = scanner.nextDouble();
		double result1 = Math.PI*(r*r)*height;
		double result2 = Math.PI*(r*r);
		System.out.printf("원기둥 밑변의 넓이는 %d이고, 원기두의 부피는 %d이다.",result1,result2);
		
		
		
		
		

	}

}
