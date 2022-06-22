package pdf05;

public class Exercise51 {
	
	public static void main(String[] args) {
		int[] scores = {38,94,16,3,76,94,82,47,59,8};
		int max =0;
		int min ;
		min = scores[0];
		for(int i=0; i<scores.length; i++) {
			if(max<scores[i]) {
				max = scores[i];
			}if(min>scores[i]) {
				min = scores[i];;
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}
