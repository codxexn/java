package day17_this;

class Watch {
	
	// Field
	int hour;
	int minute;
	int second;
	
	// Constructor	: 필드값을 초기화 하는 역할로 많이 쓰인다.
	Watch (int hour, int minute, int second) {
		this.hour = hour;		// 필드명과 매개체와 이름을 동일시 해주는 게 좋기 때문에 this 사용
		this.minute = minute;
		this.second = second;
	}
	
	// Method
	void addHour(int hour) {
		if (hour <= 0) return;
		this.hour += hour;		// 0 ~ 23 사이를 벗어날 수 있다.
		this.hour %= 24;
	}
	void addMinute(int minute) {
		if (minute <= 0) return;			// 만약 매개변수가 0보다 작거나 같으면 할 거 없으니까 호출한 데로 돌아가
			addHour(this.minute / 60);		// 아니면 필드 minute 값을 60으로 나눠서 몫을 addHour의 매개변수로 사용해서 메소드 진행하고
			this.minute += minute;			// minute 를 필드에 있는 값과 더해서 다시 필드에 넣어줘
			this.minute %= 60;				// 그리고 그 필드에 있는 값을 60으로 나누고 나머지값을 다시 필드에 넣어줘
	}
	void addSecond(int second) {
		if (second <= 0) return;		// 호출됐던 곳으로 복귀하게 하는 게 return (값이 있으면 값을 가지고 돌아감)
		this.second += second;
		addHour(this.second / 3600);
		addMinute(this.second % 3600 / 60);
		this.second %= 60;
	}
	void see() {
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
	}
	
}
public class Ex04_Watch {
	public static void main(String[] args) {
		
		Watch watch = new Watch(21, 46, 0);		
		watch.addHour(25);					// 25시간 후 (1시간 후의 값)		
		watch.addMinute(61);				// 61분 후 (1시간 1분 후의 값)
		watch.addSecond(3661);				// 3661초 후 (1시간 1분 1초 후의 값)
		watch.see();
	}
}
