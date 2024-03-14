package day26_api;

public class Ex02_StringBuffer {
	public static void main(String[] args) {
		
		// 이름에 버퍼가 들어가면 기존의 다른 애들보다 좋다. (메모리 공간 효율적, 속도 향상)
		
		StringBuffer sb = new StringBuffer();
		System.out.println("기본 버퍼 크기 : " + sb.capacity());
		
		sb.append("hello");
		sb.append(" java world!!!!!!!!");
		System.out.println("변경된 버퍼 크기 : " + sb.capacity());
		
		System.out.println(sb);		// 아직 String 이 아니다. 리턴 불가. 버퍼 안에 담긴 데이터일 뿐.
		
		// String 으로 변환
		String str = sb.toString();
		System.out.println(str);	
		
		/*
		 * String getString() {
		 * StringBuffer sb = new StringBuffer();
		 * return sb; -> 스트링 버퍼는 리턴이 안됨 -> return sb.toString();
		 * 
		 * 출력까지는 할 수 있지만 데이터로 무언가 반환을 한다거나.. 그런 걸 못하는 건가?
		 */
		
		
	}
}
