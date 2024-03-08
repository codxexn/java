package day19_inheritance;

// super class
class Parents {
	// Field
	int parentsNum;
	
	// Method
	void parentMethod() {
		System.out.println("parentMethod()를 호출한다.");
	}
}

// sub class : 부모클래스를 extends 한다.
class Child extends Parents {
	// Field
	int childNum;
		
	// Method
	void childMethod() {
		System.out.println("childMethod()를 호출한다.");
	}

	@Override		// child.부모메소드 사용시 다른 게 나온다.
	void parentMethod() {
		System.out.println("엄마, 아빠한테 이를 거야!");
	}
	
}

public class Ex01_Person {
	public static void main(String[] args) {
		
	// 상속 확인은 "자식클래스"를 생성 및 사용한다.
	
	Parents parents = new Parents();
	Child child = new Child();
	
	// 필드 사용
	child.parentsNum = 100;
	child.childNum = 10;
	
	System.out.println(child.parentsNum);
	System.out.println(child.childNum);
	
	// 메소드 사용
	parents.parentMethod();
	child.parentMethod();
	child.childMethod();
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
