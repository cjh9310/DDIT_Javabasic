package chapter04;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		// 옛날 랜덤공식(보안이 안좋아서 사용하지 않음)      마지막숫자 - 처음숫자 +1
		// (int)(Math.random() * (추출한 숫자)) + 처음 숫자;
		
		// 최근 공식  (검색 => 자바 랜덤 난수)
//		Random random = new Random();
//		random.nextInt(6); //0부터 5까지
		
		Random random1 = new Random(); // new Random()안에 숫자가 없으면 랜덤으로 생성된다. seed삽입
		// random.nextInt(6);             
		System.out.println(random1.nextInt(6));
		System.out.println(random1.nextInt(6));
		System.out.println(random1.nextInt(6));
		System.out.println(random1.nextInt(6));
		System.out.println(random1.nextInt(6));
		System.out.println(random1.nextInt(6));
		System.out.println(random1.nextInt(6));
		System.out.println(random1.nextInt(6));
		System.out.println(random1.nextInt(6));
		System.out.println(random1.nextInt(6));
		System.out.println(random1.nextInt(6));
		
	}
}
