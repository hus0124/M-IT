package chap08;

public class AirCon implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("에어컨을 켭니다");

	}

	@Override
	public void turnOff() {
		System.out.println("에어컨을 끕니다");

	}

	@Override
	public void setVolume(int volume) {
		System.out.println("사용하지 않는 기능입니다");

	}

}
