package day16_Constructor;

class Book {
	
	// Field
	String title;
	String writer;
	int price;
	int salesVolume;		// 판매량
	boolean isBestSeller;	// 판매량이 1000 이상이면 true
	
	// Constructor : 생성과 동시에 하고 싶은 애들을 작성(생성과 동시에 사용자에게 값을 받아서 바로 사용, 일회성, 객체 만들때만 값 받기 가능)
	Book(String _title, int _price){
		title = _title;
		price = _price;
		writer = "작자미상";
	}
	
	Book(String _title, String _writer, int _price){
		title = _title;
		writer = _writer;
		price = _price;
	}
	
	// Method : 객체를 만들고 메소드를 호출하는 것 (호출하고 싶을 때, 다회성)
	void setSalesVolume(int _salesVolume) {
		salesVolume = _salesVolume;
		isBestSeller = salesVolume >= 1000;
	}
	
	void printBook( ) {
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + writer);
		System.out.println("가격 : " + price);
		System.out.println("판매량 : " + salesVolume);
		System.out.println(isBestSeller ? "베스트셀러" : "일반서적");
	}
	
}
public class Ex02_Book {
	public static void main(String[] args) {
		
		Book book1 = new Book("콩쥐팥쥐", 10000);
		Book book2 = new Book("자바마스터", "마스터", 30000);	// 객체 생성하는 동시에 생성자에 일회성으로 값을 넣어주는 것, 불변
		
		book1.setSalesVolume(2000);		// 시간이 지나야 알 수 있는 것은 메소드를 이용해서 매번 바꿔줄 수 있는 방법으로 진행
		book2.setSalesVolume(500);
		
		book1.printBook();
		book2.printBook();
		
	}
}
