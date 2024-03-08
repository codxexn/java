package day16_Constructor;

class Student {
	
	// Field
	String name;
	String school;
	int[] score;
	double average;
	boolean isPass;		// 평균 50 이상이면 true
	
	// Constructor
	Student(String _name, String _school) {
		name = _name;
		school = _school;
		score = new int[3];
	}
	
	//  Method
	void doExam() {
		int total = 0;
		for(int i = 0; i < score.length; i++) {
			score[i] = (int)(Math.random() * 101);
			total += score[i];
		}
		
		average = (int)total / score.length;
		isPass = average >= 50;
	}
	
	void printStudent() {
		System.out.println("이름 : " + name);
		System.out.println("학교 : " + school);
		for(int i = 0; i < score.length; i++) {
			System.out.println("점수" + (i + 1) + " : " + score[i]);
		}
		System.out.println("평균 : " + average);
		System.out.println(isPass ? "합격" : "불합격");
		System.out.println("이름 : " + name);
	}

}


public class Ex04_Student {
	public static void main(String[] args) {
		
		Student stu = new Student("제임스", "서울대");
		stu.doExam();		// score 3개를 0 ~ 100 사이 랜덤 생성
		stu.printStudent();	// 이름, 학교, 점수 3개, 평균, 합격/ 불합격
		
	}
}
