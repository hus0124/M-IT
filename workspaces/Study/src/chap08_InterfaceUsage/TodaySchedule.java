package chap08_InterfaceUsage;

public class TodaySchedule {

	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿");	// �ʵ��� �������� ���� �������� ��ü�� ������ �� �ִ�.
		
		p1.sb = new Television();	//sb�� person Ŭ�������� �����ߴ� �������� = �������̽�. �ʵ�� �������̽� Ȱ��. �ʵ��� ������.
		p1.sb.turnOn();
		p1.sb.setMute(true);
		p1.sb.setMute(false);
		p1.sb.turnOff();
		System.out.println();
		
		p1.sb = new SettopBox();
		p1.sb.turnOn();
		p1.sb.setMute(true);
		p1.sb.setMute(false);
		p1.sb.turnOff();
		System.out.println();
		
		p1.method3(new Television());	// person Ŭ������ �޼ҵ�3. �������̽��� �Ű������� �ϴ� �޼ҵ�. �Ű������� ������.
		System.out.println();
		p1.method3(new SettopBox());	// �������̽� ������ Ŭ���� ��ü���� �� �� �ִ�.
		System.out.println();
		
		p1.watchMovie();
		
		RemoteControl.changeBattery(); // �������̽��� ���� �޼ҵ�. �������̽� �̸����� ����. 
		

	}

}
