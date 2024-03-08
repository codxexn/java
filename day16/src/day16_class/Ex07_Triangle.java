package day16_class;

class Triangle{
	
	// Field
	int width;
	int height;
	
	// Method
	void setTriangle(int w, int h) {	// 필드가 아니라 매개변수를 지정(사용자에게 받는 값)
		width = w;
		height = h;
	}
	
	// 오버 로딩 : 메소드 이름이 같고, 매개 변수가 달라야함
	// 메소드 이름과 매개변수가 모두 같으면 오버로딩 할 수 없다.
	// 리턴 타입의 동일 유무는 오버로딩 판단 대상이 아니다.
	
	double calcArea() {
		return (width * height) / 2.0;
	}
	
//	int calcArea() {
//		return (width * height) / 2.0;
//	}
	
	void printTriangle() {
		System.out.println("너비 : " + width);
		System.out.println("높이 : " + height);
		System.out.println("크기 : " + calcArea());
	}
}

public class Ex07_Triangle {
	public static void main(String[] args) {
		
		Triangle semo = new Triangle();
		
		semo.setTriangle(4, 8);
		semo.printTriangle();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
