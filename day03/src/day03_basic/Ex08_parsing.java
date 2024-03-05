package day03_basic;

public class Ex08_parsing {
	public static void main(String[] args) {
		
		/*
		 * 문자열 변환 형 변환(casting)이 아니고, 구문 분석(parsing) 이다.
		 * 
		 * 	1. 문자열 -> 정수 (String -> int)
		 * 		String str1 = "100";
		 * 		int a = Integer.parseInt(str1);
		 * 		
		 * 		str1 의 공간에 String type의 "100" 이라는 문자열의 주소값을 저장해줘.
		 * 		그리고 공간 a를 만든 다음
		 * 		str1에 들어있는 String type의 값을 저장할 건데
		 * 		int type으로 저장할 거야. 그러니까
		 * 		Integer 라는 클래스 안에 있는 parseInt 라는 method 를 사용해서
		 * 		str1의 값을 int type 으로 변환한 다음 저장해줘.
		 * 
		 * 
		 * 	Q.	왜 int 를 Integer 로 썼으며, 왜 대문자로 시작하는가?
		 * 	A.	클래스 명이라서 그렇다.
		 * 		변수명 중간에 등장하는 대문자는 띄어쓰기(공백)의 표시로 camel case 규칙을 따른 것이며
		 * 		단어 첫글자가 아닌 중간에 대문자가 사용된다.
		 * 		따라서 첫글자가 대문자인 것은 클래스라고 생각하면 된다.
		 * 		int 와 Integer 는 같은 것이 아니라 약간 상위개념이라고 생각하면 된다.
		 * 		String 을 int로 변환하기에는 int 의 규모(?) 가 작아서
		 * 		String 과 같은 규모인 클래스 중 int 의 변환을 도와줄 method 가 있는 Integer 경로를 불러온 것이다.
		 * 		
		 * 
		 * 	2. 문자열 -> 실수 (String -> double)
		 * 		String str2 = "1.5";
		 * 		double b = Double.parseDouble(str2);
		 * 	
		 * 	3. 문자열 -> 논리 (String -> boolean)
		 * 		String str3 = "true";
		 * 		boolean c = Boolean.parseBoolean(str3);
		 * 		- 문자열이 true 인 경우 true 값을 반환하고 나머지는 다 false 반환
		 * 
		 * 	4. 정수 -> 문자열
		 * 		int d = 100;
		 * 		String str4 = String.valueOf(d);
		 * 		String str4 = "" + d;
		 * 
		 * 	5. 실수 -> 문자열
		 * 		double e = 1.5;
		 * 		String str5 = String.valueOf(e);
		 * 		String srt5 = "" + e;
		 * 
		 */
		
		
		String strAge = "20";
		String strHeight = "180.5";
		
		int age = Integer.parseInt(strAge);
		double height = Double.parseDouble(strHeight);
		
		System.out.println("나이는 " + age + "살이고, 키는 " + height + "cm 이다.");
		System.out.println("내년에는 " + (age + 1) + "살이다.");
		
		
		
		// 혼자 작성해보는 코드
		// 문자열 -> 정수
		String st1 = "40";
		int percent = Integer.parseInt(st1);
		System.out.println(percent + "%");
		
		// 문자열 -> 실수
		String st2 = "12.7";
		double bodyFat = Double.parseDouble(st2);
		System.out.println("당신의 체지방률은 " + bodyFat + "% 입니다.");
		
		// 문자열 -> 논리
		String st3 = "true";
		boolean isyes = Boolean.parseBoolean(st3);
		System.out.println(isyes);
		
		// 정수 -> 문자열(두가지 방법)
		// 1.
		int salary = 100000000;
		String yeah = "" + salary;
		System.out.println("당신의 이번달 월급은 " + yeah + "원 입니다.");
		
		// 2.
		String ohyeah = String.valueOf(salary);
		System.out.println("아싸! " + ohyeah + "원 들어왔당!");
		
		// 실수 -> 문자열
		// 1.
		double cm = 167.7;
		String hope = "" + cm;
		System.out.println("내 키는 " + hope + "cm 야.");
		
		// 2.
		String liar = String.valueOf(cm);
		System.out.println("사실 " + liar + "cm 라는 거 거짓말이야.");
		
		

		
	}
}
