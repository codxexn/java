package day23_interface;

// interface
interface Providable{
	void sightseeing();
	void leisure();
	void food();
}

class KoreaTour implements Providable {
	@Override
	public void sightseeing() {
		System.out.println("광화문 관광");
	}
	@Override
	public void leisure() {
		System.out.println("한강 유람선");
	}
	@Override
	public void food() {
		System.out.println("불고기");
	}
}

class GuamTour implements Providable {
	@Override
	public void sightseeing() {
		System.out.println("투몬 비치");
	}
	@Override
	public void leisure() {
		System.out.println("패들보드");
	}
	@Override
	public void food() {
		System.out.println("피자");
	}
}

class TourGuide {
	// Field
	private Providable tour;		// Providable 타입 값을 넣어줄 공간 tour를 만들어주는 것.
	
	// Constructor
	public TourGuide(Providable tour) {
		this.tour = tour;
	}
	
	// Method
	public void sightseeing() {
		tour.sightseeing(); 	// 다형성 (전달된 tour에 따라 동작이 달라진다.)
	}
	
	public void leisure() {
		tour.leisure(); 		// 다형성
	}
	
	public void food() {
		tour.food();			// 다형성
	}
}

public class Ex04_Providable {
	public static void main(String[] args) {
		
		KoreaTour tour = new KoreaTour();
		TourGuide guide = new TourGuide(tour);
		
		guide.sightseeing();
		guide.leisure();
		guide.food();
		
		GuamTour tour1 = new GuamTour();
		TourGuide guide1 = new TourGuide(tour1);
		
		guide1.sightseeing();
		guide1.leisure();
		guide1.food();
		
	}

}
