package chap08_InterfaceUsage;

public class SettopBox implements RemoteControl {
int volume;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("셋탑박스 전원 온");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("셋탑박스 전원 오프");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		System.out.println("볼륨을 " + volume + " 로 설정");
	}

	public void storeFile(String name){
		System.out.println("파일 " + name + " 을 저장합니다");
	}
	
	public void showMovie(String name){
		System.out.println("영화 " + name + " 을 시청");
	}
}
