package chapter3;

public class operation2 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);  //!= 값이 다른지 검사
		boolean result3 = (num1 <= num2);
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		System.out.println("result3=" + result3);
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1<char2);
		System.out.println("result4=" + result4);
		
		System.out.println(" ");
		
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3);
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5);
		System.out.println((float)v4 == v5);
		System.out.println(" ");
		
		
		int charCode = 'A';
		if( (charCode>=65) & (charCode<=90)) {
			System.out.println("대문자군요.");
		}else if( (charCode>=97) && (charCode<=122)) {
			System.out.println("소문자군요.");
		}else if( !(charCode<48) && !(charCode>57)) {
			System.out.println("0~9 숫자군요.");
		}else {
			System.out.println("다시 실행하세요.");
		}
		
		int value = 6;
		if( (value%2==0) | (value%3==0)) {
			System.out.println("2 또는 3의 배수군요.");
		} if( (value%2==0) || (value%3==0)) {
			System.out.println("2 또는 3의 배수군요.!");
			
		}

	}

}
