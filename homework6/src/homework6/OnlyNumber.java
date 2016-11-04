package homework6;

import java.util.Scanner;

public class OnlyNumber {
	int[] num = new int[10];
	int temp;
	Scanner A = new Scanner(System.in);

	void input() {
		System.out.println("1~100 사이의 숫자를 입력하세요 :");
		for (int i = 0; i < num.length; i++) {
			num[i] = A.nextInt();
			if (num[i] < 1 || num[i] > 100) {
				System.out.println("다시 입력하세요.");
				i--;
			}
			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					System.out.println("다시 입력하세요.");
					i--;
				}

			}
		}
		output();
	}

	void output() {
		for (int i = num.length - 1; i >= 0; i--) {
			System.out.println((i + 1) + "번째 숫자는 " + num[i] + " 입니다.");

		}

	}

}
