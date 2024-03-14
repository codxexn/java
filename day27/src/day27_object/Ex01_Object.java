package day27_object;

class Computer {
	
	// Field
	private String model;
	private int price;
	
	// Constructor
	public Computer(String model, int price) {
		this.model = model;
		this.price = price;
	}
	
	// Method
	public void printComputer() {
		System.out.println("모델명 : " + model);
		System.out.println("가격 : " + price);
	}
}


public class Ex01_Object {
	public static void main(String[] args) {
		
		
		// Object : 모든 클래스의 부모
		
		// Object 타입 : 모든 객체(변수)를 저장할 수 있는 타입
		// day21_polymorphism(Ex01_product), 다형성-개요의 업캐스팅 확인.
		// 자식클래스가 가진 것이 더 많고, 부모클래스에 우겨져서 들어갔기 때문에
		// 다운캐스팅을 따로 하지 않으면 부모와 공유된 것만 사용할 수 있다.
		
		// 뭐가 들어올지 확실치 않을 때(특정할 수 없을 때)
		// 로직이 뭐든 받겠다고 결정이 됐을 때 Object 로 명시
		// 에러가 날 수 있는 확률도 많아진다.
		
		
		Object obj = new Object();
	 
		// 1. 변수 저장
		obj = 10;
		System.out.println(obj);
		
		obj = 1.5;
		System.out.println(obj);
		
		// 2. 객체 저장
		Computer myCom = new Computer("Gram", 200);
		myCom.printComputer();
		
		Object yourCom = new Computer("SENS", 200);	
		// yourCom의 view는 Object(Object의 메소드만 호출할 수 있다.)
		// 자식 타입인 Computer의 메소드를 호출하려면, 자식 타입으로 형변환(다운캐스팅) 이 필요하다.
		((Computer)yourCom).printComputer();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
