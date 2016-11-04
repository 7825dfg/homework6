package homework6;

import java.util.Scanner;

public class AptPersonCount {
	int floor = 1;
	int ho = 1;
	int sum = 0;
	int[] array = new int[15];
	int[] hosum = new int[3];
	Scanner A = new Scanner(System.in);

	void input() {
		for (int i = 0; i < array.length; i++) {

			System.out.println(floor + "0" + ho + "호에 살고 있는 사람의 수 : ");
			array[i] = A.nextInt();
			sum += array[i];
			ho++;
			if (ho > 3) {
				ho = 1;
				floor++;
			}
		}
		floor = 1;
		output();
	}

	void output() {
		System.out.println("이 아파트의 거주자는 총 " + sum + "명 입니다.");
		sum = 0;

		for (int i = 1; i < array.length + 1; i++) {
			sum += array[i - 1];
			if (i % 3 == 0) {

				floor++;
				System.out.println(i / 3 + "층에 사는 거주자는 총 " + sum + "명 입니다.");
				sum = 0;
			}
			floor = 1;
		}

		for (int i = 1; i < array.length + 1; i++) {
			if (i % 3 == 1) {
				hosum[0] += array[i - 1];
			} else if (i % 3 == 2) {
				hosum[1] += array[i - 1];
			} else if (i % 3 == 0) {
				hosum[2] += array[i - 1];
			}
		}
		for (int i = 0; i < hosum.length; i++) {
			System.out.println(ho + "호 라인에 사는 거주자는 모두 " + hosum[i] + "명 입니다.");
			ho++;
		}
	}
}
