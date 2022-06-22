package chapter5;

public class ArrayExample3 {

	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("값의 수가 부족합니다.");
			return;   //메소드 종료
		// System.exit(0); 시스템 종료
		}
		String strNum1 = args[0];
		String strNum2 = args[1];		
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		System.out.printf("%d + %d = %d",num1,num2,num1+num2);
		
		// Run configuration -> arguments 에서 숫자를 설정해줬음.
	}

}
