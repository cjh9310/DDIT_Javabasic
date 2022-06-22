package chapter04;

import java.util.Scanner;

public class Exercise43 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		System.out.print("프로그래밍 기초: ");
		int prg = scanner.nextInt();
		System.out.print("데이터베이스: ");
		int DB = scanner.nextInt();
		System.out.print("화면 구현: ");
		int UI = scanner.nextInt();
		System.out.print("애플리케이션 구현: ");
		int API = scanner.nextInt();
		System.out.print("머신러닝: ");
		int ML = scanner.nextInt();
		
		int sum = (prg+DB+UI+API+ML);
		double average = (double)sum/5;
		System.out.println("총점: "+sum);
		System.out.println("평균: "+average);
		
		
		if(average>=90) {
			System.out.println("학점 : A");
		}else if(average>=80 ) {
			System.out.println("학점 : B");
		}else if(average>=70 ) {
			System.out.println("학점 : C");
		}else if(average>=60 ) {
			System.out.println("학점 : D");
		}else {
			System.out.println("학점 : F");
		}
		
		
		
		
		
		
		
		
		
	}

}
