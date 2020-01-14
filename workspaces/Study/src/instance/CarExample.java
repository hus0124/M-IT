package instance;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car.MaxSeatNum = 6;			// 정적 메소드, 정적 필드. 공통데이터, 객체 생성 없이 접근 가능.
		Car.changeBattery();		// 객체 생성 없이 접근 가능
		
		Car car1 = new Car();
		car1.setSpeed(50);
		car1.speed = 60;
		car1.MaxSeatNum = 30;	//객체 생성 아닌 static way로 접근하라는 메시지가 뜨고 있다.
		
		System.out.println("현재 속도: " + car1.getSpeed());
		
		Common.maxMember = 20;

	}

}
