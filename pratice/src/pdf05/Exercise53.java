package pdf05;

import java.util.Random;
import java.util.Scanner;

public class Exercise53 {
	public static void main(String[] args) {
		Random random1 = new Random();
		int random = random1.nextInt(3);
		String[] arr = {"가위", "바위", "보"};
		Scanner scanner = new Scanner(System.in);
		String ga = scanner.next();
		System.out.println("게이머: "+ ga);
		System.out.println("인공지능 컴퓨터: "+arr[random]);
		
		while(true) {
			if(ga.equals(arr[random])) {
				System.out.println("무승부");
			}else if(ga.equals("가위")&&arr[random].equals("보")|| 
					 ga.equals("바위")&&arr[random].equals("가위")||
				     ga.equals("보")&&arr[random].equals("바위")) {
				System.out.println("게이머 승");
			}else {
				System.out.println("인공지능 승");
			}
			 break;
		}
	}
}
