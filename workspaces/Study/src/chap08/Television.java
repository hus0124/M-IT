package chap08;
//�������̽� �����Ѵ�. implements 
	// ��Ӱ���� extends 
	// �������̽��� ������ ���� ���� �����ϴ�. ����� ���� ���.	
	
	//Interface RemoteControl ���� ������ �߻� �޼ҵ带 ������(�ʼ�)
public class Television implements RemoteControl { // [, HardDisk] ���� ���� ��� ���� 
	// �ʵ�
	int channel;
	
	// ������
	
	// �޼ҵ�
	public void changeChannel(int channel){
		this.channel = channel;
	}
	
	@Override
	public void turnOn() {
		System.out.println("�ڷ������� �մϴ�");

	}

	@Override
	public void turnOff() {
		System.out.println("�ڷ������� ���ϴ�");

	}

	@Override
	public void setVolume(int volume) {
		System.out.println("�ڷ����� ������ " + volume + "���� ����");

	}
	
		
	// ����Ʈ �޼ҵ�� ���� �޼ҵ�� ��·�� �������̽����� ���������Ƿ� �������̽� ������ Ŭ������ ������ �ִ�. �ʱ⿡ �������� �ʴ� ����.
}
