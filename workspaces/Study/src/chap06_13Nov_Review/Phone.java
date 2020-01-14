package chap06_13Nov_Review;

public class Phone {
	//클래스의 구성 멤버는 필드(정보, 상태, 부품, 상수), 생성자, 메소드
	
	public static final int BUSY = 1;		// static 정적, final 불변 고정.
	public static final int IDLE = 2;		// 정적이다 -> 메소드 영역의 클래스에 상주한다.
	public static final int RING = 3;		// static -> 클래스 이름으로 접근한다. Phone.BUSY, Phone.RING
	
	int state = IDLE;	
	int power;
	String model;
	int dataUsage;
	int monthlyFee;
	// ↑ 생성자가 객체를 생성하기 전에 필드 초기화
	
	// 생성자 : 객체를 생성하고 초기화 값 설정. heap 영역 메모리 할당 받음 → 인스턴스화
	// 생성자의 형식은 ClassName(){} 이게 기본 작성.
	
	// HandPhone(){} default 기본생성자. 다른 생성자 없으면 컴파일러가 이런 형태의 기본 생성자 있다고 간주함. 즉 기본 생성자는 굳이 안 써도 됨.
	// 객체 생성하면서 초기값 설정 필요하면 새로운 생성자 정의한다.
	
	Phone(String model, int fee){
		this.model = model;
		monthlyFee = fee;
	}
	
	Phone(int power, String model){		// 생성자 오버로딩. 생성자 이름은 같지만 매개변수 타입, 순서, 개수가 달라서 다양한 생성자로 간주됨.
		
	}

	// 화면 우클릭 → source → Generate Constructor using Fields 로 원하는 필드 선택해서 생성자 생성 가능.
	
	public Phone(String model, int dataUsage, int monthlyFee) {
		//this(model, dataUsage, monthlyFee); this( ) 이 안에 넣는 용법은 지정된 변수 이외에 더 넣고 싶을 때 사용하는 것.
		super();	// 부모 클래스 란 의미. 모든 클래스의 부모 Object class. 이거 지워도 동작은 됨.
		
		this.model = model;
		this.dataUsage = dataUsage;
		this.monthlyFee = monthlyFee;
		power = 0;
		state = IDLE;
	}

	public void powerOn(){
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff(){
		System.out.println("전원을 끕니다");
	}
	
	void sendMessage(String message){
		dataUsage += message.length();
		System.out.println(message + "를 전송합니다.");
	}

	String receiveMessage(){
		String buffer ="문자 메시지 수신 내용";
		dataUsage += buffer.length();
		power -= 1;
		return buffer;
	}
	
	void chargeBattery(int hour){
		System.out.println("충전합니다.(" + hour + ")");
		power += (hour * 2);
	}
	
	void hookOff(){
		System.out.println("통화를 끊습니다");
	}
	
	void hookOn(){
		System.out.println("통화를 시작합니다");
	}
}
