package pdf05;

import java.util.Random;

public class Exercise52 {
	public static void main(String[] args) {
		Random random1 = new Random();
		int[] score = null;
		score = new int[6];
		int random = 0;

		for (int i = 0; i < 6; i++) {
			random = random1.nextInt(45) + 1;
			score[i] = random;
			for (int j = 0; j <= i; j++) {
				if (score[i] == score[j]) {
					i--;
				}
			}

		}
		for (int k = 0; k <6; k++) {
			System.out.printf("%d", score[k]);
		}
	}
}
