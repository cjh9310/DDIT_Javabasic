package chapter04;

import java.util.Random;

public class SwitchExample {

	public static void main(String[] args) {
		Random random = new Random();
		int num = random.nextInt(6);
		switch(num) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		default:
			System.out.println("6번이 나왔습니다.");
			break;
		}

		Random random2 = new Random();
		int time = random2.nextInt(4)+8;
		System.out.println("[현재 시각 :" + time +"시]");
		

			switch(time) {
		
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의를 합니다.");
		case 10:
			System.out.println("업무를 봅니다.");
		default :
			System.out.println("외근을 나갑니다.");
		}

		char grade ='B';
		switch(grade) {
		case 'A' :
		case 'a' :
			System.out.println("우수 회원입니다.");
			break;
		case 'B' :
		case 'b' :
			System.out.println("일반 회원입니다.");
			break;
		default :
		System.out.println("손님입니다.");
		}
		
		
		String position = "과장";
		switch(position) {
		case "부장" :
			System.out.println("700만원");
			break;
		case "과장" :
			System.out.println("500만원");
			break;
		default :
			System.out.println("300만원");
			break;
		}
		
		
		
		
	}

}
