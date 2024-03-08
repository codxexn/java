package day19_inheritance;

// 상속관계의 대표적인 상황
// IS-A 관계
// ex) 전기차는 자동차이다. (EV(child) is a Car(parents))

// super class
class Car {
	//Method
	void drive() {
		System.out.println("차가 달린다.");
	}
}

//sub class
class EV extends Car {
	// Method (EV만의 기능)
	void charging() {
		System.out.println("전기를 충전한다.");
	}
}

public class Ex02_inheritance {
	public static void main(String[] args) {
		
		EV car = new EV();
		
		car.drive();
		car.charging();
		
		Car car2 = new Car();
		
		car2.drive();
		//car2.charging();		부모는 자식의 기능을 사용할 수 없다.
		
	}
}
