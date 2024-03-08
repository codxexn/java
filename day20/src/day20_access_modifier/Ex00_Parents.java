package day20_access_modifier;

public class Ex00_Parents {
	private String wallet;		// 클래스 Parents 내부에서만 접근 가능
	String album;				// 아무것도 안 쓴 건 default 접근 : day20_access_modifier 패키지 내부에서만 접근 가능
	protected String cosmetic;	// 같은 패키지 내부 혹은 다른 패키지에 있는 자식 클래스에서만 접근 가능
	public String name;
	
	// 필드에 접근이 가능하려면 클래스는 무조건 접근이 가능해야만 한다. 
	// 집에 들어와야 방에 들어갈 수 있듯, 공유하려면 클래스는 퍼블릭이어야 한다.
}
