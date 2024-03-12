package day22_polymorphism;

// super class
class Shape {		// override를 활용하기 위한 틀
	
	// Method
	public double calcArea() {
		return 0;
	}
	
	public String getName() {
		return "도형";
	}
}

// sub - 1
class Rect extends Shape {
	// Field
	private int width;
	private int height;
	
	// Constructor
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}

	// Method
	@Override
	public double calcArea() {
		return width * height;
	}

	@Override
	public String getName() {
		return "사각형";
	}
}
	
// sub - 2
class Circle extends Shape {
	// Field
	private double radius;
	
	// Constructor
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calcArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String getName() {
		return "원";
	}
}

//sub -3
class Triangle extends Shape{
	// Field
	private int width;
	private int height;
	
	// Constructor
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double calcArea() {
		return (width * height) / 2.0;
	}

	@Override
	public String getName() {
		return "삼각형";
	}
}
	


public class Ex02_Shape {
	public static void main(String[] args) {
		
		// Rect, Circle, Triangle 을 모두 저장할 수 있는 타입은 Shape 이다.
		Shape[] shapeList = new Shape[3];
		
		// upcasting
		shapeList[0] = new Rect(2, 1);
		shapeList[1] = new Circle(1.5);
		shapeList[2] = new Triangle(3, 5);
		
		for (int i = 0; i < shapeList.length; i++) {
			System.out.println(shapeList[i].getName());
		}
		
		
		// 다형성 확인
		for (Shape shape : shapeList) {
			System.out.println(shape.getName() + "의 크기 : " + shape.calcArea());
		}
	}
}
