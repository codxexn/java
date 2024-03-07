package day13_class;

// 데이터 클래스 : 설계도를 만든 것
class Book{
	// Field
	String title;
	String writer;
	int price;
	boolean isBestSeller;
}

// 메인 클래스 : 메인 메소드가 있는 것
// 읽는 건 모든 것을 다 하지만, 메인 클래스 안에 있는 것만 실행(동작)한다.
public class Ex02_book {
	public static void main(String[] args) {
		
		//	1. Book 클래스를 이용한 book 객체 생성
		Book book = new Book();
		
		//	2. Book 객체의 필드값 저장
		book.title = "멘토씨리즈 자바";
		book.writer = "코리아교육그룹 교육연구소";
		book.price = 25000;
		book.isBestSeller = true;
		
		//	3. 출력
		System.out.println("제목 : " + book.title);
		System.out.println("저자 : " + book.writer);
		System.out.println("가격 : " + book.price + "원");
		System.out.println(book.isBestSeller ? "베스트셀러" : "일반서적");
		
}
}
