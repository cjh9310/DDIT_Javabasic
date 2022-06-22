package chapter5;

import java.util.Random;

public class Example540 {

	public static void main(String[] args) {
		Random random = new Random();
		int [] dice = new int[6];
		for(int i=0; i<10000; i++) {
		dice[random.nextInt(6)]++;
		
	}System.out.println("------------------------");
	  System.out.println("면\t빈도");
	  
		for(int i=0; i<dice.length; i++) {
			System.out.printf("%d\t%d\n",i+1,dice[i]);
		}
		System.out.println("------------------------");
}	
}