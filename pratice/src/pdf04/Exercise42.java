package pdf04;

import java.util.Scanner;

public class Exercise42 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("몇월?");
		int month = scanner.nextInt();
		if(month!=0&& month <=12)
		if((3<=month&& month <=5)) {
			System.out.println("봄");
		}
		else if((6<=month&& month <=8)) {
			System.out.println("여름");
		}
		else if((9<=month&& month <=11)) {
			System.out.println("가을");
		}else {
			System.out.println("겨울입니다.");
		}
	}
}	
