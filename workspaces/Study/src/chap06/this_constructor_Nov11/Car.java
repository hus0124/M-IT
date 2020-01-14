package chap06.this_constructor_Nov11;

public class Car {
	// 필드명
	
	String model;
	String color;
	int maxSpeed;
	
	
	
	public Car(){
		
	}
	
	//생성자1
	public Car(String model){
		// this(model, "White");  다른 생성자2 Car 를 호출
		this.model = model;
		this.color = "White";
		this.maxSpeed = 200;
	}
	
	//생성자2
	public Car(String model, String color){
		this(model, color, 250);
		
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = 250;
	}

	//생성자3
	public Car(String model, String color, int speed){
		// this(model, color, speed)
		this.model = model;  //this : Car(클래스)
		this.color = color;
		this.maxSpeed = speed;
	}
}

class Airplane{ //접근 제한 default 패키지 내에서만 접근 가능.
}


