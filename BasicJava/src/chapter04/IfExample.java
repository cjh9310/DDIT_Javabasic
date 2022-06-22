package chapter04;

public class IfExample {

	public static void main(String[] args) {
		int score = 93;
		if(score>90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		if(score<90) 
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		
			
		int score1 = 85;
		
		if(score1>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
		
		System.out.println("------------------------------------");
		int score2 = 75;
		if(score2>=90) {
			System.out.println("점수가 100~90입니다.");
			System.out.println("등급은 A입니다.");
		}else if(score2>=80) {
			System.out.println("점수가 80~89입니다.");
			System.out.println("등급은 B입니다.");
		}else if(score2>=70) {
			System.out.println("점수가 70~79입니다.");
			System.out.println("등급은 C입니다.");
		}else {
			System.out.println("점수가 70 미만입니다.");
			System.out.println("등급이 D입니다.");
		}
		
	}}