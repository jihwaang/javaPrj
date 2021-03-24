package homework;

public class NewLectStudent {
	
	private int level;
	
	private int satisfying;
	
	public NewLectStudent() {}
	
	public NewLectStudent(int level, int satisfying) {
		this.level = level;
		this.satisfying = satisfying;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getSatisfying() {
		return satisfying;
	}

	public void setSatisfying(int satisfying) {
		this.satisfying = satisfying;
	}

	@Override
	public String toString() {
		return "NewLectStudent [level=" + level + ", satisfying=" + satisfying + "]";
	}
	
	public void takeFood(int selectedFood) {
		this.satisfying += selectedFood;
		checkLevel(this.satisfying);
		System.out.println("포만감 : " + this.satisfying);
		showLevel();
	}
	
	public void showLevel() {
		System.out.println("현재 레벨 : " + this.level);
	}

	private void checkLevel(int satisfying) {
		if(0 < satisfying && satisfying < 10) {
			this.level = 1;
		}else if(10 <= satisfying && satisfying < 20) {
			this.level = 2;
		}else if(20 <= satisfying && satisfying < 30) {
			this.level = 3;
		}else if(30 <= satisfying && satisfying < 40) {
			this.level = 4;
		}else {
			this.level = 5;
		}
	}
	
	
	
	
}
