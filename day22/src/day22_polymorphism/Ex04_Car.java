package day22_polymorphism;

// super class
class Car {
	// Field
	private String model;
	
	// Constructor
	public Car(String model) {
		this.model = model;
	}
	
	// Method
	public void drive() {
		System.out.println(model + " 타고 드라이브 중");
	}
}

// sub
class EV extends Car{
	// Field
	private int battery;
	private final int FULL_BATTERY = 80;
	
	// Constructor
	public EV(String model, int battery) {
		super(model);
		this.battery = battery;
	}
	
	// Method
	public void charging(int battery) {	// 여기서 매개변수명이 필드명이랑 같은데 무관한가?
		this.battery += battery;
		if((this.battery > FULL_BATTERY)) {
			this.battery = FULL_BATTERY;
		}
		System.out.println("전기" + this.battery);
	}
}

// sub - 1-1
class Hybrid extends EV {
	// Field
	private int oil;
	private final int FULL_OIL = 50;
	
	// Constructor
	public Hybrid(String model, int battery, int oil) {
		super(model, battery);
		this.oil = oil;
	}
	
	// Method
	public void addOil(int oil) {
		this.oil += oil;
		if(this.oil > FULL_OIL) {
			this.oil = FULL_OIL;
		}
		System.out.println("오일" + this.oil);
	}
}


public class Ex04_Car {
	public static void main(String[] args) {
		
		Car[] motors = new Car[2];
		
		motors[0] = new EV("bmwi", 50);
		motors[1] = new Hybrid("sonata", 30, 50);
		
		for(Car car : motors) {
			car.drive();
			if(car instanceof EV) ((EV)car).charging(10);
			if(car instanceof Hybrid) ((Hybrid)car).addOil(20);
		}
		
		
		// Hybrid 는 EV 이기도 하면서 car 일 수도 있다.
		// 마지막에 왜 전기, 오일 둘 다 출력됐는지 확인해보기.
		// 왜냐하면 motors[1]에 만들어진 Hybird 객체는 EV 이기도 하면서 Hybrid 이기 때문!
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
