package homework6;

import java.util.Scanner;

public class SecondMax {

	int[] array = new int[10];

	void input() {
		Scanner A = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {

			System.out.println((i + 1) + "번째 수를 입력하시오 : ");
			array[i] = A.nextInt();

		}
		output();
	}

	void output() {
		int max = array[0];
		int fx = 0;
		int num = 0;

		for (int i = 0; i < array.length; i++) {

			if (max < array[i]) {
				fx = max;
				max = array[i];
				num=i;
				
			}
			else if (max != array[i] && fx < array[i] && max > array[i]) {
				fx = array[i];
				num = i+1;
			}
			
		}
		System.out.println("두번째로 큰 수 는 " + num + "번째 수" + fx + " 입니다");
	}
}
