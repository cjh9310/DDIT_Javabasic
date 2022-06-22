package chapter5;

public class ArrayExample1 {

	public static void main(String[] args) {
		// p.180
//		int [] scores = {83, 90, 87};
//		System.out.println("scores[0] : "+ scores[0]);
//		System.out.println("scores[1] : "+ scores[1]);
//		System.out.println("scores[2] : "+ scores[2]);
//		
//		int sum = 0;
//		for(int i=0; i<3; i++) {
//			sum += scores[i];
//		}
//		System.out.println("총합 : " + sum);
//		double avg = (double) sum/3;
//		System.out.println("평균 : " + avg);
		
		// p.184
		int[] arr1 = new int[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int a=0; a<3; a++) {
			System.out.println("arr1[" + a + "]: " +arr1[a]);
		}
		double[] arr2 = new double[3];
		for(int j=0; j<3; j++) {
			System.out.println("arr2[" + j +"] : " +arr2[j]);
		}
			arr2[0] = 0.1;
			arr2[1] = 0.2;
			arr2[2] = 0.3;
		
			for(int b=0; b<3; b++) {
				System.out.println("arr2[" + b +"] : "+arr2[b]);
			}
			
			String[] arr3 = new String[3];
			
			for(int c=0; c<3; c++) {
				System.out.println("arr3[" + c +"] : "+arr3[c]);
			}
			arr3[0] = "1월";
			arr3[1] = "2월";
			arr3[2] = "3월";
			for(int v=0; v<3; v++) {
				System.out.println("arr3[" + v + "] : "+arr3[v]);
				
			}
			System.out.println("**************");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
