package chap08_InterfaceInherit;

public class MultiFunctionTV implements MultiRemoteControl {

	//RemoteControl의 추상 메소드 재정의
	@Override
	public void turnOn() {
		System.out.println("다기능TV 작동");

	}

	@Override
	public void turnOff() {
		System.out.println("다기능TV 정지");

	}

	@Override
	public void setVolume(int volume) {
		System.out.println("볼륨 " + volume + "로 조정");

	}

	// searchable 인터페이스의 추상 메소드 재정의
	@Override
	public void search(String url) {
		// TODO Auto-generated method stub

	}

	//상속 받은 자식 MultiRemoteControl 인터페이스의 고유 추상 메소드 재정의
	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setMute(boolean mute) {
		// TODO Auto-generated method stub
		
	}
	
}
