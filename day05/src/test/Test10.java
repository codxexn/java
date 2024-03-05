package test;

import javax.swing.JOptionPane;

public class Test10 {
	public static void main(String[] args) {
		
		String strWeight = JOptionPane.showInputDialog("몸무게를 입력하시오.");
		String strHeight = JOptionPane.showInputDialog("키를 입력하시오.");
		
		double weight = Double.parseDouble(strWeight);
		double height = Double.parseDouble(strHeight);
		double bmi = weight / (height * height);
		
		boolean isover = bmi >= 25;
		boolean isnormal = bmi < 25 && bmi >= 20;
		String message = isover ? "과체중" : isnormal ? "일반체중" : "저체중";
		
		JOptionPane.showMessageDialog(null, message);
		
	}
}
