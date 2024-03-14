package day27_generic;

class LegacyOmniBox {
	private Object a;
	
	public LegacyOmniBox(Object a) {
		this.a = a;
	}
	
	public Object getA() {
		return a;
	}
	
	public void setA(Object a) {
		this.a = a;
	}
}

// 담을 물건
class Computer{}
class SmartPhone{}

public class Ex01_LecacyOmniBox {
	public static void main(String[] args) {
		
		LegacyOmniBox box = new LegacyOmniBox(new Computer());
		Computer myCom = (Computer)box.getA();
		System.out.println(myCom);
		
		box.setA(new SmartPhone());
		SmartPhone myPhone = (SmartPhone) box.getA();
		System.out.println(myPhone);
		
		// 잘못된 캐스팅
		box.setA(new Computer());
		SmartPhone yourPhone = (SmartPhone) box.getA();
		System.out.println(yourPhone);
		
		// Object 를 이용해서 저장하면 항상 캐스팅을 해야 하는데,
		// 실수로 캐스팅으로 잘못해도 "자바는 모른다. (오류가 체크되지 않는다.)"
		
	}
}
