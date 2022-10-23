package sec02.example04;

public class Student {

	private String name;
	private String address;
	private int englishScore;
	private int mathScore;
	
	public Student(String name, String address, int englishCore, int mathScore) {
		this.name = name;
		this.address = address;
		this.englishScore = englishCore;
		this.mathScore = mathScore;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getEnglishScore() {
		return englishScore;
	}
	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	
	
}
