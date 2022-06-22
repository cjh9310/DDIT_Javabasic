package chapter3;

import java.util.Scanner;

public class Exercise33 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("윤년인지 아닌지 확인할 연도를 입력하세요 : ");
		int year = scanner.nextInt();
		String result = (year%400 ==0)|(year%4==0)&(year%100 !=0) ? "윤년이 맞습니다." : "윤년이 아닙니다."; 
		System.out.println(year+"은 "+result);
	}
}
