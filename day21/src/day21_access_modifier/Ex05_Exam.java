package day21_access_modifier;

class Exam{
	
	// Field
	private String examName;
	private int kor, eng, mat;
	private double average;
	private char grade;
	
	// Constructor
	public Exam(String examName, int kor, int eng, int mat) {
		this.examName = examName;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		setAverage(kor, eng, mat);
		setGrade();
	}

	// Method
	// Getters and Setters			// 값이 종속성이 있어서 편집이 되면 안되는 것들은 private 처리
	public double getAverage() {
		return average;
	}

	private void setAverage(int kor, int eng, int mat) {
		this.average = (kor + eng + mat) / 3.0;
	}

	public char getGrade() {
		return grade;
	}

	private void setGrade() {
		if(average >= 90) grade = 'A';
		else if(average >= 80) grade = 'B';
		else if(average >= 70) grade = 'C';
		else if(average >= 60) grade = 'D';
	}
}
public class Ex05_Exam {
	public static void main(String[] args) {
		
		Exam exam = new Exam("중간고사", 60, 61, 62);
		
		System.out.println("평균 : " + exam.getAverage() + "점");
		System.out.println("학점 : " + exam.getGrade() + "학점");
	}
}

