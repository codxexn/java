package day04_input;

public class Ex01_Scanner {
	public static void main(String[] args) {
		
		/*
		 *  Scanner 클래스(묶음, 주머니)
		 *  사용자가 보는 화면인 Console에서 사용자가 입력한 값을 받아들이는 역할을 하는 것
		 *  
		 *  1. 콘솔 창을 통한 입력
		 *  
		 *  2. java.util.Scanner 클래스로 존재
		 *  	1) java.util.Scanner 클래스로 그대로 사용
		 *  	  : 접근을 해. (그 바깥에 있는 곳에 들어가. 가지고 오지 말고. 거기서 보는 것.)
		 *  	2) import java.util.Scanner; 후 Scanner만 사용 (주로 사용)
		 *  	  : 그 설계도를 일단 가지고 와. (내 공간 안에 가지고 오는 것. 대여.)
		 *			- import 대상 : java.lang 이외의 패키지에 저장되어 있는 모든 클래스
		 *
		 *	3. Scanner 클래스의 객체 생성 방법
		 *	   Scanner 객체명 = new Scanner (System.in);
		 *
		 *	4. Scanner 클래스의 객체 소멸 방법
		 *	   객체명.close();
		 *
		 *	5. Scanner 클래스의 메소드(기능) (입력하는 데이터 타입에 따라 구분)
		 *		1) 정수 입력	ex) 나이
		 *			- nextInt(), nextByte(), nextShort(), nextLong()
		 *		2) 실수 입력	ex) 키, 몸무게
		 *			- nextFloat(), nextDouble()
		 *		3) 논리 입력
		 *			-nextBoolean()
		 *		4) 문자열 입력
		 *			- next() : 공백문자 전까지 입력 (공백 입력 불가)
		 *			- nextLine() : 엔터 전까지 입력 (공백 입력 가능)
		 *		5) 문자 입력 : 문자열 입력 후 첫번째 글자만 발췌해서 사용
		 *			- 문자열 입력(next(), nextLine()) 후 첫번째 글자만 빼서 (charAt(0) 사용)
		 *			- charAt(0) 0번째 글자
		 *
		 *	+ Scanner 라는 이름의 tool(도구) 상자를 가지고 와서 
		 *	그 상자 안에 있는 여러 개의 도구들을 적재적소에 사용하겠다.
		 *	( ) 안에 있는 것은 기능이다.
		 *
		 * 
		 */
		
		// 1) Scanner 클래스의 scanner 객체 생성
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		// sc 자체가 스캐너(객체) 가 되는 게 아니라
		// new java.util.Scanner(System.in); 가 새로 만들어진 객체이고
		// sc 는 말 그대로 sc 라는 공간을 확보해둔 것.
		// 거기에 만든 스캐너(객체)를 대입한 것.
		// 스캐너라는 type 이 저장될 공간 확보. 공간 이름은 sc.
		// 그 공간에 new 객체를 생성해서 저장해줘.
		// 변수명(공간 이름)은 짓기 나름.
		
		// 2) 입력
		System.out.print("성명 입력 >> ");
		String name = sc.nextLine();
		// sc.nextLine(); 가지고 오는 값은 console 에서 사용자가 입력한 값이다.
		// 그 값의 주소를 name 이라는 이름을 가진 공간에 저장하는 것이다.
		// 일반적으로 좌측부터 처리가 되지만 대입연산이 처리 우선순위가 하위이기 때문에 가장 나중에 처리됨
		
		// 나이, 키, 성별 입력
		
		System.out.print("나이 입력 >> ");
		int Age = sc.nextInt();
		System.out.print("키 입력 >> ");
		double height = sc.nextDouble();
		System.out.print("성별 입력 >> ");
		String gender = sc.next();
		// String gender = sc.nextLine(); 
		// 로 작성하게 되면 앞에 nextDouble이 남겨둔 enter 키를 인식 + 종료까지 해서 그 뒤에 문자를 입력할 수 없다.
		// 그대로 하고 싶으면 통로에 남은 enter 를 처리할 수 있는 sc.nextLine(); 를 한번 더 작성해준다.(해결)
		// 그 전에 nextLine(); enter 를 챙겨가는 코드를 썼으면 굳이 안 써도 됨
		
		// Q. 내가 짠 코드처럼 next(); 를 사용했을 땐 오류가 나지 않았는데 next(); 는 공백 입력이 불가하니까 그런 것.
		// 그렇다면 저 통로에는 enter 가 남아있는 상태인 건가?
		
		
		System.out.println("성명 : " + name);
		System.out.println("신장 : " + height + " cm");
		System.out.println("나이 : " + Age + " 세");
		System.out.println("성별 : " + gender);

		// char 는 문자, 문자열을 쓰려면 String.
		// char 을 변수로 선언할 거면 사용자가 입력한 값의 첫번째 글자만 사용해야 하기 때문에
		// char gender = sc.next().charAt(0);
		// 사용자가 입력한 문자열에서 첫번째(0번째) 글자를 뽑아서 그 글자를 gender 에 대입하는 것.
		
		// 3) 출력까지 해오기

		sc.close();
		
		// 메모리 누수 방지를 위한 메모리 청소(꼭 닫아줘야 함)
		
		
	}
}
