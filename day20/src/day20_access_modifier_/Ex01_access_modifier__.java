package day20_access_modifier_;

import day20_access_modifier.Ex00_Parents;	// 패키지가 다르면 접근 가능해도 import는 해와야 한다. 

class Child extends Ex00_Parents {
	Child() {
		super.cosmetic = "앰플";
		
		// Ex00_Parents 의 상속을 받은 Child 클래스 이기 때문에
		// protected 처리 된 필드인 cosmetic 에 접근이 가능했다.
		}
}

public class Ex01_access_modifier__ {				// 파일 이름과 같은 클래스만 public 을 붙일 수 있다.
	public static void main(String[] args) {
		
		Ex00_Parents ep = new Ex00_Parents();
		
		ep.name = "로키";
		
//		private String wallet;		// 클래스 Parents 내부에서만 접근 가능
//		String album;				// 아무것도 안 쓴 건 default 접근 : day20_access_modifier 패키지 내부에서만 접근 가능
//		protected String cosmetic;	// 같은 패키지 내부 혹은 다른 패키지에 있는 자식 클래스에서만 접근 가능
//		public String name;
		
		// 위 3가지는 클래스 혹은 같은 패키지 내에서만 사용 가능하고 (protected 는 상속관계면 다른 패키지도 가능)
		// 가장 아래 public 은 어디서나 가능하기 때문에 import 를 해오면 name 필드는 사용가능
		
		
		
	}
}
