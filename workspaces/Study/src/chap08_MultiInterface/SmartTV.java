package chap08_MultiInterface;

// 다중 인터페이스 구현 가능

public class SmartTV implements RemoteControl, Searchable {

	// searchable 추상메소드 재정의
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");

	}

	//remoteControl 추상메소드 재정의
	@Override
	public void turnOn() {
		System.out.println("스마트TV 전원을 켭니다");

	}

	@Override
	public void turnOff() {
		System.out.println("스마트TV 전원을 끕니다");

	}

	@Override
	public void setVolume(int volume) {
		System.out.println("스마트 TV 볼륨을" + volume +"로 설정");

	}

}
