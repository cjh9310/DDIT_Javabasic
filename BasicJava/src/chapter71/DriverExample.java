package chapter71;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Vehicle vehicle = new Vehicle();
		Bus bus = new Bus();
		Vehicle taxi = new Taxi();
		// 같은 타입보다는 상위타입을 쓰도록 노력하자. Vehicle
		
		System.out.println(bus.model); 
		Vehicle bus2 = new Bus(); //new taxi(); 를 넣어보고 if문에 실행되나 확인하기
		System.out.println(bus2.model);
		
		bus.run();
		bus2.run();
		// 부모 메소드는 자식인 run을 덮어 씌워진다. 이게 오버로드  (오버로드에 대해 좀 알아봐야 할 듯)
		
		bus.stop();
		((Bus)bus2).stop();  // 이게 뭐야..?  
		
		
		if(bus2 instanceof Bus) { 	// bus2가 Bus로 캐스팅이 가능한지.
			test((Bus)bus2);  //Bus일때만 캐스팅해줌.
		}else {
			System.out.println("Bus로 캐스팅 할 수 없습니다.");
		}
		
		//test(bus); // test호출
		test((Bus)bus2); // 버스2 강제 캐스팅
		
	}
	
	
	
	private static void test(Bus bus) {
		bus.stop();
	}
	
}
