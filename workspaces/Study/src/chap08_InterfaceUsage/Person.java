package chap08_InterfaceUsage;

public class Person {
	// ��ü�ϱ� �ʵ�, ������, �޼ҵ� �� ����
	
	RemoteControl sb;	// �ʵ�� �������̽��� ����ؼ� ����. �ּҸ� �����ϴ� ���� ����ó�� ��� ����. �����ڿ� ��������� ����.
	String name;
	
	public Person(String name){
		this.name = name;
	}
	
	//������
	Person(RemoteControl rc){
		this.sb = rc;
	}
	
	//�޼ҵ�
	public void watchMovie(){
		RemoteControl rc = new SettopBox();
		rc.turnOn();
		SettopBox s = (SettopBox)rc;
		s.showMovie("��Ÿ����");
	}
	
	// �޼ҵ��� �Ű������� �������̽��� ����Ѵ�(������). �Ű������� Ŭ������ ����ߴ� �Ͱ� ����.
	
	public void method3(RemoteControl rc){
		rc.turnOn();
		rc.setVolume(30);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		
	}

}
