package chap08_MultiInterface;

// ���� �������̽� ���� ����

public class SmartTV implements RemoteControl, Searchable {

	// searchable �߻�޼ҵ� ������
	@Override
	public void search(String url) {
		System.out.println(url + "�� �˻��մϴ�.");

	}

	//remoteControl �߻�޼ҵ� ������
	@Override
	public void turnOn() {
		System.out.println("����ƮTV ������ �մϴ�");

	}

	@Override
	public void turnOff() {
		System.out.println("����ƮTV ������ ���ϴ�");

	}

	@Override
	public void setVolume(int volume) {
		System.out.println("����Ʈ TV ������" + volume +"�� ����");

	}

}
