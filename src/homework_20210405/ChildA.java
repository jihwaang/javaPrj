package homework_20210405;

public class ChildA extends Parent{
	
	private int data;
	
	public ChildA(int data) {
		this.data = data;
	}
	
	@Override
	public void printProgram() {
		super.printProgram();
		System.out.println("this is Child A Class of the program.");
	}
	
	public void print() {
		System.out.println(data);
	}

}
