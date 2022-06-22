package pdf03;

import java.util.Scanner;

public class Exericse31 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫 번쨰 숫자");
		int a = scanner.nextInt();
		System.out.println("두 번쨰 숫자");
		int b = scanner.nextInt();
		int num = ((a+b)+Math.abs(a - b))/2;
		int num1 = ((a+b)-Math.abs(a - b))/2;

		if(a<b) {
			int temp = 0;
			num = temp;
			num1 = num;
			temp = num1;
		}
		int result = num/num1;
		int result1 = num%num1;
		System.out.printf("몫은 %d이고, 나머지는 %d이다.",result,result1);
		
	}
}
