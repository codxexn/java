package day22_abstract;					// 다형성을 사용하기 위한 틀을 만들기 위해서 추상 클래스, 추상 메소드를 만든다.
										// 다형성을 사용하기 위한 메소드를 만들기 위해서 값을 넣지 않아도 되는 틀이 필요했다.
										// 오버라이드 하지 않으면 에러가 뜨기 때문에
										// 강제성을 가짐으로 인해서 누락과 같은 실수를 방지한다.

// super
abstract class Product {				// 2. 클래스 앞에 abstract 를 붙여준다.
	// Method
	abstract public void info();		// 1. 본문이 없는 추상 메소드를 추가 하면 
}


// sub									// 3. 추상 클래스의 추상 메소드는 "반드시" 오버라이드 해야 한다.
class Computer extends Product {

	// Method
	@Override							// super 메소드 틀만 있고 내용이 없기 때문에 상속 받아서 기능을 쓰려면 오버라이드! 
	public void info() {
		System.out.println("Computer");
	}
}

// sub2
class TV extends Product {

	// Method
	@Override
	public void info() {
		System.out.println("TV");
	}
}


public class Ex01_Product {
	public static void main(String[] args) {
//		Product p = new Product();		메뉴얼에 전혀 내용이 없기 때문에 구체화할 기능이 없다.
		
		// 여기는 매장이다.
		// Computer 10대, TV 5대
		Computer[] computers = new Computer[10];
		TV[] tvs = new TV[5];
		
		// 만약 100개의 제품을 관리하기 위해서 100개의 배열을 관리하는 것은 어렵다. (귀찮다..)
		
		// 해결책 "업캐스팅"을 활용한다.
		// 부모(product) 타입은 자식(Computer, TV)을 저장할 수 있다.(자동 타입 변환)
		Product[] products = new Product[15];			// 엥.. 근데 product 는 new 못한다며.. 배열은 가능?
		
		products[0] = new Computer();	// 업캐스팅 : 자식이 부모의 것으로 우겨져서 들어갔다. 부모와 공유된 것만 쓸 수 있게 됨
		products[1] = new TV();
		
		for(Product product : products) {
			if (product != null) product.info();	
		}
		
	}
}
