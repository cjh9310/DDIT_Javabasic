package chapter10;

public class ExceptionExample {
	public static void main(String[] args) {
		// 1. 일반 예외(Compiletime Exception)
		
		
		Class.forName("java.alng.String");
		
		// 2. 실행 예외(Runtime Exception)
		
		int [] numbers = new int[5];
		numbers[10] = 100;
		// 5자리인데 10번째에 넣었음.. 하지만 오류가 안보인다.(실행해야 보임)
	}
}
