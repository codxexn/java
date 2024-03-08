package day17_this;

class Circle {
	
	// Field
	int xPos;
	int yPos;
	double radius;
	
	// Constructor
	Circle() {
		this(0, 0, 1);			// Circle(); 라는 생성자를 만들면
	}							// 아래 3개 매개 변수를 만들면서 생성되는 생성자를 만들어주는데
								// 값은 0, 0, 1 을 넣어서 생성된다.
	Circle(double radius) {		// Circle(실수값); 을 만들면 자동으로
		this(0, 0, radius);		// xPos 0, yPos 0, radius 실수값 이 들어간 생성자를
	}							// 만들어준다.
	
	Circle(int xPos, int yPos, double radius) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.radius = radius;
	}
	
	// Method
	double calcArea() {			// 이 메소드를 사용하면 아래 식을 계산해서 calcArea 에 그 값을 넣어준다.
		return Math.PI * Math.pow(radius, 2);
	}
	
	void printCircle() {
		System.out.println("중심좌표 [" + xPos + ", " + yPos + "]");
		System.out.println("반지름 : " + radius);
		System.out.println("크기 : " + calcArea());
		System.out.println("----------------------");
		
	}
}
public class Ex03_Circle {
	public static void main(String[] args) {
		
		Circle circle1 = new Circle();
		Circle circle2 = new Circle(1.5);
		Circle circle3 = new Circle(2, 3, 1.5);
		
		circle1.printCircle();
		circle2.printCircle();
		circle3.printCircle();
		
		
		
		
		
		
	}
}
