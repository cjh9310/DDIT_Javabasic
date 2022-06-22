package pdf04;

import java.util.Random;
import java.util.Scanner;

public class Exercise45 {
	public static void main(String[] args) {
		Random random1 = new Random();
		int random = random1.nextInt(100)+1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("선택하세요");
		
		while(true) {
			int choice = scanner.nextInt();
		if((random>choice)) {
			System.out.println("더 큰 수 ");
		}else if((random<choice)){
			System.out.println("더 작은 수 입니다. ");
		}else {
			System.out.println("정답입니다.");
			break;
		}
		
	}
}
}