package pdf03;

import java.util.Scanner;

public class Exercise32 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("수도입니까?");
		int capital = scanner.nextInt();
		System.out.println("총인구");
		int human = scanner.nextInt();
		System.out.println("1억이상");
		int average = scanner.nextInt();
		if((capital ==1) && (human>100)||average>50) {
			System.out.println("이 도시는 메트로 폴리스입니다.");
		}
	}
}
