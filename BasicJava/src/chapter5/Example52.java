package chapter5;

import java.util.Random;

public class Example52 {

	public static void main(String[] args) {
		Random random = new Random();
		int[] score = null;
		score = new int[6];
		int num1 = 0;
		for (int i = 0; i < 6; i++) {
			num1 = random.nextInt(45) + 1;
			score[i] = num1;
			for (int j = 0; j < i; j++) {
				if (score[i] == score[j]) {
					i--;
				}
			}
		}
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d ", score[i]);
		}
	}
}