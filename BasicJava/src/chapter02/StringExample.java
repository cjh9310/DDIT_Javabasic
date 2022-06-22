package chapter02;

public class StringExample {

	public static void main(String[] args) {
		char c1 = 'A';
		System.out.println(c1);
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println("\u0041 나의 이름은 "+name+"이고, 나의 직업은 "+job+"이다.");
		System.out.println("나의 이름은 \""+name+"\"이고, \n나의 직업은 \'"+job+"\'이다.");
		// 이스케이프 문자(p.66) \" ~ \"  큰따옴표를 출력할 때 사용된다.
		// \t   텝만큼 띄워준다.   // \n, \r 줄바꿈   //   역슬레쉬 출력할려면 \\ 두 번 써주면 된다.
		float var = 3.14213555f; // 7자리 
		// float를 사용할려면 뒤에 f 또는 F를 사용해서 컴파일러가 float 타입임을 알 수 있도록
		System.out.println(var);
		double var1 = 3.1432323232357899; //15자리
		System.out.println(var1);
		
		// 수학 지수(exponential)
		double var3 = 3e6;  // 3 곱하기 10의 6승
		System.out.println(var3);
		double var4 = 2e-3;  // 2 곱하기 10의 -3승
		System.out.println(var4);
		
		
		// 정수는 int 타입으로 간주한다.
		int a = 10000000;
		long l = 10000000000L; 
		// int 로 표현할 수 없는 숫자(21억이 넘는 숫자)는 long로 표현하면서 뒤에 L을 붙여준다.  float와 유사함.
		System.out.println(a);
		System.out.println(l);
		
		double value = 2e-323;
		System.out.println(value);
		
		char var6 = 65;
		System.out.println(var6);
	
		
		
		
		
		
		
		
	}

}
