package day27_object;

class Book {
	
	// Field
	private String title;
	private int price;
	
	// Constructor
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}

	// Method
	/* Object 클래스에는 toString() 메소드가 이미 정의되어 있다.
	 * Object(부모)의 메소드를 동일한 형태로 Book(자식)이 다시 만들면(오버라이드)
	 * Book에서 만든 toString()을 사용할 수 있다.
	 */
	
	// Object의 toString()을 오버라이드
	@Override
	public String toString() {
		String message = "제목 : " + title + ", 가격 : " + price + "원";
		return message;
	}
}

public class Ex03_toString_override {
	public static void main(String[] args) {
		
		Book book = new Book("자기관리론", 2000);
		
		System.out.println(book.toString());
		System.out.println(book);	// 객체 이름만 넣어서 출력해줘도 toString() 역할을 해준다.
	}
}
