package day12_class;

class Computer {
	
	// 값 == 변수 == 필드 (정의서, 설계도면) _ 값을 넣어줄 공간을 만들어준 것
	String model;	// 객체 안에 생긴 공간(변수)
	String manufacturer;
	int price;
	
}

public class Ex01_computer {
	public static void main(String[] args) {
		
		// 사용자 정의 타입 : Computer
		// 객체 : myCom
		
		// myCom 객체 생성 방법 (정의서, 설계도면 기반으로 만들어준 실체) : 타입 설정
		Computer myCom = new Computer();	// new 로 객체를 만들고 그 객체가 저장된 공간의 이름이 myCom
		
		// myCom 객체의 필드 사용 방법
		// 객체.필드
		
		myCom.model = "GRAM";			// 대입연산자 왼쪽에 있기 때문에 공간으로 쓰인 것
		myCom.manufacturer = "LG";
		myCom.price = 200;
		
		// 확인
		System.out.println("모델 = " + myCom.model);	// 여기서는 값으로 쓰인 것
		System.out.println("제조사 = " + myCom.manufacturer);
		System.out.println("가격 = " + myCom.price + "만원");
		
	}
}
