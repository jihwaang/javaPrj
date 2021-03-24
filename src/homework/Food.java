package homework;

public class Food {
	private int apple = 1;
	private int banana = 1;
	private int pork = 3;
	private int beef = 3;
	private int koreaBeef = 10;
	
	public Food() {}
	
	public Food(int apple, int banana, int pork, int beef, int koreaBeef) {
		super();
		this.apple = apple;
		this.banana = banana;
		this.pork = pork;
		this.beef = beef;
		this.koreaBeef = koreaBeef;
	}

	public int getApple() {
		return apple;
	}

	public void setApple(int apple) {
		this.apple = apple;
	}

	public int getBanana() {
		return banana;
	}

	public void setBanana(int banana) {
		this.banana = banana;
	}

	public int getPork() {
		return pork;
	}

	public void setPork(int pork) {
		this.pork = pork;
	}

	public int getBeef() {
		return beef;
	}

	public void setBeef(int beef) {
		this.beef = beef;
	}

	public int getKoreaBeef() {
		return koreaBeef;
	}

	public void setKoreaBeef(int koreaBeef) {
		this.koreaBeef = koreaBeef;
	}

	@Override
	public String toString() {
		return "Food [apple=" + apple + ", banana=" + banana + ", pork=" + pork + ", beef=" + beef + ", koreaBeef="
				+ koreaBeef + "]";
	}
	
	
	
}
