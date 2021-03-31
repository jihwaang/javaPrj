package homework20210331;

public class IdolProgram {
	public static void main(String[] args) {
		String name = "아이돌 그룹 이름";
		int mbrCnt = 5;
		int[] age = {20, 21, 22, 23, 24};
		double[] height = {180.0, 170.0, 175.0, 178,0, 185.4};
		String[] position = {"보컬","보컬2","댄스","댄스2","둘다"};
		IdolMember idMbr = new IdolMember(name, age, height, position); 
		idMbr.printGroupName();
		idMbr.printAge();
		idMbr.printHeight();
		idMbr.printPosition();
	}
}
