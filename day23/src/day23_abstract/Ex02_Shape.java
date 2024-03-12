package day23_abstract;

abstract class Shape {
	// Method
	abstract public double calcArea();
	abstract public String getName();
}


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
	
class Circle extends Shape {
	// Field
	private double radius;
	
	// Constructor
	public Circle (double radius) {
		this.radius = radius;
	}
	
	// Method
	@Override
	public double calcArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	@Override
	public String getName() {
		return "원";
	}
}
	
class Triangle extends Shape {
	// Field
	private int width;
	private int height;
	
	// Constructor
	Triangle (int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	// Method
	@Override
	public double calcArea() {
		return width * height / 2.0;
	}
	
	@Override
	public String getName() {
		return "삼각형";
	}
}



public class Ex02_Shape {
	public static void main(String[] args) {
		
		Shape[] shapeList = new Shape[3];
		
		// 업캐스팅
		shapeList[0] = new Rect(2, 1);
		shapeList[1] = new Circle(1.5);
		shapeList[2] = new Triangle(3, 2);
		
		// 다형성 확인
		for (Shape shape : shapeList) {
			System.out.println(shape.getName() + "의 크기 : " + shape.calcArea());
		}
		
	}
}
