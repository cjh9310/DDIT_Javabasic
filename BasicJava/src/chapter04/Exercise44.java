package chapter04;

import java.util.Scanner;

public class Exercise44 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("철수: ");
		String first = scanner.nextLine();
		System.out.print("영희: ");
		String second = scanner.nextLine();
		String ga = "가위";
		String ba = "바위";
		String bo = "보";
		
		if(ga.equals(first)) {
			if(ga.equals(second)) {
				System.out.println("결과: 무승부");
			}else if(ba.equals(second)) {
				System.out.println("결과: 영희 승리!");
			}else {
				System.out.println("결과: 철수 승리!");
			}
		}else if(ba.equals(first)) {
			if(ga.equals(second)) {
				System.out.println("결과: 철수 승리!");
			}else if(ba.equals(second)) {
				System.out.println("결과: 무승부");
			}else {
				System.out.println("결과: 영희 승리!");
			}
		}else if(bo.equals(first)) {
			if(ga.equals(second)) {
				System.out.println("결과: 영희 승리!");
			}else if(ba.equals(second)) {
				System.out.println("결과: 철수 승리!");
			}else {
				System.out.println("결과: 무승부");
			}
		}
		// 선생님 풀이 -- 문제는 상황에 따라서가 아니라 결과에 따라 푸는게 좀 더 좋게 나옴.
		String result ="";
		if(first.equals(second)) {
			result = "비김";
		}else if(first.equals("가위")&& second.equals("바위")
			    ||first.equals("바위")&& second.equals("보")
			    ||first.equals("보")&& second.equals("가위")) {
			    	result = "영희 승리";
			    } else {
			    	result = "철수 승리";
			    }
			    
}
}	