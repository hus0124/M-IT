package chap06_Review;

public class Car {
	// 클래스 구성 멤버 : 필드, 생성자, 메소드
	// 필드 : 상태, 기본 정보, 일종의 전역 변수로 작용하여 부품 역할.
	
	int speed;
	int seatNum;
	String owner;
	String company;
	String model;
	
	public Car(){System.out.println("Car()");}
	
	// 생성자 : 객체 만들기 위한 방법. 따로 정의 안하면 기본 생성자 존재로 간주.
	// public car{} : default 생성자이다.실행문 없고 반환형 없음.주소만 반환. 
	// 생성자 역할 : 객체 생성(메모리확보) 필드값 초기화 

	public Car(String company, String m){
		this.company = company;	//매개변수와 필드 구분 위해 this사용
		model = m; //this 없어도 새로 쓰면 된다.
		System.out.println("Car(String company, String m)");
	}
	
	//생성자 오버로딩 : 매개변수 타입 개수 순서가 다른 생성자 여러개 선언
	
	public Car(int speed, String model){
		this.speed = speed;
		this.model = model;
		System.out.println("Car(int speed, String model)");
	}
	
	public Car(String company, String model, int speed){
		this.company = company;
		this.model = model;
		this.speed = speed;
		System.out.println("Car(String company, String model, int speed)");
	}
	
	public Car(String company){
		this(company, "소나타");
		System.out.println("Car(String company)");
	}
	
	public void speedUp(int speed){
		this.speed = speed;
	}
}

