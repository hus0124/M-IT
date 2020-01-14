package static_block;

public class Car {
	// 정적 필드 
	static int field1 = 20; 	// 변수 선언과 함께 초기화 실행 
	static int field2;			// 선언만 하고 초기화 안 함.
	
	// 정적 블럭. 잘 안쓰이는 기능.
	static {			// 블럭 : 중괄호 '{' 로 시작해서 '}'로 끝나는 부분.  static{ } = 정적 블럭이다. 
		field2 = 30;	// 정적 필드만 초기화 수행 가능. 인스턴스 필드에서 객체 생성된 것은 여기서 사용 불가.
		// seatNum = 50; 불가능
	}
	
	// 인스턴스 필드 : 객체 생성 후 메모리에 저장공간 할당 된 뒤에 사용되는 필드.
	int speed;
	int seatNum; 
	int TireNum;
	{TireNum = 4;}  // 중괄호 쓰는 용법도 가능. 객체가 생성될 때 블럭 이용 가능. 잘 안쓰임.
	
	// 정적 메소드
	
	static void method(){
		// 정적 메소드에서 사용할 수 있는 필드 : 정적 필드만 사용 가능
		field1 = 30;
		// seatNum = 4; 정적 필드 아니면 불가.
		// setSpeed(5); 인스턴스 메소드는 호출 불가
		method2();	// 정적 메소드라서 호출 가능.
	}
	
	public void setSpeed(int speed){
		this.speed = speed;
	}
	
	static void method2(){
		System.out.println("정적 메소드 2가 불림");
	}
	
	

}
