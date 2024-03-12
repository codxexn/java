package day21_access_modifier;

class Person{
	
	// Field
	private String name;
	private int age;
	private boolean isAdult;
	
	// Method
	// getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		if (age >= 20) setAdult(true);	// age 에 따라서 자동으로 값이 들어가게끔 지정해준다.
	}
	public boolean isAdult() {			// 얘는 왜 getIsAdult 가 아니고 그냥 쓴 거지?
		return isAdult;
	}
	private void setAdult(boolean isAdult) {	// private 처리하면 age의 값과 별개로 일치 안되게 값을 할당해버릴 수 있어서
		this.isAdult = isAdult;					// 실수 방지를 위해 접근 못하게 하고 age 에 따라 값이 나오게 만들어준다.
												// 같은 class 이기 때문에 접근 가능
	}
	
	
}


public class Ex04_Person {
	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.setName("이도은");
		person.setAge(32);
		
		System.out.println("이름 : " + person.getName());
		System.out.println("나이 : " + person.getAge());
		System.out.println(person.isAdult() ? "성인" : "미성년자");
	}
}
