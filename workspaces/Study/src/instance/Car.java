package instance;

public class Car {
	//필드
	int speed;
	String model;
	String color;
	
	// 정적 필드 : 공용데이터 -> 클래스 Car에 공통으로 사용되는 데이터 -> 하나만 존재 
	public static int MaxSeatNum;
	
	
	//생성자
	public Car(){}
	
	// 메소드 : 인스턴스 메소드
	public void setSpeed(int s){
		speed = s;
	}
	
	public int getSpeed(){
		return speed;
	}

	//정적 메소드 : 객체 생성 없이 존재함. 클래스 이름, 메소드 이름으로 바로 접근. Car.changeBattery() 
	public static void changeBattery(){
		System.out.println("배터리를 교환합니다");
	}
	
	
}
