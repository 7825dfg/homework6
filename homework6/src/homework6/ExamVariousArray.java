package homework6;

import java.util.Scanner;

public class ExamVariousArray {

	public static void main(String[] args) {
		
		while(true){
			
			String cho ;
			Scanner A= new Scanner(System.in);
			
			System.out.println("1. 두번째로 큰 수 찾기");
			System.out.println("2. 심사 점수 계산");
			System.out.println("3. 학생 총점, 평균값 구하기");
			System.out.println("4. 5층 아파트의 거주자 숫자 구하기");
			System.out.println("5. 겹치지 않는 숫자 10개입력받기");
			System.out.println("6. 종료하기");
			System.out.println("원하는 메뉴는 >>>");
			cho =A.next();
			if(cho.equals("1")){
				new SecondMax().input();
			}
			else if(cho.equals("2")){
				new AvgScore().input();
			}
			else if(cho.equals("3")){
				new StudentScore().input();
			}
			else if(cho.equals("4")){
				new AptPersonCount().input();
			}
			else if (cho.equals("5")) {
				new OnlyNumber().input();
			}
			else if(cho.equals("6")){
				System.exit(0);
			}
		}

	}

}
