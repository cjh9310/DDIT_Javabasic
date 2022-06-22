package chapter5;

import java.util.Random;
import java.util.Scanner;

public class Example53 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int input = 0;
		int ai;
		ai =random.nextInt(3)+1;
		System.out.print("가위바위보 중 하나를 선택하세요 : ");
		String a = scanner.nextLine();
		System.out.println("게이머: " +a);
		while(true) {
			
			if(a.equals("가위")) {
				input =1;
			}else if(a.equals("바위")){
				input =2;
			}else if(a.equals("보")) {
				input =3;
			}if(a.equals("가위")||a.equals("바위")||a.equals("보")) {
				break;
			}
		}
		
		if(ai ==1) {
			System.out.println("인공지능 컴퓨터: 가위");
		}else if(ai ==2) {
			System.out.println("인공지능 컴퓨터: 바위");
		}else {
			System.out.println("인공지능 컴퓨터: 보");
		}
		
			if(ai ==input) {
				System.out.println("무승부 입니다.");
			}else if(input==1&&ai==3 || input==2&&ai==1 || input==3&&ai==2) {
				System.out.println("결과 : 게이머 승리!");
			}else {
				System.out.println("결과 : 인공지능 승리!");
			}
			
			
			
		}
		
		
		
	}


