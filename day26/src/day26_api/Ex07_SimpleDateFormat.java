package day26_api;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex07_SimpleDateFormat {
	public static void main(String[] args) {
		
	
	/*
	 * 	SimpleDateFormat 의 형식 
	 * 	1. 년 : yy, yyyy
	 *  2. 월 : M, MM
	 *  3. 일 : d, dd 
	 *  4. 요일 : E
	 *  5. 오전 / 오후 : a
	 *  6. 시 : hh(12시각제), HH(24시각제)
	 *  7. 분 : mm
	 *  8. 초 : ss
	 *  
	 *  날짜를 어떻게 포매팅할지를 정의할 때 사용
	 */
	
	// 2023년 6월 8일 오전 1:30
	Date today = new Date();
	String pattern = "yyyy년 M월 d일 E요일 a h:mm";
	SimpleDateFormat sdf = new SimpleDateFormat(pattern);
	
	String now = sdf.format(today);
	System.out.println("현재 날짜와 시간 : " + now);
	
	}
}
