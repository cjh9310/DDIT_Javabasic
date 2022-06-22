package chapter5;

import java.util.Scanner;

public class ArrayInExample2 {

	public static void main(String[] args) {
//		int max = Integer.MIN_VALUE;
//		int max = Integer.MAX_VALUE;
		
		int max =0;
		int[] array = {1,5,3,8,2};
		int min  ;
		min = array[0] ;
		for(int a=0; a<array.length; a++) {
		if(max<array[a]) {
				max=array[a] ;}
		}
		for(int a=0; a<array.length; a++) {
			 
		if(min > array[a]) {
			min = array[a];
		}}
		
		 System.out.println("max : "+max);
	     System.out.printf("min :%d\n",min);
//		
//		int [][] array1 = {
//				{95,86},
//				{83,92,96},
//				{78,83,93,87,88}
//		};
//		int sum=0;
//		double avg = 0.0;
//		double count =0;
//		
//		
//		for(int i=0; i<array1.length; i++) {
//			for(int j=0; j<array1[i].length; j++) {
//				sum = sum+array1[i][j];
//				count++;
//			}
//		}
//		avg = sum/count;
//		System.out.println("sum: "+sum);
//		System.out.println("avg: "+avg);
//		
//		
//		System.out.println();
		
		boolean run =true;
		int studentNum =0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		
		while(run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1.학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("---------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			
			if(selectNo ==1) {
			System.out.print("학생수>");
			studentNum = Integer.parseInt(scanner.nextLine());
			
			}else if(selectNo == 2) {
				scores = new int[studentNum];
				for(int a=0; a<scores.length; a++) {
					System.out.printf("scores[%d]>",a);
					scores[a]  = Integer.parseInt(scanner.nextLine());
					}	
			}else if(selectNo ==3) {
				for(int a=0; a<scores.length; a++) {
					System.out.printf("scores[%d]>%d\n",a,scores[a]);
				}
			}else if(selectNo ==4) {
				int max2 = scores[0];
				int max3 = 0;
				for(int a=0; a<scores.length; a++) {
					if(max2<scores[a]) {
						max2=scores[a];
						
					}max3= max3+scores[a];
				}double avg = (double)max3 / (scores.length);
				System.out.printf("최고 점수 : %d\n",max2);
				System.out.printf("평균 점수 : %.14f\n",avg);
			}else if (selectNo ==5) {
				run = false;
			}
			
			
		
	}
		System.out.println("프로그램 종료");
		scanner.close();
}
}