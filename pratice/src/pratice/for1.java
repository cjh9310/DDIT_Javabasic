package pratice;

import java.util.Scanner;

public class for1 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(j+" ");
			}System.out.println();
		}
		System.out.println("               ");
		for(int i=1; i<=5; i++) {
			for (int j=1; j<=5; j++) {
			System.out.print(i+j+" ");
		}System.out.println();
	}
		System.out.println("**************");
		// 행과 열을 입력받아 계산하기
//		Scanner scanner = new Scanner(System.in);
//		int i,j;
//		int a = scanner.nextInt();
//		int b = scanner.nextInt();
//		for(i=1; i<=a; i++) {
//			for(j=1; j<=b; j++) {
//				System.out.print(i*j+" ");
//			}System.out.println();
//		}
		
		
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}System.out.println(" ");
		}
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5-i; j++) { //   1) 1~ 5-1
				System.out.print(" ");
			}for(int k=1; k<=i*2-1; k++) {// 1) 1 ~ 1*2-1  
				System.out.print("*");
			}System.out.println();
		}for(int i=1; i<=5; i++) {
			for(int k=1; k<=i; k++) {
				System.out.print(" ");
			}
		for(int j=(5-i)*2-1; j>=1; j--) {
			System.out.print("*");
		}System.out.println(" ");
		
}}
}