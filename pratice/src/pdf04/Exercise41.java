package pdf04;

import java.util.Scanner;

public class Exercise41 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 변의 길이");
		int length1 = scanner.nextInt();
		System.out.println("두번째 변의 길이");
		int length2 = scanner.nextInt();
		System.out.println("세번째 변의 길이");
		int length3 = scanner.nextInt();
		
		if((length1<length2+length3) && (length2<length1+length3)&& (length3<length1+length2)) {
			System.out.println("삼각형을 만들 수 있습니다.");
		}else {
			System.out.println("삼각형을 만들 수 없습니다.");
		}
	}
}
