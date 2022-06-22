package chapter10;

public class ThorwsExample {
public static void main(String[] args) {
	// throw 명령어
	try {
		throw new Exception("내가 만든 에러");
	} catch(Exception e) {
		System.out.println(e.getMessage());
	}
	
}
}
