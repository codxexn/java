package day27_object;

class Rect {
	private int width;
	private int height;
	
	public Rect (int width, int height) {
		this.width = width;
		this.height = height;
	}

	// Method
	// 두 사각형의 동등 비교조건
	// 1. 너비 == 너비 and 높이 == 높이
	// 2. 너비 == 높이 and 높이 == 너비
	
	@Override
	public boolean equals(Object anObj) {
		if(this == anObj) {
			return true;
		}
		if(anObj instanceof Rect) { 			// 객체명.equals(비교객체명) 메소드에서 () 안의 객체가 Rect 클래스 객체라면
			Rect obj = (Rect)anObj;				// Rect 타입으로 obj 공간을 만들어서 anObj를 Rect로 강제 형변환해서 저장
			
												// 근데 if 에서 anObj 가 Rect 타입 객체라면 아래의 것을 실행하라고 했는데
												// 왜 anObj을 (Rect)로 강제 형변환을 해서 obj에 넣어주는 거지?
			
			if(width == obj.width && height == obj.height) {
				return true;
			} else if(width == obj.height && height == obj.width) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		String message = "가로 : " + width + ", 세로 : " + height;
		return message;
	}
}

public class Ex05_equals_override {
	public static void main(String[] args) {
		
		Rect nemo1 = new Rect(2, 3);
		Rect nemo2 = new Rect(2, 3);
		
		System.out.println(nemo1);
		System.out.println(nemo2);
		
		if(nemo1.equals(nemo2)) {
			System.out.println("같은 모양의 사각형이다.");
		} else {
			System.out.println("다른 모양의 사각형이다.");
		}	
		
	}
}
