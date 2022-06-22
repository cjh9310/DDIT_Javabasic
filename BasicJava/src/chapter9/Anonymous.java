package chapter9;

public class Anonymous {
	RemoteControl field = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("티비를 켭니다.");
			
		}
		
		@Override
		public void turnOff() {
			System.out.println("티비를 끕니다. ");
			
		}
	};
	void method1() {
		RemoteControl localVar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
				
			}
		};
		localVar.turnOn();
	}
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}
