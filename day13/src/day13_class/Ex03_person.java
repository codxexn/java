package day13_class;

// 데이터 클래스 Person
class Person {
	// Field
	char gender;
	int age;
	double height;
	String name;
	boolean isAdult;
}

// public : java2 에서 다룸
// 한 자바파일에 클래스가 2개 이상인 경우
// 자바 파일의 이름과 같은 이름의 클래스가 public 처리가 된다.

// 메인 클래스 Ex03_person
public class Ex03_person {
	public static void main(String[] args) {
		
		// 필드를 생성해주고 값을 넣어주지 않았을 때 자동 초기화 된 상태
		
		Person p = new Person();
		
		System.out.println("성별 : " + p.gender);
		System.out.println("나이 : " + p.age);
		System.out.println("키 : " + p.height);
		System.out.println("이름 : " + p.name);
		System.out.println("성인유무 : " + p.isAdult);
		
	}
}
