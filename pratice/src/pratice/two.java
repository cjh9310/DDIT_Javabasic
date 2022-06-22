package pratice;

public class two {

	public static void main(String[] args) {
		//p.86-3
		byte byteValue = 10;
		float floatValue = 2.5F;
		// double doubleValue = 2.5;
		
		byte result0 =  (byte)(byteValue + byteValue); //오류가 뜨는 이유 : byte 와 byte가 더하면 int가 되어서 계산된다.
		System.out.println(result0);           // 만약 계산하고 싶으면 (byte)(byteValue + byteValue)로 변경 결과를 byte로 뽑기 떄문에
		
		int result01 =  byteValue + byteValue; 
		System.out.println(result01);
		
		int result = 5+byteValue;
		System.out.println(result);
		
		float result1 = 5+floatValue;
		System.out.println(result1);
		
		//p86-4
		short s1 = 1;
		short s2 = 2;
		int i1 = 3;
		int i2 = 4;               // short + short 라 int가 되었음.
	//	short result40 = s1 + s2; // 해결법 결과를 int로 바꾸거나 s1 + s2를 short로 강제 타입 변환을 해야함
		int result40 = s1 + s2;
		System.out.println(result40);
		int result41 = i1 + i2;
		System.out.println(result41);
		
		//p86-7
		int x =5;
		int y = 2;
		double result71 = (double) x/y; // 이미 결과가 정수라 (double)을 추가해 소수점까지 볼 수 있게 만든다.
		System.out.println(result71);   // 추가) 원래는 자동 타입 변환이지만 소수점을 보기 위해서 추가 함
		
		//p86-8
		double var11 = 3.5;
		double var22 = 2.7;
		int result81 = (int)(var11+var22);
		System.out.println(result81);
		
		//p86-9
		long var1 = 2L;    
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
//		int result99 = Integer.parseInt(var4);
//		System.out.println(result99);
		double result90 = (int)Double.parseDouble(var4);
		System.out.println(result90);
		int result91 = (int)(var1+var2+var3+result90);
		System.out.println(result91);
		
		// long 뒤에는 소문자 혹은 대문자의 L이 필요함
		// float 뒤에는 소문자 혹은 대문자의 F가 필요함
		// String(문자열)을 기본 타입으로 강제 타입 변환 하는 법 -> p.83참고
		// 바로 int가 안되는 이유가 String에서 기본 타입으로 바꿀 떄 
		//만약? 그 문자열이 소수점이면 double로 바꿔주고 필요하면 추가로 int를 적용해줘야함.. (맞음.. 실화냐..?)
		// 그래서 결과 앞에는 double 쓰고  Double.parseDouble(var4); 앞에 (int)를 추가해서 int형으로 출력시킴.
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
