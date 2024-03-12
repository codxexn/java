package day22_polymorphism;

class Animal {
	// Method
	public void eat() {
		System.out.println("먹이를 먹는다.");			// 이 메소드 형식이 필요할 뿐 안에 내용은 필요 없으니
	}												// 추상 클래스, 추상 메소드로 super 를 만들어주면
}													// 오버라이드를 사용하면 된다.

class Dolphin extends Animal {

	@Override
	public void eat() {
		System.out.println("물고기를 먹는다.");
	}
	
	// Dorphin 만 가지고 있는 메소드 swim()
	
	public void swim() {
		System.out.println("돌고래가 헤엄친다.");
	}
}


class Eagle extends Animal {

	@Override
	public void eat() {
		System.out.println("육고기를 먹는다.");
	}
	
	// Eagle 만 가지고 있는 메소드 fly()
	public void fly() {
		System.out.println("독수리가 난다.");
	}
}


public class Ex05_Animal {
	public static void main(String[] args) {
		
		Animal[] animals = new Animal[2];
		
		animals[0] = new Dolphin();
		animals[1] = new Eagle();
		
		for(Animal animal : animals) {	// 새로운 Animal 타입의 공간 animal 이 생성됐고 animals 배열에 있는 값이 순차적으로 담긴다.
										// 증가 생략, 시작점, 끝점 등 명시X (첫째 값부터 마지막 값까지 돈다.)
			
			animal.eat();	// 다형성 : 오버라이드 된 메소드가 실행되므로 animal 에 따라 실행 결과가 다르다.
							// 오버라이드를 했기 때문에 같은 코드로 다른 동작을 실현시킨다.
							// 원형 유지, 내용 다름
			
			if(animal instanceof Dolphin) ((Dolphin)animal).swim();
			else if(animal instanceof Eagle) ((Eagle)animal).fly();
			// 개별로 가진 것을 사용하고 싶으면 다운캐스팅
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
