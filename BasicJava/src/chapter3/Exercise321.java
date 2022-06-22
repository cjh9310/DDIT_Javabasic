package chapter3;

import java.util.Scanner;

public class Exercise321 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("수도입니까");
		int capital = scanner.nextInt();
		System.out.println("총 인구수?");
		int human = scanner.nextInt();
		System.out.println("연소득 1억 이상");
		int city = scanner.nextInt();
		
//		boolean result1 = ((capital ==1)&(human>=50)||(city>=100));
//		String result2 = (result1 ==true) ? "이 도시는 메트로폴리스입니다." : "이 도시는 메트로폴리스가 아닙니다.";
//		System.out.println(result2);
		
//		if((capital ==1)&(human>=50)||(city>=100)) {
//			System.out.println("이 도시는 메트로폴리스입니다.");
//		}else {
//			System.out.println(" ");
//		}
		
		System.out.print((capital ==1 & human >=50|city>=100)== true? "이 도시는 메트로폴리스입니다." : "");
		
		scanner.close();
	}

}
