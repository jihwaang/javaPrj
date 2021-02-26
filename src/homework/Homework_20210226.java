package homework;
class Homework_20210226 {
	public static void main(String[] args) {
		/* Mission : int로 된 kor, eng, math, total의 출력값 형식을 소수점 둘째자리 까지 보이지도록 출력(단, 선언된 변수의 타입 변경 불가)
		 * Example :
		 *  ┌────────────────────┐
			│      　성적 출력      │
			└────────────────────┘
			국어 : 65.00
			영어 : 72.00
			수학 : 86.00
			총점 : 223.00
			평균 : 74.33
		 * */
		int kor, eng, math;
		int total;
		double avg;

		kor = 65;
		eng = 72;
		math = 86;

		total = kor + eng + math;
		avg = total / 3.0f;

		System.out.println("┌────────────────────┐");
		System.out.println("│      　성적 출력      │");
		System.out.println("└────────────────────┘");
		
		System.out.printf("국어 : %.2f\n", (double)kor);
		System.out.printf("영어 : %.2f\n", (double)eng);
		System.out.printf("수학 : %.2f\n", (double)math);
		System.out.printf("총점 : %.2f\n", (double)total);
		System.out.printf("평균 : %.2f\n", avg);
	}
}