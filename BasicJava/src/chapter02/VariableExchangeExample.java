package chapter02;

public class VariableExchangeExample {
	
	public static void main(String[] args) {
		int x =3;
		int y =5;
		System.out.println("x:" + x + ", y:" +y);
		
		int temp= x; // 바로 x y를 바꿀 수 없으니 다른 곳에 저장후 차례대로 바꿔준다.
		x = y;
		y = temp;
		System.out.println("x:" + x + ", y:" +y);

	}

}
