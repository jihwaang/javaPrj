package homework20210331;

public class IdolMember extends IdolGroup{
	private String[] position;
	private int[] age;
	private double[] height;
	
	public IdolMember(String name, int[] age, double[] height, String[] position) {
		super(name, age, height);
		this.age = age;
		this.height = height;
		this.position = position;
	}
	
	@Override
	public void printAge() {
		for(int age : age)
			System.out.println("나이 : "+age);
	}
	
	@Override
	public void printHeight() {
		for(double height : height)
			System.out.println("신장 : "+height);
	}
	
	public void printPosition() {
		for(int i = 0; i < position.length; i++) {
			System.out.printf("position = %s\n", position[i]);
		}
	}

}
