package chapter10;

import java.util.Scanner;

public class Exercise11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Scanner scanner1 = new Scanner(System.in);
		while(true) {
			int num =0;
			int num1 =0;
			 
		try {
			System.out.println("어떤 수로 나누시겠습니까?>>");
			num = Integer.parseInt(scanner.nextLine());
			System.out.println("어떤 수로 나누시겠습니까?>>");
			  num1 = Integer.parseInt(scanner.nextLine());
		}catch(NumberFormatException e) {
			System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			 continue;
			}if(num !=0 && num1 !=0) {
				System.out.println(num/num1);
				break;
			}else {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				continue;
			}
			
		}
}
}
