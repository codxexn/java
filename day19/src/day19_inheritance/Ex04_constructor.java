package day19_inheritance;

class Mother {
	// Field
	String motherName;
	
	// Constructor
	Mother(String motherName) {			// 부모클래스에서 매개변수를 받는 생성자를 만들었기 때문에
		this.motherName = motherName;
	}
}

class Daughter extends Mother {			// 자식클래스는 미리 생성될 수 없고 부모클래스가 만들어진 이후에
	// Field
	String daughterName;
	
	Daughter(String daughterName, String motherName) {
		// super();			// 디폴트 호출 : 매개변수가 없는 Mother 생성자일 때
		// super("사만다");	// 해결책 1 (변수로서 역할x)
		super(motherName);	// 해결책 2 -> 일반적 해결
		this.daughterName = daughterName;
	}
}


public class Ex04_constructor {
	public static void main(String[] args) {
		
		Daughter girl = new Daughter("앨리스", "사만다");

		System.out.println("어머니 이름 : " + girl.motherName);
		System.out.println("딸 이름 : " + girl.daughterName);
		
	}
}
