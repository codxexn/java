package test;

import java.util.Calendar;

public class Test04 {
	public static void main(String[] args) {
		
//		Test04.java
//		각자 기념하고 싶은 기념일을 이용해서
//		기념일부터 오늘까지 며칠이 지났는지 계산하시오.
//		Calendar 클래스와 getTimeInMillis() 메소드 활용
		
		
		Calendar c = Calendar.getInstance();
		
		long today = c.getTimeInMillis();
		System.out.println(today);
		
		c.set(1992, 8, 22);
		long bd = c.getTimeInMillis();
		System.out.println(bd);
		
		long result = today - bd;
		System.out.println(result);
		
		
		
		
		
		
	}
}
