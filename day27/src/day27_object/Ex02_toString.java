package day27_object;

// toString() : 객체(인스턴스)를 String으로 변환하는 메소드

// 데이터클래스
class Person {
	
	// Field
	private String name;
	private int age;
	
	// Constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// Method
	public void printPerson() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}

public class Ex02_toString {
	public static void main(String[] args) {
		
		Person p = new Person("앨리스", 25);
		
		String message = p.toString();
		
		System.out.println("객체 p의 String 변환 : " + message);
		// toString()의 기본 동작(Object 클래스의 toString()에 정의된 내용)
		// day27_object.Person@6f2b958e
		// getClass().getName()	@ hashCode()
		// 클래스 이름				@ 객체의 주소(참조)
		
		p.printPerson();
		
		// 다음과 같이 객체 정보를 확인하고자 한다면,
		// 어떤 작업이 필요할까?
		// toString() 으로 오버라이드 해주면 된다.
		
		System.out.println(p);	
		// System.out.println(p.toString()); : 객체를 프린트 하면 바로 주소값을 프린트해준다.
		
		/* StringBuffer를 String으로 변환하는 이유는
		 * Object에 있는 equals(주소값 비교) 말고 
		 * String에 있는 equals(값 동등 비교)를 사용하기 위해서이다.
		 * = 문자열 값이 같냐, 아니냐를 알고 싶으면 String의 equals를 사용해야 한다.
		 * 
		 * StringBuffer는 Object 의 equals 를 오버라이드 하지 않았기 때문에
		 * equals 를 사용하면 Object 의 equals(주소값 비교) 를 그대로 사용하게 된다.
		 * 
		 * 하지만 String의 equals는 Object에 있는 equals를 오버라이드 한 것이다. (값 비교로)
		 * 따라서 값 비교를 하고 싶다면 StringBuffer를 String으로 변환해줘야 한다.
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
