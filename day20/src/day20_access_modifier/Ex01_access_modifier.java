package day20_access_modifier;

class Parents {					// class 자체가 default 라서 같은 패키지 내에서 다 접근 가능
	
	// Field
	private String wallet;		// 클래스 Parents 내부에서만 접근 가능
	String album;				// 아무것도 안 쓴 건 default 접근 : day20_access_modifier 패키지 내부에서만 접근 가능
	protected String cosmetic;	// 같은 패키지 내부 혹은 다른 패키지에 있는 자식 클래스에서만 접근 가능
	public String name;
}

public class Ex01_access_modifier {
	public static void main(String[] args) {
		Parents parents = new Parents();
		
//		parents.wallet;					// wallet 은 private 처리가 돼서 다른 클래스이기 때문에 접근이 불가능(사용 불가)
		parents.album = "결혼앨범";		// 같은 패키지 내이기 때문에 접근 가능
		parents.cosmetic = "스킨";		// 같은 패키지 + 다른 패키지(자식 클래스)는 접근 가능
		parents.name = "스미스";			// 어디서든 접근 가능
		
	}
	
	
}
