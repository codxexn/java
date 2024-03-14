package day28_generic;

// 무엇이든 담을 수 있는 GenericOmniBox

// T : 어떤 타입(자료형) -> 생성자가 GenericOmniBox<전달할 타입>() 형태가 된다.

class GenericOmniBox <T> {

	// Field
	private T obj;
	
	// Method
	public void setObj(T obj) {
		this.obj = obj;
	}
	
	public T getObj() {
		return obj;
	}
}

// 담을 물건
class Ballpen{}
class Eraser{}


public class Ex02_GenericOmniBox {
	public static void main(String[] args) {
		
		// GenericOmniBox 의 생성
		// 어떤 타입을 저장할 것인지 명시해야만 한다.
		
		GenericOmniBox<String> box = new GenericOmniBox();
		
		// 정상 처리
		box.setObj("자바");
		String obj = box.getObj();
		System.out.println(obj);
		
		// 비정상 처리
		// box.setObj(10);			// int X
		// Generic 사용하지 않고 Object 로 사용하면 타입에 대한 오류를 찾아낼 수 없다.
		
		// 정상 처리
		GenericOmniBox<Ballpen> penBox = new GenericOmniBox<>();
		penBox.setObj(new Ballpen());
		Ballpen pen = penBox.getObj();
		System.out.println(pen);
		
		// BallPen pen = new BallPen(); 이렇게 바로 생성해주면 안되는 건가????????
		
		GenericOmniBox<Eraser> eraserBox = new GenericOmniBox<>();
//		eraserBox.setObj(new Ballpen());		// LegacyOmniBox 에서는 가능한 작업 (오류지만 찾아내지 못했던)
//		Ballpen pen2 = eraserBox.getObj();		// LegacyOmniBox 에서는 가능한 작업 (오류지만 찾아내지 못했던)
		
		
		
		
		
		
	}
}
