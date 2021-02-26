class Hello {
	public static void main(String[] args) {
		// declare variables
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
		
		System.out.printf("국어 : %d\n", kor);
		System.out.printf("영어 : %d\n", eng);
		System.out.printf("수학 : %d\n", math);
		System.out.printf("총점 : %d\n", total);
		System.out.printf("평균 : %-26.2f\n", avg);
		
		System.out.printf("%1$d, %2$d, %1$d, %2$d, %2$d", 1, 2);
	}
}