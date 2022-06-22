package chapter02;

public class PromotionExample {

	public static void main(String[] args) {
		// 강제 타입 변환
		 int i = 200;
		 byte b = (byte) i; // 강제 타입 변환할때 괄호는 필수이다.
		 System.out.println(b); 
		 //-56이 나오는 이유는 byte 크기가 -128~ 127까지인데? 127까지 갔다가 -128로 시작해서 

		 
		 byte xx = 10;
		 byte yy = 20;
		 int result1 = xx + yy;
		 System.out.println(result1);
		 
		 byte value1 = 10;
		 int value2 = 100;
		 long value3 = 1000L;   // long을 쓸 떄는 뒤에 L이 필요하다.
		 long result2 = value1 + value2 + value3;
		 System.out.println(result2);
		 
		 byte byteValue1 = 10;
		 byte byteValue2 = 20;
		 int intValue1 = byteValue1 + byteValue2;
		 System.out.println(intValue1);
		 // 자동변환  작은 타입에서 큰 타입으로 바뀔 때
		 
		 char charValue1 = 'A'; // 아스키 코드 65
		 char charValue2 = 1;
		 System.out.println(charValue1);
		 System.out.println(charValue2);
		 int intValue2 = charValue1 + charValue2;          // char에서 int로 자동 타입 변환.
		 System.out.println("유니코드=" +intValue2);
		 System.out.println("출력문자=" + (char) intValue2);  // int에서 char로 강제(char) 타입을 변환.
		 // byte, int등의 타입은 char 타입으로 자동 타입 변환할 수 없다.
		 
		 
		 int intValue3 = 10;
		 int intValue4 = intValue3/4;
		 System.out.println(intValue4);     // 정수라 답2
		 
		 int intValue5 = 10;
		 double doubleValue = intValue5 / 4.0;  
		 System.out.println(doubleValue);
		 
		 int x =1;
		 int y =2;
		 double result = (double) x/y;
		 System.out.println(result);
		 // (double)가 없어도 결과는 나온다. 단지 소수점 결과로 확인하기 위해 (double)를 사용함.
		 
		 // 팁. 강제 타입 변환은 큰 허용 범위에서 작은 허용 범위로 바꿀 때 괄호가 필요한 것. 
		 
		 String str1 = String.valueOf(3);
		 System.out.println(str1);
		 // 기본 타입의 값을 문자열로 변경하는 경우.
		 
		 
		 
		 // p.87
		 char c1 ='a';
		 char c2 = (char)(c1 +1);  // 문자열+1 b
		 System.out.println(c2);
		 
		 int x2 =5;
		 int y2 = 2;
		 int result5 = x2/y2;
		 System.out.println(result5);
		 
		 double var12 = 3.5;
		 double var13 = 2.7;
		 int result6 = (int)(var12 + var13);
		 // double형을 int로 강제 타입 변환시킴.
		 
		 System.out.println(result6);
		 System.out.println("*******************");
		 long var19 = 2L;
		 float var29 = 1.8f;
		 double var39 = 2.5;
		 String var49 = "3.9";
		 
		 
		 int result9 = (int)(var19+var29+var39+(int)Double.parseDouble(var49));
		 // int result99 = int(var19+int(var29)+var39 + Double.parseDouble(var49));
		 // 9를 만들기 위해서 var을 써줘서 실수를 내림으로 만들어준다. 
		 System.out.println(result9);
		 
		 
		 
		 String str11 = 2+3+"";
			String str2 = 2+""+3;	
			String str3 = ""+2+3;
			 System.out.println(str11);
			 System.out.println(str2);
			 System.out.println(str3);
			 // 문자열 순서대로 사칙연산을 계산해서 ""을 만나는 순간 문자열처럼 더해짐
			 
			byte value11 = Byte.parseByte("10");
			System.out.println(value11);
			int value22 = Integer.parseInt("1000");
			System.out.println(value22);
			float value33 = Float.parseFloat("20.5");
			System.out.println(value33);
			double value44 = Double.parseDouble("3.14159");
			System.out.println(value44);
			// 사용방법  타입 컬럼명 = 타입.parse타입(" 숫자 ");   parse다음에 대문자를 꼭 넣어줘야함.
			// 단! int는 integer.parseInt로 진행  
			// 
			
	}
		
		
		
	
	
	
	
	
	
}
