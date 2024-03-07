package day13_class;

import java.util.Date;

class User{
	
	// Field
	String userId;
	String userPw;
	String userName;
	Date registerDate;
	
	// Method
	// 1. 필드 값을 저장하는 메소드
	void setUser(String id, String pw, String name) {
		// setUser 라는 기능상자를 실행하게 되면 문자열 3개를 받아올 건데
		// 이렇게 세가지를 차례로 받아서 id, pw, name 이라는 공간에 넣어준다.
		userId = id;		// 첫번째 받는 값은 userId 에 저장해주고 (id : 밖에서 받아온 값)
		userPw = pw;		// 두번째 받는 값은 userPw 에 저장해주고
		userName = name;	// 세번째 받는 값은 userName 에 저장해줘
		
		registerDate = new Date();	// reference 타입, 이 객체가 동작할 때의 시스템 시간을 캡쳐해줌
									// 여기서는 setUser 메소드가 동작할 때의 시간
									// F11 을 누를 때마다 새로 실행되기 때문에 콘솔에 뜨는 값이 달라짐
	}
	
	// 2. 필드 값을 출력하는 메소드
	void printUser() {				// 값을 받을 필요가 없기 때문에 매개변수가 필요 없어서 () 비워둠
		System.out.println("아이디 : " + userId);
		System.out.println("비밀번호 : " + userPw);
		System.out.println("이름 : " + userName);
		System.out.println("가입일 : " + registerDate);
	}
	
}


public class Ex04_user {
	public static void main(String[] args) {
		
		User user1 = new User();	// 객체가 만들어짐
		user1.setUser("admin", "123456", "관리자");	// 여기서 값 안 넣어주면 에러남
		user1.printUser();
		
		System.out.println();
		
		User user2 = new User();
		user2.setUser("user1", "654321", "김유저");
		user2.printUser(); 
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
