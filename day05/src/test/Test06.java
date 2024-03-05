package test;

import javax.swing.JOptionPane;

public class Test06 {
	public static void main(String[] args) {
		
		String strK = JOptionPane.showInputDialog("국어점수를 입력하시오.");
		String strE = JOptionPane.showInputDialog("영어점수를 입력하시오.");
		String strM = JOptionPane.showInputDialog("수학점수를 입력하시오.");
	
		double korean = Double.parseDouble(strK);
		double english = Double.parseDouble(strE);
		double math = Double.parseDouble(strM);
		
		double average = (korean + english + math) / 3;
		
		String message = "세 과목의 평균 점수는 " + average + "점 입니다.";
		
		JOptionPane.showMessageDialog(null, message);
		
	
	}
}
