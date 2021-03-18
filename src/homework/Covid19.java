package homework;

public class Covid19 {
	String date;
	
	int positiveNumber;
	
	int deathNumber;
	
	int testingNumber;
	
	int quarantineNumber;
	
	int outQuarantineNumber;
	
	int recoveredNumber;
	
	int touchedNumber;
	
	int traveledNumber;
	
	String _date;
	
	int diff;
	
	int rest;
		
	public int getRestNumber() {
		return positiveNumber - recoveredNumber;
	}
	
	public void setCovid19(String[] row) {
		int idx = 0;
		this.date= row[idx++];
		this.positiveNumber= Integer.parseInt(row[idx++]);
		this.deathNumber = Integer.parseInt(row[idx++]);
		this.testingNumber = Integer.parseInt(row[idx++]);
		this.quarantineNumber = Integer.parseInt(row[idx++]);
		this.outQuarantineNumber = Integer.parseInt(row[idx++]);
		this.recoveredNumber = Integer.parseInt(row[idx++]);
		this.touchedNumber = Integer.parseInt(row[idx++]);
		this.traveledNumber = Integer.parseInt(row[idx++]);
		this._date = row[idx++];
	}
	
}
