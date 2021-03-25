package ex6.capsule3.covid;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Covid19 {
	private String date;
	private String confirms;
	private String deaths;
	private String tests;
	private String selfQuarnatine;
	private String outOfSelfQuarnatine;
	private String recovers;
	private String quarantineDomestic;
	private String quarantineImpoerted;
	private String dataDate;
	
	private Covid19[] covid19Array;
	private int covid19Size;
	
	public Covid19() {}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getConfirms() {
		return confirms;
	}
	public void setConfirms(String confirms) {
		this.confirms = confirms;
	}
	public String getDeaths() {
		return deaths;
	}
	public void setDeaths(String deaths) {
		this.deaths = deaths;
	}
	public String getTests() {
		return tests;
	}
	public void setTests(String tests) {
		this.tests = tests;
	}
	public String getSelfQuarnatine() {
		return selfQuarnatine;
	}
	public void setSelfQuarnatine(String selfQuarnatine) {
		this.selfQuarnatine = selfQuarnatine;
	}
	public String getOutOfSelfQuarnatine() {
		return outOfSelfQuarnatine;
	}
	public void setOutOfSelfQuarnatine(String outOfSelfQuarnatine) {
		this.outOfSelfQuarnatine = outOfSelfQuarnatine;
	}
	public String getRecovers() {
		return recovers;
	}
	public void setRecovers(String recovers) {
		this.recovers = recovers;
	}
	public String getQuarantineDomestic() {
		return quarantineDomestic;
	}
	public void setQuarantineDomestic(String quarantineDomestic) {
		this.quarantineDomestic = quarantineDomestic;
	}
	public String getQuarantineImpoerted() {
		return quarantineImpoerted;
	}
	public void setQuarantineImpoerted(String quarantineImpoerted) {
		this.quarantineImpoerted = quarantineImpoerted;
	}
	public String getDataDate() {
		return dataDate;
	}
	public void setDataDate(String dataDate) {
		this.dataDate = dataDate;
	}

	public Covid19[] getCovid19Array() {
		return covid19Array;
	}

	public void setCovid19Array(Covid19[] covid19Array) {
		this.covid19Array = covid19Array;
	}

	public int getCovid19Size() {
		return covid19Size;
	}

	public void setCovid19Size(int covid19Size) {
		this.covid19Size = covid19Size;
	}

	@Override
	public String toString() {
		return "Covid19 [date=" + date + ", confirms=" + confirms + ", deaths=" + deaths + ", tests=" + tests
				+ ", selfQuarnatine=" + selfQuarnatine + ", outOfSelfQuarnatine=" + outOfSelfQuarnatine + ", recovers="
				+ recovers + ", quarantineDomestic=" + quarantineDomestic + ", quarantineImpoerted="
				+ quarantineImpoerted + ", dataDate=" + dataDate + "]";
	}

	public void init(Covid19 covid19, String[] row) throws IOException {
		int idx = 0;
		covid19.date = row[idx++];
		covid19.confirms = row[idx++];
		covid19.deaths = row[idx++];
		covid19.tests = row[idx++];
		covid19.selfQuarnatine = row[idx++];
		covid19.outOfSelfQuarnatine = row[idx++];
		covid19.recovers = row[idx++];
		covid19.quarantineDomestic = row[idx++];
		covid19.quarantineImpoerted = row[idx++];
		covid19.dataDate = row[idx++];
	}

	private Scanner newScanner(String path, String encodingType) throws IOException, FileNotFoundException {
		return new Scanner(new InputStreamReader(new FileInputStream(path), encodingType));
	}

	public String printCovid19(Covid19 covid19) {
		String data = covid19.getAllData(covid19);
		return data;
	}

	private String getAllData(Covid19 covid19) {
		String data =  covid19.date + ","
				     + covid19.confirms + ","
				     + covid19.deaths + ","
				     + covid19.tests + ","
				     + covid19.selfQuarnatine + ","
				     + covid19.outOfSelfQuarnatine + ","
				     + covid19.recovers + ","
				     + covid19.quarantineDomestic + ","
				     + covid19.quarantineImpoerted + ","
				     + covid19.dataDate;
		return data;
	}

	public void computeCovid19Size(Covid19 covid19, Scanner scanner) {
		int count = 0;
		while(scanner.hasNextLine()) {
			scanner.nextLine().split(",");
			count++;
		} // end while
		covid19.covid19Size = count;
	}

	public void createCovid19Array(Covid19 covid19) {
		covid19.covid19Array = new Covid19[covid19.covid19Size];
	}

	public void setCovid19Array(Covid19 covid19, int idx) {
		covid19.covid19Array[idx] = covid19; 
	}

	public int getTestsTotal(Covid19 covid19) {
		int total = 0;
		for(int i = 1; i < covid19.covid19Size; i++) {
			total += Integer.parseInt(covid19.covid19Array[i].tests);
		}
		return total;
	}

	public int getMaxTests(Covid19 covid19) {
		int max = 0;
		int maxIdx = 0;
		for(int i = 1; i < covid19.covid19Size; i++) {
			if(max < Integer.parseInt(covid19.covid19Array[i].tests)) {
				max = Integer.parseInt(covid19.covid19Array[i].tests);
				maxIdx = i;
			}
		}
		System.out.printf("날짜 : %s\n", covid19.covid19Array[maxIdx].date);
		return max;
	}

	
}
