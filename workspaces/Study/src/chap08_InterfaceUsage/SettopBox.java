package chap08_InterfaceUsage;

public class SettopBox implements RemoteControl {
int volume;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("��ž�ڽ� ���� ��");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("��ž�ڽ� ���� ����");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		System.out.println("������ " + volume + " �� ����");
	}

	public void storeFile(String name){
		System.out.println("���� " + name + " �� �����մϴ�");
	}
	
	public void showMovie(String name){
		System.out.println("��ȭ " + name + " �� ��û");
	}
}
