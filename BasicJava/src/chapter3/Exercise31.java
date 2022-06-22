package chapter3;

import java.util.Scanner;

public class Exercise31 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫 번째 숫자를 입력하세요");
		int a = scanner.nextInt();
		System.out.println("두 번째 숫자를 입력하세요");
		int b = scanner.nextInt();
		int num1 = ((a + b) + Math.abs(a - b)) / 2;
		int num2 = ((a + b) - Math.abs(a - b)) / 2;
		int result = (a>b) ?num1 :num2 ;
		int result1 = (a<b) ?num1 :num2 ;
		int result98 = result / result1;
		int result99 = result % result1;
		System.out.println("큰 수를 작은 수로 나눈 몫은 "+result98+"이고, 나머지는 "+result99+"이다.");
	}

}
