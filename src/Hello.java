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

		System.out.printf("total is %d\n", total);
	}
}