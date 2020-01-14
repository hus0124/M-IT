package chap08_MultiInterface;
// new 메뉴에서 인터페이스 직접 클릭 생성
/*
 * 인터페이스 : 객체와 통신하기 위한 정한 부분. 객체의 기능 일부.
 * 구성 멤버 : 상수(static final) 메소드
 * 인터페이스에는 생성자, 필드 부분이 없다 . 접근 제한자 부분(public이다,)
 * 
 * */

public interface RemoteControl {
	public static final int MAX_VOLUME = 10;
	// 접근제한자 public 을 생략해도 기본이 public이다.
	
	//static final int MIN_VOLUME = 0;
	int MIN_VOLUME = 0;
	//public static final int MIN_VOLUME = 0; 변수처럼 정의하려 해도 인터페이스에서는 상수이다. 변수 없으니까.
	
	
	//메소드 : 추상, 디폴트 , 정적 
	// 추상 메소드 : 반환형 메소드 이름(매개변수...);  구현 부분이 없는 메소드. 구현 클래스에서 재정의 해주어야 함.
	public void turnOn();	//선언만 되고 구현 없는 메소드
	public void turnOff();
	public void setVolume(int volume);
	
	// 디폴트 메소드 : default 키워드 사용. 실행부분이 있는 메소드. 구현 클래스에서 꼭 재정의할 필요  없음(하지만 보통 재정의해서 사용)
	// 인터페이스도 상속이 가능. 상속 받은 인터페이스는  default 메소드를 추상 메소드로 정의(변경)할 수 있다.
	// 디폴트 메소드는 JAVA8 부터 추가된 기능
	
	default void setMute(boolean mute){
		if(mute){
			System.out.println("무음 처리를 합니다");
		}
		else{
			System.out.println("무음해제를 합니다");
		}
	}
		
	// 정적 메소드 : 인터페이스 이름으로 접근해서 사용 가능. 공통 기능을 구현할 때. JAVA8부터 추가된 기능.
	static void changeBattery() {
		System.out.println("배터리를 교환합니다.");
	}
	
	
}
