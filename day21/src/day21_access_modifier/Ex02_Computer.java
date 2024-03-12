package day21_access_modifier;

class Computer {
	// Field(private 처리)
	private String model;
	private int price;
	
	// Constructor (public 처리)
	public Computer(String model, int price) {
		this.model = model;
		this.price = price;
	}
	
	// Method
	public void printComputer() {
		System.out.println("모델 : " + model);
		System.out.println("가격 : " + price);
		
	}
}

public class Ex02_Computer {
	public static void main(String[] args) {
		
		// Computer 클래스의 외부이기 때문에
		// Private 필드 접근 불가능
		// public 메소드(생성자 포함)만 접근 가능
		
		Computer myCom = new Computer("GRAM", 200);
		myCom.printComputer();	// Method가 public 이기 때문에 메인에서 접근 가능
								// Method 가 Field 에 접근하는 거기 때문에 간접접근이 가능한 것
		
		// private 필드 직접 접근은 제한된다.
//		myCom.model = "SENS";
//		myCom.price = 300;
		
	}
}
