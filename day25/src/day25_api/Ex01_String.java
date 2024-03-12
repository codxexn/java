package day25_api;

public class Ex01_String {
	public static void main(String[] args) {
		
		// 1. 문자열 리터럴은 자바에 의해 최적화 가능
		// 같은 문자열을 또 사용하면 기존 문자열을 사용
		String a = "apple";
		String b = "apple";
		System.out.println(a == b ? "apple 1개" : "apple 2개");
		// 똑같은 문자열 공간 하나 더 안 만들고 같은 공간에 있는 같은 주소값을 넣어줌
		
		// 2. new는 언제나 새로운 문자열을 생성 : new를 하면 최적화를 하지 않는다.
		String c = new String("banana");
		String d = new String("banana");
		System.out.println(c == d ? "banana 1개" : "banana 2개");
		
		// 3. equals(), equalsIgnoreCase()
		
		// 4. length()
		
		// 5. charAt()
		
		// 6. indexOf() : 지정한 문자의 인덱스 번호를 반환 ('', "" 둘다 가능)
		String perID = "123456-1234567";
		System.out.println(perID.indexOf('-') + "번째");
		
		// 7. lastIndexOf() : 지정한 문자의 마지막 인덱스 번호를 반환 ('', "" 둘다 가능)
		String today = "2023.05.25";
		System.out.println(today.lastIndexOf("."));
		
		// 8. subString() : 문자열의 일부를 추출
		// 1) subString(시작) : 시작 포함 ~ 종료 포함(종료(끝)까지) 추출
		// 2) subStirng(시작, 종료) : 시작 포함 ~ 종료 불포함(종료 전까지) 추출
		String phone = "010-1234-5678";
		String p1 = phone.substring(0, 3);		// 0, 1, 2번 인덱스 : 시작 + 추출할 글자수
		String p2 = phone.substring(4, 8);
		String p3 = phone.substring(9, 13);
		System.out.println(p1 + ", " + p2 +  ", " + p3);
		
		// 9. replace : 기존 텍스트를 다른 텍스트로 대체
		String str = "hello";
		System.out.println(str.replace("he", "she"));
		
		// 문제
		String fullName = "Ex01_String.java";
		String fileName;
		fileName = fullName.substring(0,fullName.indexOf('.'));
		String extName;
		extName = fullName.substring(fullName.indexOf('.') + 1);
		System.out.println(fileName);
		System.out.println(extName);
		System.out.println(fullName.replace('.', ','));
		System.out.println(fileName + "," + extName);
		
		// 주민번호 2개를 배열에 담고 반복문을 실행하여 뒷 6자리를 "*******" 로 프린트 하시오.
		
		String[] sn = {"111111-1234567", "121212-2345678"};
		
		for (String sn1 : sn) {
			System.out.println(sn1.replace((sn1.substring(sn1.indexOf('-') + 2)), "******"));
		}
		
		
		
		
		
		
		
	}
}
