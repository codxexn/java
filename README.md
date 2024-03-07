# java✍️
Java 강의에서 배우고 공부한 내용 (23.04.11.~23.06.08.) 입니다.

**각 java 파일에 개념 정리와 예시 소스코드가 함께 기재**돼 있습니다.

**목차 겸 간략한 내용을 아래에 정리**해두었으니 참고 부탁 드립니다. 

감사합니다. 🥰


<br><br>

## 📝 Day01
> #### Java basic
- 주석 
	- C와 같은 방법으로 처리 ( //, /* */ )
	- 이클립스 주석 자동 완성 : ctrl + /
- 실행:  ctrl + F11
- 출력
	- println: ln: line -> 줄 바꿈 
- 표현 방식
	- 문자 표현 방식(홑(작은)따옴표)
	- 문자열 표현 방식(쌍(큰)따옴표)
	- 정수나 실수 표현 방식(그냥 입력)
	- 논리값 표현 방식

<br><br>

## 📝 Day02
> #### 자료형
- **기본 자료형 (primitive type): 값을 저장하는 자료형**
- **참조 자료형 (reference type) - 대문자로 시작**

> #### Plus operator

> #### Escape 문자

<br><br>

## 📝 Day03
>#### Variable
**변수 (variable)_ 공간을 선언한다. (상수=고정된 수)**

>#### Casting

>#### Pasing

**문자열 변환 형 변환(casting)이 아니고, 구문 분석(parsing) 이다.**

> #### Operator

<br><br>

## 📝 Day04
> #### Scanner

<br><br>

## 📝 Day05
> #### Input

> #### JOptionPane Class

<br><br>

## 📝 Day06
> #### Control Statement
- if
- switch
  
> #### Random
- random
- Math random

<br><br>

## 📝 Day07
> #### Control Statement
- while
- do ~ while
- for
  
<br><br>

## 📝 Day08
> #### Control Statement
- break
- continue
- loop in loop

> #### Array
- **선언 방법 추천 ↓ : 현직 개발자가 가장 많이 씀**
```java
int[](배열 만들거야) arr(공간 이름) = new int[3](3칸짜리);
```	

<br><br>

## 📝 Day09
> #### Array
- array copy
- array io
- for each

<br><br>

## 📝 Day11
> #### Array
- 2D array
	- 고정형 2차원 배열
 	- 가변형 2차원 배열

<br><br>

## 📝 Day12
> #### Class
- 구성: Field, Method
- 객체 생성
- Main Class: main method를 가진 Class
- Method 작성 규칙
- method overloading

<br><br>

## 📝 Day13
> #### Class
- Data Class: Field, Method 등 생성(설계도 만든 것)
- Main Class: main method 안에 있는 것만 실행(동작)

<br><br>

## 📝 Day16
> #### Method Overloading
- 매개변수의 타입 및 개수가 다른 같은 이름의 메소드

> #### Constructor
- 객체(인스턴스)가 생성될 때 자동으로 호출되는 메소드
- 생성자를 만들지 않으면 아무일도 하지 않는 "디폴트 생성자"가 호출
- 객체(인스턴스)의 필드 값의 초기화를 위해 존재

```java
Car taxi = new Car();		-> Car() == 생성자
Person man = new Person();	-> Person() == 생성자
Circle hole = new Circle();	-> Circle() == 생성자
```

<br><br>

## 📝 Day17
> #### Constructor

> #### this
- 생성된 객체(인스턴스) 자신의 주소(참조, 레퍼런스)

  = 생성된 객체 자신

<br><br>

## 📝 Day18
> #### Static
- static 사전적 정의: 정적
	- 정적: 미리 만듬 (컴파일 때 이미 만들어져 있다.)
	- 동적: 나중에 만듬 (new를 의미)
- static 사용 이유
	- 모든 객체(인스턴스)가 특정 값을 공유하기 위해
	- 객체(인스턴스) 생성(new) 없이 클래스를 사용하기 위해

<br><br>

## 📝 Day19
> #### Recursive Call

> #### Inheritance
- 기존 클래스 확장(extends), 재활용
- 다중 상속 불가능
- 자바의 모든 클래스는 java.lang.object 클래스를 슈퍼클래스로 가진다.

> #### Method Override
- 부모클래스가 가지고 있는 메소드를 자식클래스가 다시 만드는 것

**📌 overloading, overriding**
- 오버 로딩: 한 클래스내 이름은 같고, 매개변수가 다른 메소드가 여러개 존재할 수 있다.
- 오버 라이드 : 부모클래스가 가지고 있는 메소드를 자식클래스가 그대로 똑같이 다시 만드는 것이다.

<br><br>

## 📝 Day20
> #### inheritance

> #### Method Override

> #### access modifider
- Information Hiding
	- 불필요한 내부 정보는 숨기고, 필요한 정보만 노출시킨다.
 	- 불필요한 내부 정보는 대표적으로 "필드" 이다.
  	- 노출시키는 정보는 대표적으로 "생성자", "메소드" 이다.
  	- 노출여부 결정은 "접근지시자"를 통해서 한다.
- "접근 지시자"의 종류
	- private	: 같은 클래스 내에서만 접근 가능 
	- default	: 같은 패키지 내에서만 접근 가능
 	- protected	: 같은 패키지이거나 다른 클래스의 상속 관계 클래스 내에서만 접근 가능
  	- public	: 누구나 접근 가능
 
> #### Getters And Setters
- setter: 값을 저장하는 메소드
- getter: 값을 읽어오는 메소

<br><br>

## 📝 Day21
> #### polymorphism

> #### upcasting
- 자식클래스를 부모클래스로 넣어야 하기 때문에 자식클래스의 고유의 것을 접어서 사용할 수 없게 된다.
- 부모와 자식의 공통적으로 공유하는 것만 사용할 수 있다.

> #### downcasting
- 업캐스팅 됐던 애를 다시 원상복구 하는 것

```java
// 형식
	// 업캐스팅
		부모클래스 참조변수 = new 자식클래스 ();
	// 다운캐스팅	
		자식클래스 참조변수2 = (자식클래스) 참조변수;
```

- 강제 형변환으로 진행되기 때문에 잘못된 형변환이 발생할 수 있다.
- 이를 방지하기 위해 참조변수의 타입을 바꾸기 전에 확인하는 instanceof 연산자를 활용한다.

<br><br>

## 📝 Day22
> #### abstract method
- 본문({}) 이 없는 메소드
- 형식: abstract public 리턴타입 메소드명();

> #### abstract Class
- 추상 메소드를 하나라도 가진 클래스
- **추상 클래스는 new 를 할 수 없다. (객체(인스턴스) 생성이 안된다. (금지))**
	- 몸체가 없는 것을 구체화 시킬 수 없다.
 	- 실체화 할 기능이 전혀 없다.
- 형식: abstract class 클래스명 { }
- **추상 클래스를 상속 받는 자식클래스들을 반드시! 추상 메소드를 오버라이드 해야 한다.**

<br><br>

## 📝 Day23
> #### abstract

> #### interface
- implements
- 다중구현 가능

<br><br>

## 📝 Day24
> #### exception

**📌 오류, 예외**
- 오류 : 에러, 개발자가 손 못대는 수준의 문제
- 예외 : 개발자가 회피할 수 있는 수준의 문제	

- 모든 예외는 Exception 클래스로 처리할 수 있다.

<br><br>

## 📝 Day25
> #### exception
- e.getMessage() : 예외에 따라 자바가 저장하고 있는 기본 메시지
- throws: 호출된 곳으로 예외를 던져 책임을 전가

> #### API
- String
	- 같은 문자열을 또 사용하면 기존 문자열을 사용(최적화)
	- new는 언제나 새로운 문자열을 생성
 	- equals(), equalsIgnoreCase()
 	- length()
 	- charAt()
 	- indexOf()
 	- lastIndexOf()
 	- subString()
 	- replace

<br><br>

## 📝 Day26
> #### API
- StringBuffer
- wrapper_class
- big_number
	-  BigInteger
 	-  BigDecimal
- Calendar
- Date
	- 자바용 Date : java.util.Date
 	- SQL용 Date : java.sql.Date 
- SimpleDateFormat
```java
// 2023년 6월 8일 오전 1:30
	Date today = new Date();
	String pattern = "yyyy년 M월 d일 E요일 a h:mm";
	SimpleDateFormat sdf = new SimpleDateFormat(pattern);
	
	String now = sdf.format(today);
	System.out.println("현재 날짜와 시간 : " + now);
```

<br><br>

## 📝 Day27
> #### Object
- Object : 모든 클래스의 부모
- Object 타입 : 모든 객체(변수)를 저장할 수 있는 타입
- 뭐가 들어올지 확실치 않을 때(특정할 수 없을 때)
- 로직이 뭐든 받겠다고 결정이 됐을 때 Object 로 명시
- 에러가 날 수 있는 확률도 많아진다.

> #### toString
- toString() : 객체(인스턴스)를 String으로 변환하는 메소드

> #### toString override: alt + shift + s + s
```java
// Object의 toString()을 오버라이드
	@Override
	public String toString() {
		String message = "제목 : " + title + ", 가격 : " + price + "원";
		return message;
	}
```

> #### equals
- Object 클래스의 equals() 메소드의 기본 동작: 두 객체(인스턴스)의 참조값(주소값) 비교

> #### equals override : alt + shift + h -> hashcode와 함께 재정
- Object 클래스의 equals() 메소드를 값이 같은 지를 비교하는 메소드로 변경함

> #### generic
- 제네릭 (Generic) : 자료형의 변수화, 나중에 치환하는 것
```java
// 주의 사항
	1) T obj = new T();	불가능 (제네릭 타입을 객체 생성하는 것은 불가능하다.)
	2) T[] arr = new T[3];	불가능 (제네릭 타입을 배열 생성하는 것은 불가능하다.)
	3) T[] arr;		가능 (제네릭 타입은 배열 타입 선언만 가능하다.)
```

<br><br>

## 📝 Day28
> #### generic
- 무엇이든 담을 수 있는 GenericOmniBox
- T : 어떤 타입(자료형) -> 생성자가 GenericOmniBox<전달할 타입>() 형태가 된다.
```java
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

	}
}
```

- generic class
- generic method

<br><br>

## 📝 Day29
> #### collection framework
- ArrayList
	- 데이터 저장: add()
	- 값 호출: get()
	- 크기: size()
		- 마지막 인덱스 값: 크기 - 1
	- 삭제: remove(index)
	- 삭제: remove(객체)
	- 확인: contains(객체)
	- 초기화: clear()

