package day25_exception;

class Person {
	
	private int age;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age)  throws Exception {		// 2. throw 문으로 예외가 던져진 경우 throws는 필수로 작성해야 한다.
		if (age < 0 || age > 120) {		// 코드상 예외가 아니라 로직상 예외를 만들고 싶은 것.
			// return;	
			// return을 사용하게 되면 정상종료가 돼서 돌아왔는지, 이슈가 있어서 돌아온 건지 알 수 없다.
			// 자바가 인지하지 못하는 예외(로직상 예외)는 개발자가 직접 예외를 발생시켜준다.
			
			throw new Exception();
			// 1. 개발자가 "예외 객체"를 직접 생성해서 예외를 던지는 경우
		}										
		this.age = age;
	}
}

public class Ex10_throw {
	public static void main(String[] args) {
		
		Person p = new Person();
		
		try {
			p.setAge(100000);
			System.out.println("나이 : " + p.getAge());
		} catch(Exception e) {
			System.out.println("나이는 0 ~ 120 사이만 가능합니다.");
		}
		
	}
}
