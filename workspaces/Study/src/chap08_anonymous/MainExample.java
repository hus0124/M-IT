package chap08_anonymous;

public class MainExample {

	public static void main(String[] args) {
		// �ڷ����� ���� ��ü�� ��� -> ��ü�� �̸��� ����. �����ڸ� �� ����. �͸� ���� ��ü �ʿ�.
		
		// �̷��� ���� RemoteControl r = new Television();
		
		// �͸� ��ü�� Ŭ���� �̸��� ����. Ŭ���� �̸��� �����Ƿ� �����ڸ� �������̽� �̸����� ����Ѵ�. 
		
		RemoteControl rc = new RemoteControl(){
			// ���� ��ü : RemoteControl �� implement (����)
			// �� �κ��� Ŭ���� ���̹Ƿ� �ʵ�, �޼ҵ�, ������ �־�� ������ Ŭ���� �̸��� ������ �����ڴ� ����.
			
			int field1 = 20;
			void method1(){
				turnOn();
			}
			
			// �͸��̶� ��·�� ����(implement) ��ü�̹Ƿ� �������̽� Ŭ������ �߻�޼ҵ带 �������Ѵ�.
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
				System.out.println("������  " + volume + "���� ����");
				
			}
		};			// default �޼ҵ嵵 ���� (setVolume)

		rc.turnOn();
		rc.setVolume(20);
		rc.turnOff();
		
		//	rc.field1 = 20; �͸� ���� ��ü �ȿ����� ���� ����. �ۿ��� �Ұ���.
		//  rc.method1();
		
		// Ŭ���� �̸��� ������ ���� Ÿ�� ��ȯ�� �Ұ���
		
		RemoteControl audio = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("������� �մϴ�");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("������� ���ϴ�");
				
			}
			
			@Override
			public void setVolume(int volume) {
				System.out.println("����� ������ " + volume + "�� ����");
						
			}
		};
		
		audio.turnOn();			// �������̽��� �߻� �޼ҵ� �����Ǹ� �� ��. ������ ȣ���ؾ� �Ѵ�.
		audio.setVolume(30);
		audio.setMute(true);
		audio.setMute(false);
		audio.turnOff();
		RemoteControl.changeBattery();
	}

}
