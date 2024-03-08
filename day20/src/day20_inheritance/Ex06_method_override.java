package day20_inheritance;

// super class
class Espresso {
	
	// Field
	String beanOrigin;
	int water;
	
	// Constructor
	Espresso(String beanOrigin, int water) {
		this.beanOrigin = beanOrigin;
		this.water = water;
	}
	
	// Method
	void taste() {
		System.out.println("쓰다.");
	}
}

// sub class
class Latte extends Espresso {
	
	// Field
	int milk;
	
	// Constructor
	Latte(int milk, String beanOrigin, int water) {
		super(beanOrigin, water);
		this.milk = milk;
	}
	
	// Method
	// 오버라이드 하는 메소드는 @Override 에너테이션을 붙이는 것이 좋다.
	@Override
	void taste() {	// Espresso의 taste()를 그대로 사용할 수 없어서 (내용이 다름) "메소드 오버라이드(다시 만들기)"
	System.out.println("부드럽다.");
	}
}


public class Ex06_method_override {
	public static void main(String[] args) {
		
		Espresso[] coffee = new Espresso[2];		// coffee 라는 2칸짜리 배열을 만들었는데
		
		coffee[0] = new Espresso("인도네시아", 50);	// 1번칸에는 Espresso 클래스를
		coffee[1] = new Latte(200, "콜롬비아", 50);	// 2번칸에는 Latte 클래스를 생성해서 넣었다.
		
		for(int i = 0; i < coffee.length; i++) {
			System.out.print("원두 원산지는 " + coffee[i].beanOrigin + ", ");
			coffee[i].taste();
		}
	}
}















