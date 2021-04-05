package homework_20210405;

public class ChildB extends Parent{
	private int data;
	
	public ChildB(int data) {
		this.data = data;
	}
	
	@Override
	public void printProgram() {
		super.printProgram();
		System.out.println("this is Child B Class of the program.");
	}
	
	public void print() {
		System.out.println(data);
	}
}
