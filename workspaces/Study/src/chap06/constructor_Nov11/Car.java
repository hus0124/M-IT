package chap06.constructor_Nov11;

public class Car {
// 생성자를 정의하지않음 -> default 생성자가 존재하게 됨.
	public Car(){}	// default 생성자. class 표시는 없음. 매개변수가 없음.
		// 실행내용 유무는 무관. 일반적으로 실행내용 없음.
		// default 생성자는 정의하지 않아도 됨.
	
	int speed;
	
	//디폴트 아닌 다른 생성자 존재하면 default 생성자는 없어짐.
	// 위에서 디폴트 생성 해줘야 디폴트 생성자를 사용하는 객체 생성 가능.
	public Car(int speed){	// 초기값으로 설정하고 싶은 값을 매개변수로 받는다.
		this.speed = speed;		
	}
	
	int seat;
	
	public Car(int speed, int seat){
		this.speed = speed;
		this.seat = seat;
	}
	
	String model;
	String color;
	
	public Car(String model, String color, int speed){
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
	
	// 매개변수 데이터 타입 순서가 같아버리면 구별할 수 없다. 스트링 스트링 인티저
	/*
	public Car(String color, String model, int speed){
		this.model = model;
		this.color = color;
		this.speed = speed;
	}*/
	
	// 생성자 overloading 오버로딩. 매개변수의 타입, 개수, 순서가 다른 생성자 여러 개 선언.
	// 다양한 초기화 방법 제공, 매개변수 다른 생성자를 정의 가능하다.
	
	public Car(int seat, String color, String model){
		this.model = model;
		this.color = color;
		this.seat = seat;
}
}
