package day21_access_modifier;

// 정보 은닉 : Field는 private 하여 다른 클래스에서는 메소드를 거쳐 필드를 사용할 수 있게 함
// Getters and Setters : alt + shift + s

class Book{

	// Field : 일단 지금은 같은 클래스가 아니면 이 필드에는 접근을 할 수 없는 상황
	private String title;
	private String writer;
	private int price;
	private int salesVolume;
	private boolean isBestSeller;
	
	// Method
	
	// setter : 필드에 데이터 저장
	// set필드명이라는 메소드를 써서 () 안에 값을 넣어주면 this 가 가르키는 클래스의 그 필드 안에 값을 넣어준다.
	// 원래는 접근할 수 없는 필드인데 메소드를 써서 넣어줄 수 있게 되는 것이다.
	public void setTitle(String title) {
		this.title = title;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public void setprice(int price) {
		this.price = price;
	}
	public void setsalesVolume(int salesVolume) {
		this.salesVolume = salesVolume;
		if(salesVolume >= 1000) {
			this.isBestSeller = true;
		}
}
	// getter : 필드의 값을 확인
	public String getTitle() {
		return title;
	}
	public String getWriter() {
		return writer;
	}
	public int getPrice() {
		return price;
	}
	public int getSalesVolume() {
		return salesVolume;
	}
	public boolean isBestSeller() {
		return isBestSeller;
	}
}

public class Ex03_Book {
	public static void main(String[] args) {
		
		Book book = new Book();
		
		// book 객체의 필드값에 저장을 위한 메소드를 호출한다.
		
		// setter
		book.setTitle("콩쥐팥쥐");
		book.setWriter("한국출판사 연구소");
		book.setprice(10000);
		book.setsalesVolume(1000);
		
		// book 객체의 필드값을 확인하기 위한 메소드를 호출한다.
		// 직접적으로 필드에 접근을 해서 그 값을 가지고 올 수 없기 때문에 
		// get필드를 호출해서 그 값을 가지고 와주는 메소드로 값을 가지고 온다.
		
		
		System.out.println("제목 : " + book.getTitle());
		System.out.println("저자 : " + book.getWriter());
		System.out.println("가격 : " + book.getPrice() + "원");
		System.out.println("판매량 : " + book.getSalesVolume() + "부");
		System.out.println(book.isBestSeller() ? "베스트셀러" : "일반서적");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
