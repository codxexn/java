package test;

import java.util.Calendar;

public class Test03 {
	public static void main(String[] args) {
		
//		Test03.java
//		현재 날짜를 StringBuffer, Calendar 클래스를 이용하여
//		"2019년 10월 21일 월요일 오후 1시 10분" 과 같은 형식으로 완성하고 출력하시오.
		
		Calendar c = Calendar.getInstance();
		
		StringBuffer sb = new StringBuffer();
		StringBuffer dow = new StringBuffer();
		StringBuffer ampm = new StringBuffer();
		
		sb.append(c.get(Calendar.YEAR) + "년");
		sb.append(" " + (c.get(Calendar.MONTH) + 1) + "월");
		sb.append(" " + c.get(Calendar.DAY_OF_MONTH) + "일");
		switch(c.get(Calendar.DAY_OF_WEEK)) {
		case 1 : dow.append("일요일"); break;
		case 2 : dow.append("월요일"); break;
		case 3 : dow.append("화요일"); break;
		case 4 : dow.append("수요일"); break;
		case 5 : dow.append("목요일"); break;
		case 6 : dow.append("금요일"); break;
		case 7 : dow.append("토요일"); break;
		}
		sb.append(" " + dow);
		switch(c.get(Calendar.AM_PM)) {
		case 0 : ampm.append("오전"); break;
		case 1 : ampm.append("오후"); break;
		}
		sb.append(" " + ampm);
		sb.append(" " + c.get(Calendar.HOUR) + "시");
		sb.append(" " + c.get(Calendar.MINUTE) + "분");
		
		sb.toString();
		System.out.println(sb);
		
	}
	
	
}
