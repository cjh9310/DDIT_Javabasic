package chapter71;

public class Car1Example {
	public static void main(String[] args) {
		Car1 car1 = new Car1();
		
		for(int i=1; i<=8; i++) {
			int problemLocation = car1.run();
		
		
		switch(problemLocation) {
		case 1:
			System.out.println("앞왼쪽 HankookTire로 교체");
			car1.frontLeftTire = new HankookTire("앞왼쪽",15);
			break;
		case 2:
			System.out.println("앞오른쪽 KumhoTire로 교체");
			car1.frontRightTire = new KumhoTire("앞오른쪽",13);
			break;
		case 3:
			System.out.println("뒤왼쪽 HankookTire로 교체");
			car1.backLeftTire = new HankookTire("뒤왼쪽",14);
			break;
		case 4:
			System.out.println("뒤오른쪽 KumhoTire로 교체");
			car1.backRightTire = new KumhoTire("뒤오른쪽",17);
			break;
		}
		System.out.println("----------------------");
	}
}
}