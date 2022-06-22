package pdf03;

import java.util.Scanner;

public class Exercise33 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("윤년 입력");
		int year = scanner.nextInt();
//		String result = (year%400 ==0)||(year%4==0)&&(year%100 !=0) ? "윤년이 맞습니다." : "윤년이 아닙니다."; 
//		System.out.println(year+"은 "+result);
		if((year%400 ==0)||(year%4==0)&&(year%100 !=0)) {
			System.out.println(year+"은 윤년이 맞습니다.");
		}else {
			
		}
	}
}
