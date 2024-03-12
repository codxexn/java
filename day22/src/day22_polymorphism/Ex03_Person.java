package day22_polymorphism;

// super class
class Person {
	// Method
	public void eat (String food) {
		System.out.println(food + " 먹는다.");
	}
	public void sleep() {
		System.out.println("잔다.");
	}
	public void goToToilet() {
		System.out.println("볼일을 본다.");
	}
}

// sub - 1
class Student extends Person {
	// Method
	// Student 만 가지고 있는 메소드 study
	public void study() {
		System.out.println("공부한다.");
	}
}
	
// sub - 2
class Worker extends Person {
	// Method
	// Worker 만 가지고 있는 메소드 work
	public void work() {
		System.out.println("일한다.");
	}
}


public class Ex03_Person {
	public static void main(String[] args) {
		
	Person p1 = new Student();		// 업캐스팅
	p1.eat("밥");
	p1.sleep();
	p1.goToToilet();
//	p1.study();						// 학생만 가지고 있는 메소드라 업캐스팅 상태에서는 쓸 수 없다. (호출 불가능)
									// Person 타입이므로 Person method 만 호출 가능
	
	// 부모타입 -> 자식 타입 : 다운캐스팅, 강제 형변환으로 진행
	// 자식 (Student) 만 가지고 있는 메소드 호출이 필요한 경우
	// ((자식클래스명)부모 타입으로 만든 객체명).메소드명();
	
	((Student)p1).study();
	
	
	Person p2 = new Worker();
	p2.eat("술");
	((Worker)p2).work();
	
	
	// 잘못된 다운캐스팅	->	ClassCastExeption 발생
	// 개발자의 실수
	Person p3 = new Student();
//	((Worker)p3).work();
	
	// 예외발생을 회피하기 위해 확인 후 캐스팅을 처리한다.
	// p3이 Worker 타입이면 캐스팅하라. 
	if(p3 instanceof Worker) ((Worker)p3).work();
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
