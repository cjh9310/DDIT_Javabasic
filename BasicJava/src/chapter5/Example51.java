package chapter5;

public class Example51 {

	public static void main(String[] args) {
		int[] score = {38,94,16,3,76,94,82,47,59,8};
		int max = 0;
		int min ;
		min = score[0];
	  //int max = Integer.MIN_VALUE;
	//	int min = Integer.MAX_VALUE;
		for(int i =0; i<score.length; i++) {
			if(max<score[i]) {
				max = score[i];
			}if(min>score[i]) {
				min = score[i];
			}
		}System.out.println("max : "+max);
	     System.out.println("min : " + min);
	}

}
