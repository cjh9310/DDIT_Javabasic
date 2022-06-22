package chapter02;     // p.89

import java.util.Scanner; // 

public class InputExample {

	public static void main(String[] args) {
		
		// 실행순서 => new Scanner(System.in) 가 먼저 실행되고	Scanner sc 로 저장이 된다.
//		Scanner scanner = new Scanner(System.in);
		// new Scanner(System.in); 를 먼저 만들고 )에서 ctrl + 1을 눌러주면 SCanner scanner = 가 자동으로 생성
		// Quick Fix (ctrl + 1)
		/*
		scanner.nextLine(); //문자를 입력받기(엔터가 입력된 부분까지)
		scanner.next(); // 문자를 입력받기 (공백 또는 엔터가 입력된 부분까지)
		scanner.nextInt(); // 정수를 입력받기
		scanner.nextDouble(); // 실수를 입력받기
		*/
		
		
		/*
		System.out.print("이름을 입력하세요 :");
		String name = scanner.next();
		System.out.println("입력한 이름은 " + name + " 입니다.");
		System.out.print("나이를 입력하세요.");
		int age =scanner.nextInt();
		System.out.println("당신의 나이는 " + age + " 입니다.");
		*/

		/*
		System.out.print("이름을 입력하세요 :");
		String name = scanner.next();
		System.out.print("나이를 입력하세요.");
		int age =scanner.nextInt();
		System.out.println("입력한 이름은 " + name + " 이고 당신의 나이는 " + age + " 입니다.");
		System.out.printf("당신의 이름은 %s 이고 당신의 나이는 %d 입니다.", name, age);
		// %s 문자 , %d 정수 , %f 실수
		*/
		
		/*
		System.out.printf("잔액 : %10d\n", 1000000);
		System.out.printf("잔액 : %,10d\n", 1000000);
		System.out.printf("잔액 : %2f\n", 10.12345);
		System.out.printf("잔액 : %.2f\n", 10.12345);
		System.out.printf("%s-%s-%s","010", "1234", "5678" );
		*/
		
		
		// p.98
		
		String name = "감자바";
		int age = 25;
		String tel1 = "010", tel2 = "123", tel3 = "4567";
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("전화 " + tel1 + "-" + tel2+ "-" + tel3);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 수 :");
		String strNum1 = scanner.next();
		
		System.out.print("두번째 수 :");
		String strNum2 = scanner.next();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println("덧셈 결과 " + result);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("[필수 정보 입력]");
		System.out.print("이름 : ");
		String name1 = sc.next();
		System.out.print("주민번호 앞 6자리 : ");
		int a = sc.nextInt();
		System.out.print("전화번호");
		String b = sc.next();
		
		System.out.println("[입력한 내용]");
		System.out.printf("1. 이름 : %s\n", name1);
		System.out.printf("2. 주민번호 앞 6자리 : %6d\n", a);
		System.out.printf("3. 전화번호 : %s\n", b);
	
		
		
		
		
	}

}
