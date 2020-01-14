package chap08_InterfaceUsage;

public interface RemoteControl {
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	public void turnOn();	
	public void turnOff();
	public void setVolume(int volume);
	
	default void setMute(boolean mute){
		if(mute){
			System.out.println("무음 처리를 합니다");
		}
		else{
			System.out.println("무음해제를 합니다");
		}
	}
	static void changeBattery() {
		System.out.println("배터리를 교환합니다.");
	}
}
