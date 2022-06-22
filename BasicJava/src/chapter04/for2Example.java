package chapter04;

import java.util.Random;
import java.util.Scanner;

public class for2Example {

	public static void main(String[] args) {
		//161-2
		int i1= 1;
		while(i1<=100) {
			if(i1 % 3 ==0) {
				
			}i1+=i1;
		}System.out.println(i1);

		
//		int sum =0;
//		for(int j=1; j<=100; j++) {
//			if(i % 3 ==0) {
//				sum +=i;
//			}
//		}System.out.println(i);
		System.out.println("(2)**************************");
		//161-3
		Random random = new Random();
		int sum = 0;
		int num1 =0;
		int num2 =0;
		while(true) {
			num1 = random.nextInt(6)+1;
			num2 = random.nextInt(6)+1;
			sum = (num1+num2);
			if(sum-5 ==0) {
				break;
			}System.out.printf("%d %d\n", num1,num2);
		}
		System.out.printf("결과 : %d %d\n", num1,num2);
		System.out.println("(3)*******************************");
		//161-4
		int i =0;
		int j=0;
		for(i=1; i<=10; i++) {
			for(j=1; j<=10; j++) {
				if(4*i + 5*j ==60) {
					System.out.printf("%d %d\n", i,j);
					continue;
					
				}
			}
		}
		System.out.println("(4)*****************");
		
		for(int a =1; a<=4; a++) {
			for(int b =1; b<=a; b++) {
				System.out.print("*");
			}System.out.println(" ");
		}
		String stars = "";
		for (int a =1; a<=4; a++) {
			for( int b =1; b<=a; b++) {
				stars += "*";
			}stars += "\n";
		}System.out.println(stars);
		
		System.out.println("(5)*****************");
		// 1번
		for(int a=1; a<=4; a++) {
			for(int b=4;b>=a; b--) {
				System.out.print(" ");
			}for(int c=1; c<=a; c++) {
				System.out.print("*");
			}System.out.println();
		}
		// 2번
		String stars1 ="";
		for(int a =1; a<=4; a++) {
			for(int b=1; b<=4-a; b++) {    // b<=4-a; b++ == b>=1; b--
				stars1 += " ";
			}for(int c=1; c<=a; c++) {
				stars1 +="*";
			}stars1 +="\n";
		}System.out.println(stars1);
		
		// 3번
		String stars2 ="";
		for(int a =1; a<=4; a++) {
			for(int b=1; b<=4-a; b++) {    // b<=4-a; b++ == b>=1; b--
				if(b <= 4-a) {
					stars2 += " ";
				}else {
					stars2 +="*";
				}
			}
			stars2 +="\n";
		}		System.out.println(stars2);
		System.out.println("(6)*****************");
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------");
			System.out.print("선택> ");
			int n = scanner.nextInt();
			if(n ==1) {
				System.out.print("예금액 입력 : ");
				int Deposit = scanner.nextInt();
				balance += Deposit;
				
			}if(n ==2) {
				System.out.print("출금액 입력 : ");
				
				int withdraw = scanner.nextInt();
				balance -= withdraw;
				
			}if(n ==3) {
				System.out.println("현재 잔액은 :" + balance);
				
			}if(n ==4) {
				System.out.print("프로그램을 종료");
				break;
				
			}
			
		}
		scanner.close();
		
		// 7-1
		boolean run1 = true;
		int balance1 = 0;
		Scanner scanner1 = new Scanner(System.in);
		while(run1) {
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------");
			System.out.print("선택> ");
			int menu = scanner1.nextInt();
			switch (menu) {
			case 1 :
				System.out.println("예금액> ");
				balance1 += scanner1.nextInt();
				break;
			case 2 :
				System.out.println("출금액> ");
				balance1 -= scanner1.nextInt();
				break;
			case 3 :
				System.out.println("잔고> " +balance1);
				break;
			case 4 :
				run1 = false;
				break;
			}
		
		}
		scanner.close();
	}

}
