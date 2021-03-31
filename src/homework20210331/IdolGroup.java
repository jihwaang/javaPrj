package homework20210331;

public class IdolGroup {
	private String name;
	private int[] age;
	private double[] height;
	
	public IdolGroup(String name, int[] age, double[] height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public void printGroupName() {
		System.out.printf("Group name is %s\n", this.name);
	}
	
	public void printAge() {
		int avgAge = 0;
		
		for(int i = 0; i < this.age.length; i++)
			avgAge += this.age[i];
		
		avgAge = avgAge / age.length;
		
		System.out.printf("average age is %d\n", avgAge);
	}
	
	public void printHeight() {
		double avgHeight = 0;
		
		for(int i = 0; i < this.height.length; i++)
			avgHeight += this.height[i];
		
		avgHeight /= this.height.length;
		
		System.out.printf("average age is %.2f\n", avgHeight);
	}
	
}
