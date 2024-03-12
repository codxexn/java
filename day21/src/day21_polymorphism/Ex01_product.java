package day21_polymorphism;

// super
class Product {
	
	// Method
	public void info() {
		System.out.println("product");
	}
}

// sub
class Computer extends Product {

	// Method override : 부모의 메소드를 자식이 똑같은 형태에서 값만 다르게 넣는 것 (덮어쓰기)
	@Override
	public void info() {
		System.out.println("Computer");
	}
}

// sub-2
class TV extends Product {

	@Override
	public void info() {
		System.out.println("TV");
	}
}


public class Ex01_product {
	public static void main(String[] args) {
		
		// 여기는 매장이다.
		// Computer 10대, TV 5대
		Computer[] computers = new Computer[10];
		TV[] tvs = new TV[5];
		
		// 만약 100개의 제품을 관리하기 위해서 100개의 배열을 관리하는 것은 어렵다. (귀찮다..)
		
		// 해결책 "업캐스팅"을 활용한다.
		// 부모(product) 타입은 자식(Computer, TV)을 저장할 수 있다.(자동 타입 변환)
		Product[] products = new Product[15];
		
		products[0] = new Computer();	// 업캐스팅 : 자식이 부모의 것으로 우겨져서 들어갔다. 부모와 공유된 것만 쓸 수 있게 됨
		products[1] = new TV();
		
		for(Product product : products) {
			if (product != null) product.info();	// 같은 코드로 다른 동작을 한 것(다형성)
													// 저장이 된 애들로 같은 동작을 하고 싶으면
													// 메소드 오버라이드 하면 된다.
			
		}
		
// 접근지시자, 상속은 이해를 무조건 해야 한다.		
		
	}
}
