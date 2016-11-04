package homework6;

import java.util.Scanner;

public class AvgScore {

	double[] array = new double[10];

	void input() {
		Scanner A = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			System.out.println((i + 1) + "번 심사 점수 입력 : ");
			array[i] = A.nextDouble();
		}
		output();
	}

	void output() {
		double max = array[0];
		double min = array[0];
		double sum = 0;
		double avg = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			} else if (array[i] < min) {
				min = array[i];
			}
		}
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		avg = (sum - max - min) / 8.0;
		System.out.println("가장 큰 점수와 작은 점수를 제외한");
		System.out.println("8개의 점수 평균은 " + avg + " 입니다.");
	}
}
