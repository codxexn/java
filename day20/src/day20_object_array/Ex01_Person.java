package day20_object_array;		// 객체를 배열에 담을 수 있다.

class Person{
	// Field
	String name;
	int age;
	
	// Constructor
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// Method
	void printPerson() {
		System.out.println("이름 : " + name + ", 나이 : " + age + "살");
	}
}

public class Ex01_Person {
	public static void main(String[] args) {
		
		// Person 객체 3개를 저장할 수 있는 people 배열 선언
		Person[] people = new Person[3];	// Person 생성자는 호출되지 않는다.
		
		// 3개의 Person이 생성되었습니까? No.
		
		// 아래와 같은 작업을 통해서 3개 Person 을 생성한다.
		String[] name = {"제임스", "앨리스", "데이빗"};		// String 배열을 만들고
		int[] age = {20, 25, 30};						// int 배열을 만든 다음
		
		// 1. 3개의 Person 객체를 생성한 후 배열에 저장
		for(int i = 0; i < people.length; i++) {		// for 문을 통해서 위에 만들어준 people 배열에 순서대로 넣어주면
			people[i] = new Person(name[i], age[i]);	// 각 방에 값이 하나씩 들어감으로서 Person class 가 하나씩 만들어진다.
		}
		
		// 2. 출력
		for(int i = 0; i < people.length; i++) {
			people[i].printPerson();
		}
	}
}





















