package homework;

import java.util.Scanner;

public class Homework_20210308 {
	public static void main(String[] args) {
		// Mission : 국어, 영어, 수학 점수를 입력받아 0~100사이가 아닐 경우 다시 입력 받고, 이상 없을 시 각각 합계, 평균을
		// 출력하도록 코드를 작성하시오.
		// 조건 : 국어, 영어, 수학의 점수가 0부터 100사이의 정수가 아닐 때 다시 입력 받으시오.
		int score_kor = 0;
		int score_eng = 0;
		int score_math = 0;
		
		boolean isValid = false;
		String sub_kor = "국어";
		String sub_eng = "영어";
		String sub_math = "수학";
		String inputText = "점수 입력 : ";
		Scanner scan = new Scanner(System.in);

		while (!isValid) {
			System.out.print(sub_kor + inputText);
			score_kor = Integer.parseInt(scan.nextLine());
			isValid = checkValidation(score_kor, sub_kor);
			
			System.out.print(sub_eng + inputText);
			score_eng = Integer.parseInt(scan.nextLine());
			isValid = checkValidation(score_eng, sub_eng);

			System.out.print(sub_math + inputText);
			score_math = Integer.parseInt(scan.nextLine());
			isValid = checkValidation(score_math, sub_math);
		}
		
		int total = score_kor + score_eng + score_math;
		float avg = total / 3.0f;
		System.out.printf("총점 : %d\n", total);
		System.out.printf("평균 : %.2f", avg);
	}

	public static boolean checkValidation(int score, String subject) {
		Scanner scan = new Scanner(System.in);
		if (!(0 <= score && score <= 100)) {
			System.out.println("입력한 값이 유효하지 않습니다.\n0~부터 100사이 숫자를 입력해주세요.");
			System.out.print(subject + "점수 입력 : ");
			score = Integer.parseInt(scan.nextLine());
			checkValidation(score, subject);
		}else {
			return true;
		}
		return false;
	}
}
