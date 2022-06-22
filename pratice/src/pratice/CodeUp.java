package pratice;

import java.util.Scanner;

public class CodeUp {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("오늘이 무슨 요일인가요?");
		String week = scanner.nextLine();
		if(week.equals("월")||week.equals("화")||week.equals("수")||week.equals("목")||week.equals("금")) {
			System.out.println("평일은 게임하는 날이 아닙니다.ㅎ");
		}else if(week.equals("토")||week.equals("일")) {
			System.out.println("주말에는 할 수 있어요.!ㅎㅎㅎ");
		}else {
			System.out.println("한 글자만 입력하세요.");
		}
		
	}

}

