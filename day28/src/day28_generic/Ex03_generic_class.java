package day28_generic;

class Marine {
	public void shoot() {
		System.out.println("탕탕탕");
	}
}

class Tank {
	public void shoot() {
		System.out.println("펑");
	}
}

// generic class Bunker
class Bunker<T> {
	private T[] arr;
	private int index;
	private int arrlength;
	
	public Bunker(int count) {
//		arr = new T[count];		// 제네릭 타입으로 배열의 생성은 불가능하다. (선언만 가능)
		arr = (T[])(new Marine[count]);
		arrlength = count;
	}
	
	public void add(T obj) {
		if(index == arrlength) {
			return;
		} else arr[index++] = obj;
	}
}


public class Ex03_generic_class {
	public static void main(String[] args) {
		Bunker<Marine> bunker = new Bunker<>(3);
		
		bunker.add(new Marine());
		bunker.add(new Marine());
		bunker.add(new Marine());
	}
}
