package day19_inheritance;

// super class
class Father {
	// constructor
	Father() {
		System.out.println("아버지께서 태어나셨다.");
	}
}
// sub class
class Son extends Father {	// 이렇게 함으로 인해서 저 위에 내용들이 다 들어오는 것
	// constructor
	Son() {
		// Father() 생성자의 호출이 "자동"으로 "먼저" 진행된다.
		
		super();			//	수동으로 호출해야 할 때 사용하는 호출법
		// super();	: 부모 클래스를 의미
		// 1. super.멤버 : super.필드	super.메소드()
		// 2. super() 	: 부모클래스의 생성자 호출
		
		System.out.println("아들이 태어났다.");
	}
}

// 자식클래스의 생성자는 부모클래스의 생성자를 먼저 호출한다.
// 자식이 만들어지려면 부모가 반드시 먼저 만들어져야 한다.

public class Ex03_constructor {
	public static void main(String[] args) {

		
	}
}
