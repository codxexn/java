package day26_api;

import java.sql.Date;

//import java.util.Date;

public class Ex06_Date {
	public static void main(String[] args) {
		
		// 1. 자바용 Date : java.util.Date (java.util 패키지에 저장된 Date 클래스)
		// 2. SQL용 Date : java.sql.Date (java.sql 패키지에 저장된 Date 클래스)
		
		// 자바용 Date : 디테일한 날짜가 필요할 때
//		Date now = new Date();
//		System.out.println("현재 시간 : " + now);
		
		// KST : Korea Standard Time
		
		// SQL문용 Date : 일반적
		Date now = new Date(System.currentTimeMillis());
		System.out.println("현재시간 : " + now);
		
	}
}
