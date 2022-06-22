package chapter04;

import java.util.Random;
import java.util.Scanner;

public class Exercise45 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int random1 =random.nextInt(100)+1;
		int count =0;
		while(true) {
			System.out.println("1부터 100 사이의 정수 중 하나를 선택하세요: ");
			int num = scanner.nextInt();
			count++;
		if(random1 > num) {
			System.out.println("정답은 더 큰 수입니다.");
			
		}else if(random1 < num) {
			System.out.println("정답은 더 작은 수입니다.");
			
		}else if(random1 ==num){
			System.out.println("정답입니다.");
			System.out.printf("축하합니다 %d번만에 맞췄습니다.",count);
			System.out.println("게임을 종료합니다.");
			break;
		}
		}
	}

}
