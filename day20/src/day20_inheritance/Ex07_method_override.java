package day20_inheritance;

// super class
class Pizza {
	// Field
	String dough;
	int cheese;
	
	// Constructor
	Pizza(String dough, int cheese) {
		this.dough = dough;
		this.cheese = cheese;
	}
	
	// Method
	void printPizza() {
		System.out.println("도우: " + dough);
		System.out.println("치즈함량 : " + cheese + "g");
	}
}

// sub class
class BulgogiPizza extends Pizza {
	// Field 
	String bulgogi;
	
	// Constructor
	BulgogiPizza(String bulgogi, String dough, int cheese) {
		super(dough, cheese);
		this.bulgogi = bulgogi;
	}
	
	// Method
	@Override
	void printPizza() {
		super.printPizza();
		System.out.println("불고기 원산지 : " + bulgogi);
	}
}


public class Ex07_method_override {
	public static void main(String[] args) {
		
		BulgogiPizza bp = new BulgogiPizza("뉴질랜드", "씬", 100);
		bp.printPizza();
	}
	
}
