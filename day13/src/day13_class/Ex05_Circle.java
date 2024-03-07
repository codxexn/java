package day13_class;

// data class
class Circle {

	// Field
	double radius;
	String name;
	
	// Method
	void setCircle(String n, double r) {	
		// 매개변수 : 사용자가 입력하는 대로 값을 차례로 저장해주고 그 값을 만들어준 필드에 넣어준다.
		name = n;
		radius = r;
	}
	
	double calcArea() {
		// 크기를 반환 : 더블타입을 반환하겠다.
		return Math.PI * Math.pow(radius, 2);	// Math 객체 안에 pow 기능(값을 제곱해줌)
												// radius 안의 값을 제곱해서 파이를 곱해준 값을
												// 더블 타입으로 반환!
	}
	
	void PrintCircle() {
		System.out.println("이름 : " + name);
		System.out.println("반지름 : " + radius);
		System.out.println("넓이 : " + calcArea());	// 메소드 결과값을 메소드 호출부로 반환
	}
	
	
}


public class Ex05_Circle {
	public static void main(String[] args) {
		
		Circle c = new Circle();
		
		c.setCircle("맨홀", 15.5);
		// name 에 맨홀을 넣어주고 radius 에 15.5 를 넣어준 상태이다.
		
		c.PrintCircle();
		// name 에 있는 값, radius 에 있는 값, calcArea() 라는 메소드에 저장된 식으로 연산한 값을 불러와서 출력
		// return 이 있기 때문에 연산한 값을 다시 불러올 수 있는 것
		// return 을 써주지 않으면 우리가 호출한 부분으로 값을 다시 돌려주지 않는다.
		
		
	}
}
