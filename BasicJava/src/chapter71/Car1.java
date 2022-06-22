package chapter71;

public class Car1 {
	Tire1 frontLeftTire = new Tire1("앞왼쪽",6);
	Tire1 frontRightTire = new Tire1("앞오른쪽",2);
	Tire1 backLeftTire = new Tire1("뒤왼쪽",3);
	Tire1 backRightTire = new Tire1("뒤오른쪽",4);
	
	
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll()==false) {
			stop(); return 1;
		}
		if(frontRightTire.roll()==false) {
			stop(); return 2;
		}
		if(backLeftTire.roll()==false) {
			stop(); return 3;
		}
		if(backRightTire.roll()==false) {
			stop(); return 4;
			
		}return 0;
		
		
	}void stop() {
		System.out.println("[자동차를 멈춥니다]");
	}
}

