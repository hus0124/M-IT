package chap08_InterfaceInherit;

public interface MultiRemoteControl extends RemoteControl, Searchable {
// 다중 인터페이스 상속. 상속한 각각의 인터페이스에는 추상메소드가 존재. 

	// 상수
	
	void changeChannel(int channel);	// 자식 인터페이스 고유의 추상메소드를 새로 추가.
	
	// default 메소드. 보이진 않지만 상속 받으면 또는 구현하면 존재. 재정의할 수도 있다. 받은 메소드를 추상메소드로 정의할 수도 있다.
	
	void setMute(boolean mute);
	
	// 정적 메소드
}
