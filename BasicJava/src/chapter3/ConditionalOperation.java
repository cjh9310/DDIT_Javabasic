package chapter3;

import java.util.Scanner;

public class ConditionalOperation {

	public static void main(String[] args) {
		// 127-1
//		int b = 5;
//		b = -b;
//		int result = 10/b;
//		System.out.println(result);
//		
		// 127-4
		int pencils = 534;
		int student = 30;
		//학생 1명이 가지는 연필 개수
		int pencilsPerStudent = ( 534 / 30);
		System.out.println(pencilsPerStudent);
		//남은 연필 개수
		int pencilsLeft = (534 % 30);
		System.out.println(pencilsLeft);
		
		
		// 127-5
//		int var1 = 5;
//		int var2 = 2;
//		double var3 = (double)var1/var2;
//		System.out.println(var3);
//		int var4 = (int)(var3*var2);
//		System.out.println(var4);
		
		
		// 127-6
//		int value = 356;
//		while(value != 300) {
//			value -=1;
//		}
//		System.out.println(value);
		
		int value = 356;
		System.out.println(value/100*100);
		
		// 127-7
//		float var1 = 10f;
//		float var2 = var1 / 100;
//		if(var2 == 0.1f) {
//			System.out.println("10%입니다.");
//		}else {
//			System.out.println("10%가 아닙니다.");
//		}
		
		// 127-8
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = ((lengthTop+lengthBottom)*(double)height /2);
		System.out.println(area);
		//127-9
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫 번째 수: ");
		String firstNum = scanner.next();
		System.out.println("두 번째 수 : ");
		String secondNum = scanner.next();
		// 처리
		double first = Double.parseDouble(firstNum);
		double second = Double.parseDouble(secondNum);
		double result = first/second;
		String resultString = (second ==0 ||second == 0.0) ? "무한대" : String.valueOf(result);
		// 출력
		System.out.println("결과 " +result);
		scanner.close();
		
//		Scanner scanner = new Scanner(System.in);		
//		System.out.print("첫 번째 수 입력");
//		double a = scanner.nextDouble();
//		System.out.print("두 번째 수 입력");
//		double b = scanner.nextDouble();
//		double result1 = a/b;
//		 
//		String result22 = (b ==0) ? "결과:무한대" : "결과 :" + result1;
//		System.out.println(result22);
		  //or
//		double result = a/b;
//		if(b != 0) {
//			System.out.println("결과 : " +result);
//		}else {
//			System.out.println("결과 : 무한대");
//		}
		//127-10
		int var1 = 10;
		int var2 =3;
		int var3 = 14;
		double var5 = Double.parseDouble((var2+"."+var3));
		double var4 = var1*var1*var5;
		System.out.println("원의 넓이:" +var4);
		
		//127-11
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디:");
		String name = sc.nextLine();
		
		System.out.print("패스워드:");
		String strPassword = sc.nextLine();
		int strpassword1 = Integer.parseInt(strPassword);
		
		 
		if(name.equals("java")) {
			if(strpassword1 == 12345) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("로그인 실패 : 패스워드가 틀림");
			}
		}else {
			System.out.println("로그인 실패 : 아이디가 존재하지 않음");
		}
		sc.close();
		//127-12
		int x =10;
		int y =5;
		System.out.println((x>7)&&(y<=5));
		System.out.println((x%3==2)||(y%2 !=1));
		
		//127-13
		int value13 = 0;
		value13 +=10;
		value13 -=10;
		value13 *=10;
		value13 /=10;
		System.out.println(value13);
		//127-14
		int score = 85;
		String result33 = (!(score>90)) ? "가" : "나";
		System.out.println(result33);
		
		
		
		
		
		
		
	}

}
