package homework6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class StudentScore {

	int[][] array = new int[5][3];
	Scanner A = new Scanner(System.in);

	void input() {

		for (int i = 0; i < 5; i++) {
			System.out.println((i + 1) + "번 학생 국어 영어 수학 점수 : ");
			for (int j = 0; j < 3; j++) {
				array[i][j] = A.nextInt();
			}
		}
		output();
	}

	void output() {
		int[] scoresum = new int[3];
		int[] stusum = new int[5];
		double avg;
		DecimalFormat form = new DecimalFormat("#.#");

		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < 5; i++) {
				if (j == 0) {
					scoresum[j] += array[i][j];
				} else if (j == 1) {
					scoresum[j] += array[i][j];
				} else if (j == 2) {
					scoresum[j] += array[i][j];
				}
			}
		}

		System.out.println("국어 총점은 " + scoresum[0] + "이고, 평균은 " + (form.format(scoresum[0] / 5.0)) + " 입니다");
		System.out.println("영어 총점은 " + scoresum[1] + "이고, 평균은 " + (form.format(scoresum[1] / 5.0)) + " 입니다");
		System.out.println("수학 총점은 " + scoresum[2] + "이고, 평균은 " + (form.format(scoresum[2] / 5.0)) + " 입니다");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == 0) {
					stusum[i] += array[i][j];
				} else if (i == 1) {
					stusum[i] += array[i][j];
				} else if (i == 2) {
					stusum[i] += array[i][j];
				} else if (i == 3) {
					stusum[i] += array[i][j];
				} else if (i == 4) {
					stusum[i] += array[i][j];
				}
			}
		}

		for (int i = 0; i < 5; i++) {
			System.out
					.println((i + 1) + "번 학생의 총점은 " + stusum[i] + "이고, 평균은 " + (form.format(stusum[i] / 3.0)) + " 입니다");
		}

	}
}
