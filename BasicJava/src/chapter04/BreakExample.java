package chapter04;

import java.util.Random;

public class BreakExample {

	public static void main(String[] args) {
		//157
		Random random = new Random();
		while(true) {
			int ranNum = random.nextInt(6)+1;
			System.out.println(ranNum);
			if(ranNum ==6) {
				break;
			}
		}
		
		//158
		Qutter:for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper+"-"+lower);
				if(lower=='g') {
					break Qutter;
					
				}
			}
		}System.out.println("프로그램 실행 종료");
		//159
		for(int i=1; i<=10; i++) {
			if(i%2 !=0) {
				continue;
				
			}System.out.println(i);
		}
		
		
		
	}

}
