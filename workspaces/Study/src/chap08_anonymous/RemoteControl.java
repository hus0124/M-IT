package chap08_anonymous;

//public 생략해도 public interface와 같다
public interface RemoteControl {
	//상수: 변수처럼 선언되지만 상수
	int MAX_VOLUME = 100;
	int MIN_VOLUME = 0;	// public static final 이 생략되어 있다.
	
	public static final int CONSTANT_VALUE = 10;
	
	// 메소드: 추상, default, 정적
	
	void turnOn();	//추상메소드
	void turnOff();	
	void setVolume(int volume);
	
	// default 메소드, 실행 부분이 있음
	
	default void setMute(boolean mute){
		if(mute){
			System.out.println("무음처리");
		}
		else{
			System.out.println("무음 해제");
		}
	}

	// 정적 메소드
	static void changeBattery(){
		System.out.println("배터리교환");
	}
}
