package chapter8;

public class SoundableExample {
	private static void PrintSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	public static void main(String[] args) {
		// Soubdable sound = new Cat();
		
		PrintSound(new Cat());
		PrintSound(new dog());
	}
	
}
