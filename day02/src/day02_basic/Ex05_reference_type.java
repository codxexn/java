package day02_basic;

public class Ex05_reference_type {
	public static void main(String[] args) {
		
		/*
		 * 참조 자료형 (reference type) - 대문자로 시작
		 * - 값이 저장된 주소(참조)를 저장한다.
		 * - 기본 자료형이 아닌 모든 자료형은 참조 자료형이다.
		 * 
		 * 	1. 문자열
		 * 		1) string
		 * 			(1) 문자열이 저장된 참조(주소)값을 저장한다. 
		 * 				- 값 자체가 아니라 값이 저장된 메모리 내의 주소값을 저장한다.
		 * 			(2) 기본 자료형처럼 선언해서 초기화 할 수 있다. (최초 값 세팅 = 초기화)
		 * 				- Java 는 공간확보를 하면 자동으로 초기화 해줌
		 * 			(3) 사용방법
		 * 				- String str1 = "Hello";	// 마치 기본 자료형처럼 사용
		 * 				- String str2 = new String("Hello");	// 실제 대부분의 참조 자료형
		 * 			(4) 참조 자료형의 초기화는 일반적으로 null 값이다.
		 * 			
		 */
		
		 String str1 = "Hello";
		 String str2 = new String("Hello");
		 String str3 = null;	// 0번지(아무 것도 가리키고 있지 않다.) 아무 것도 없는 값, 빈 공간
		 
		  /*
		   * 참조 자료형은 데이터를 저장하는 방식이 다르다.
		   * Hello 라는 문자열은 메모리에 실질적으로 어떠한 공간에 저장되어 있고
		   * srt1 이라는 곳에는 진짜 Hello 라는 문자열이 저장된 공간의 주소값이 저장돼 있다.
		   * 주소값을 담고 있게 되면 우리가 그 주소를 가리키고 있다고도 얘기하게 되는데
		   * (C언어 에서는 pointer 라는 개념이 익숙)
		   * null은 아무 것도 가리키지 않은 상태이다. 그것이 null값.
		   */
		 
		 System.out.println(str1);
		 System.out.println(str2);
		 System.out.println(str3);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}
