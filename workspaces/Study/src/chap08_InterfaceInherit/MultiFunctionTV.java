package chap08_InterfaceInherit;

public class MultiFunctionTV implements MultiRemoteControl {

	//RemoteControl�� �߻� �޼ҵ� ������
	@Override
	public void turnOn() {
		System.out.println("�ٱ��TV �۵�");

	}

	@Override
	public void turnOff() {
		System.out.println("�ٱ��TV ����");

	}

	@Override
	public void setVolume(int volume) {
		System.out.println("���� " + volume + "�� ����");

	}

	// searchable �������̽��� �߻� �޼ҵ� ������
	@Override
	public void search(String url) {
		// TODO Auto-generated method stub

	}

	//��� ���� �ڽ� MultiRemoteControl �������̽��� ���� �߻� �޼ҵ� ������
	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setMute(boolean mute) {
		// TODO Auto-generated method stub
		
	}
	
}
