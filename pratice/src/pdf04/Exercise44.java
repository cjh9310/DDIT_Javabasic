package pdf04;

import java.util.Scanner;

public class Exercise44 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("철수: ");
		String su = scanner.nextLine();
		System.out.println("영희: ");
		String zero = scanner.nextLine();
		
		if((zero.equals("가위")&&su.equals("가위")) || (zero.equals("바위")&&su.equals("바위")) || (zero.equals("보")&&su.equals("보"))) {
			System.out.println("무승부");
		}else if((zero.equals("가위")&&su.equals("보")) ||(zero.equals("바위")&&su.equals("가위")) ||(zero.equals("보")&&su.equals("바위"))) {
			System.out.println("영희 승리");
		}else {
			System.out.println("철수 승리");
		}
	}
}
