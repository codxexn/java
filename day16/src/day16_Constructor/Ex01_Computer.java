package day16_Constructor;

class Computer{
	
	//Field
	String model;
	String manufacturer;
	int price;
	
	// Constructor : 메소드를 만들기 전에 생성자에서 수행할 코드를 가미해줌
	Computer(String _model, String _manufacturer, int _price){
		System.out.println("Computer 객체가 생성되었다.");
		model = _model;
		manufacturer = _manufacturer;
		price = _price;
	}
	
	// Method
	void printComputer() {
		System.out.println("모델 : " + model);
		System.out.println("제조사 : " + manufacturer);
		System.out.println("가격 : " + price);
	}
	
}

public class Ex01_Computer {
	public static void main(String[] args) {
		
		
		// Computer 클래스를 이용한 myCom 객체 생성
		Computer myCom = new Computer("Gram", "LG", 200);
		
		// 객체가 생성이 되는 순간
		// "Computer 객체가 생성되었다." 가 출력이 되며
		// 객체 () 안에 3가지 값을 넣어줘야 객체 생성이 완료된다.
		// 객체가 만들어짐과 동시에 필드값에는 () 안에 넣어준 3가지 값이 들어가게 된다.
		// 메인 클래스에서 메소드만 사용해주면 끝
		
		myCom.printComputer();
		
	}
}
