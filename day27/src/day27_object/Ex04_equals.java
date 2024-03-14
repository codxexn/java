package day27_object;

class Car{
	private String model;
	private int price;
	
	public Car(String model, int price) {
		this.model = model;
		this.price = price;
	}
}

public class Ex04_equals {
	public static void main(String[] args) {
		
		Car car1 = new Car("bmw", 5000);
		Car car2 = new Car("bmw", 5000);
		
		// Object 클래스의 equals() 메소드의 기본 동작
		// 두 객체(인스턴스)의 참조값(주소값) 비교
		
		if(car1.equals(car2)) {
			System.out.println("같은 차다.");
		} else {
			System.out.println("다른 차다.");
		}
	}
}
