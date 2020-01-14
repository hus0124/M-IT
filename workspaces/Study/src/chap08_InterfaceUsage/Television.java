package chap08_InterfaceUsage;

public class Television implements RemoteControl {
	int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV 온");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV 오프");

	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println("볼륨을 " + volume + " 로 설정");
		 

	}

}
