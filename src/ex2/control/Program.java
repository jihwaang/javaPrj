package ex2.control;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// 기본형식 : primitive type
		int kor, eng;
		int math;
		int total;
		float avg;

		kor = 0;
		eng = 0;
		math = 0;
		
		boolean isFinished = false;
		while (!isFinished) {
			// 여기에 성적을 입력하는 코드를 작성하시오.
			System.out.println("┌────────────────────┐");
			System.out.println("│      　성적 입력      │");
			System.out.println("└────────────────────┘");

			Scanner sc = new Scanner(System.in);

			System.out.printf("국어 : ");
			kor = Integer.parseInt(sc.nextLine());
			System.out.printf("영어 : ");
			eng = Integer.parseInt(sc.nextLine());
			System.out.printf("수학 : ");
			math = Integer.parseInt(sc.nextLine());

			total = kor + eng + math;
			avg = total / 3.0f;

			System.out.println("┌───────────────────────────────┐");
			System.out.println("│           　성적 출력            │");
			System.out.println("└───────────────────────────────┘");

			System.out.printf("국어 : %d\n", kor);
			System.out.printf("영어 : %d\n", eng);
			System.out.printf("수학 : %d\n", math);

			System.out.printf("총점 : %2d\n", total);
			System.out.printf("평균 : %26.2f\n", avg);
			
			System.out.print("종료할까요?(true/false)");
			isFinished = sc.nextBoolean();
		}

	}

}