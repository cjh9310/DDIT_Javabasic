package chapter5;

import java.util.Random;

public class Example54 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		int[] score =null;
		score =new int[6];
		Random random = new Random(); 
		int num =0;
		int count1 =0;
		int count2 =0;
		int count3 =0;
		int count4 =0;
		int count5 =0;
		int count6 =0;
		for(int i=1; i<=10000; i++) {
			num = random.nextInt(6)+1;
			if(num ==1) {
				count1++;
			}else if(num ==2) {
				count2++;
			}else if(num ==3) {
				count3++;
			}else if(num ==4) {
				count4++;
			}else if(num ==5) {
				count5++;
			}else if(num ==6) {
				count6++;
			}
		} score[0] = count1;
		  score[1] = count2;
		  score[2] = count3;
		  score[3] = count4;
		  score[4] = count5;
		  score[5] = count6;
		  System.out.println("------------------------");
		  System.out.println("면         빈도");
		  System.out.println("------------------------");
		  for(int i=0; i<score.length; i++){
			    System.out.printf("%d         %d\n",i+1,score[i]);
			    
			}
	}

}
