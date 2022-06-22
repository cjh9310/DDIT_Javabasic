package chapter02;

import java.util.Scanner;

public class Exercise25 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("500원짜리 동전의 갯수 : ");
		int f = scanner.nextInt();
		System.out.print("100원짜리 동전의 갯수 : ");
		int a = scanner.nextInt();
		System.out.print("50원짜리 동전의 갯수 : ");
		int s = scanner.nextInt();
		System.out.print("10원짜리 동전의 갯수 : ");
		int d = scanner.nextInt();
		int result = f*500 + a*100 + s*50 +d*10;
		System.out.println("저금통 안의 동전의 총 액수 :" +result);
		
	}

}
