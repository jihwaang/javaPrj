package homework_20210405;

public class Program {
	public static void main(String[] args) {
		Parent[] children = new Parent[2];
		
		children[0] = new ChildA(1);
		children[1] = new ChildB(2);
		
		for(int i = 0; i < 2 ; i++){
			children[i].printProgram();
			children[i].print();
		}
	}
}
