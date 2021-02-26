class Hello {
	public static void main(String[] args) {
		// declare variables
		int kor, eng, math;
		int total;
		double avg;

		kor = 60;
		eng = 70;
		math = 80;

		total = kor + eng + math;
		avg = total / 3;

		System.out.print("┌────────────────────┐\n");
		System.out.print("│      　성적 출력      │\n");
		System.out.print("└────────────────────┘\n");
		
		System.out.print("국어 1 : 0\n");
		System.out.print("국어 2 : 0\n");
	}
}