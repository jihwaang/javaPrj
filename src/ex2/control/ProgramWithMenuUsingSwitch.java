package ex2.control;

import java.util.Scanner;

public class ProgramWithMenuUsingSwitch {

	public static void main(String[] args) {
		// 기본형식 : primitive type
		int kor = 0; int eng = 0; int math = 0;
		int total = kor + eng + math;
		float avg = total / 3.0f;
		
		boolean isFinished = false;

		Scanner scan = new Scanner(System.in);

		EXIT:
		while (!isFinished) {
			int selectedOption;
			System.out.println("┌────────────────────┐");
			System.out.println("│      　메인 메뉴      │");
			System.out.println("└────────────────────┘");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 종료");
			
			selectedOption = Integer.parseInt(scan.nextLine());
			
			switch(selectedOption) {
				case 1 : 
					// 여기에 성적을 입력하는 코드를 작성하시오.
					System.out.println("┌────────────────────┐");
					System.out.println("│      　성적 입력      │");
					System.out.println("└────────────────────┘");
					System.out.printf("국어 : ");
					
					kor = Integer.parseInt(scan.nextLine());
					
					System.out.printf("영어 : ");
					
					eng = Integer.parseInt(scan.nextLine());
					
					System.out.printf("수학 : ");
					
					math = Integer.parseInt(scan.nextLine());
					break;
				case 2 :
					total = kor + eng + math;
					avg = total / 3.0f;
					
					System.out.println("┌───────────────────────────────┐");
					System.out.println("│           　성적 출력            │");
					System.out.println("└───────────────────────────────┘");

					System.out.printf("국어 : %d\n", kor);
					System.out.printf("영어 : %d\n", eng);
					System.out.printf("수학 : %d\n", math);

					System.out.printf("총점 : %2d\n", total);
					System.out.printf("평균 : %.2f\n", avg);
					break;
				case 3 : 
					System.out.println("Bye");
					break EXIT;
				default :
					System.out.print("종료할까요?(true/false)");
					isFinished = scan.nextBoolean();
			}
		}
	}
}