package chapter5;

import java.util.Random;

public class Example57 {

	public static void main(String[] args) {
		Random random = new Random();
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int [] ball3 = new int[3];
		
		for(int i=0; i<ballArr.length; i++) {
			int j = random.nextInt(ballArr.length)+1;
			if(ballArr[i]==j) {
				i--;
				for(int a=0; a<3; a++) {
					ball3[a] =j;
				}
			}
			
//			
		}
		for(int i=0; i<ball3.length; i++) {
			System.out.println(ball3[i]);
		}
	}

}
