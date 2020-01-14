package chap08_InterfaceUsage;

public interface RemoteControl {
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	public void turnOn();	
	public void turnOff();
	public void setVolume(int volume);
	
	default void setMute(boolean mute){
		if(mute){
			System.out.println("���� ó���� �մϴ�");
		}
		else{
			System.out.println("���������� �մϴ�");
		}
	}
	static void changeBattery() {
		System.out.println("���͸��� ��ȯ�մϴ�.");
	}
}
