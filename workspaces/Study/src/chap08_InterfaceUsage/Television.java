package chap08_InterfaceUsage;

public class Television implements RemoteControl {
	int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV ��");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV ����");

	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println("������ " + volume + " �� ����");
		 

	}

}
