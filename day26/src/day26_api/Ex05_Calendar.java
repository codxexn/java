package day26_api;

import java.util.Calendar;

public class Ex05_Calendar {
	public static void main(String[] args) {
		
		// Calendar : 날짜와 시간을 다루는 클래스
		
		// Calendar 의 생성은 getInstance() 메소드를 이용한다.
		
		Calendar cal = Calendar.getInstance();		// getInstance() 메소드 사용하면 import 된다.
		
		// 1. 확인은 필드를 이용한다.
		
		// 년, 월, 일
		// Calendar.MONTH : 0 ~ 11의 값을 가지므로 + 1을 해주어야 한다.
		// 객체.get() 메소드 사용해서 get(Calendar.) 안에 불러올 값의 필드를 불러 온다.
		System.out.println(cal.get(Calendar.YEAR) + "년");
		System.out.println(cal.get(Calendar.MONTH) + 1 + "월");
		System.out.println(cal.get(Calendar.DAY_OF_MONTH) + "일");
		
		// 요일 번호
		// 일(1), 월(2), ... 토(7)
		System.out.println("요일 번호  : " + cal.get(Calendar.DAY_OF_WEEK));
		switch(cal.get(Calendar.DAY_OF_WEEK)) {
		case 1 : System.out.println("일요일"); break;
		case 2 : System.out.println("월요일"); break;
		case 3 : System.out.println("화요일"); break;
		case 4 : System.out.println("수요일"); break;
		case 5 : System.out.println("목요일"); break;
		case 6 : System.out.println("금요일"); break;
		case 7 : System.out.println("토요일"); break;
		}
		
		// 오전/오후, 시, 분, 초
		System.out.println("오전/ 오후 : " + cal.get(Calendar.AM_PM));		// 오전: 0, 오후 : 1
		System.out.println("12시각제 : " + cal.get(Calendar.HOUR));			// 0 ~ 11시 반환 
		System.out.println("24시각제 : " + cal.get(Calendar.HOUR_OF_DAY));	// 0 ~ 11시 반환 
		System.out.println("분 : " + cal.get(Calendar.MINUTE));
		System.out.println("초 : " + cal.get(Calendar.SECOND));
		System.out.println("밀리초 : " + cal.get(Calendar.MILLISECOND));
		System.out.println("밀리초 -> 초 : " + (cal.get(Calendar.MILLISECOND) / 1000.0) + "초");
		
		// 2. 변경
		// 2023-08-22 17:30:21
		cal.set(2023, 8, 22, 17, 30, 21);
		

		// 3. 날짜를 밀리초로 변환
		long millisecond = cal.getTimeInMillis();
		System.out.println("밀리초 : " + millisecond);	
		// DB 다루면 많이 보게 된다. 1970년 1월 1일 기준으로 0부터 시작.
		
		
		// 번외
		// 현재 시간을 밀리초 단위의 long 타입으로 반환하는 메소드
		System.out.println(System.currentTimeMillis());
		
		long start = System.currentTimeMillis();
		for(int i = 0; i < 2_000_000_000; i++);			// i++ 만 20억번 진행
		long end = System.currentTimeMillis();
		
		System.out.println("경과 시간 : " + (end - start) + "ms");
		
		
	}
}
