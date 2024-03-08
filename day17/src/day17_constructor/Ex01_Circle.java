package day17_constructor;

class Circle {
	
	// Field
	int x;
	int y;
	double radius;
	
	// Constructor
	Circle() {
		radius = 1;
		
	}
	Circle(double _radius) {
		radius = _radius;
	}
	Circle(int _x, int _y, double _radius) {	// 필드 초기화의 용도로 많이 사용한다.
		x = _x;
		y = _y;
		radius = _radius;
	}
	
	// Method
	double area() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	void printCircle() {
		System.out.println("중심좌표 [" + x + ", " + y + "]");
		System.out.println("반지름 : " + radius);
		System.out.println("크기 : " + area());
		System.out.println("-------------------");
	}
}
public class Ex01_Circle {
	public static void main(String[] args) {
		
		Circle circle1 = new Circle();	// 중심좌표는 [0,0], 반지름 1
		Circle circle2 = new Circle(1.5);	// 중심좌표는 [0,0], 반지름 1.5
		Circle circle3 = new Circle(1, 2, 1.5);	// 중심좌표는 [1,2], 반지름 1.5
		
		circle1.printCircle();
		circle2.printCircle();
		circle3.printCircle();
		
		
		
	}
}
