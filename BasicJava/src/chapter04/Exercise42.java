package chapter04;

import java.util.Scanner;

public class Exercise42 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("월을 입력하세요(1~12): ");
		int sijeun = scanner.nextInt();
		if(sijeun!=0 && sijeun<=12 ) {
		if(sijeun>=3 && sijeun<=5) {
			System.out.printf("%d월은 봄입니다.",sijeun);
		}else if(sijeun>=6 && sijeun<= 8) {
			System.out.printf("%d월은 여름입니다.",sijeun);
		}else if(sijeun>=9 && sijeun<= 11) {
			System.out.printf("%d월은 가을입니다.",sijeun);
	}
		else if(sijeun==12 || sijeun<=2 ){
			System.out.printf("%d월은 겨울입니다.",sijeun);
		}
	}else {
		System.out.printf("%d월은 잘못된 입력입니다.",sijeun);
	}
		String result = "";  //현업에서 자주 사용
		// 선생님 설명.
		switch(sijeun) {
		case 3: case 4: case 5:
			result = "봄";
			break;
		case 6: case 7: case 8:
			result = "여름";
			break;
		case 9: case 10: case 11:
			result = "가을";
			break;
		case 12: case 1: case 2:
			result = "겨울";
			break;
			default:
				result = "잘못된 입력";
		}
		System.out.printf("%s월은 %s입니다.",sijeun, result); //글자는 %s 숫자는 %d,%s가능

}
}