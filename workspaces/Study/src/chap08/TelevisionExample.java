package chap08;

public class TelevisionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television tv = new Television();
		// tv.MAX_VOLUME = 20;
		// tv.MIN_VOLUME = 10; �������̽� �󿡼� ����̱� ������ ����ó�� �ٲ��� ���Ѵ�.
		tv.turnOn();		
		tv.setVolume(10);	// �߻�޼ҵ�
		tv.setMute(true);	// ����ó��(default �޼ҵ�)
		tv.setMute(false);
		tv.turnOff();
		
		RemoteControl.changeBattery();		//���� �޼ҵ�. �����̹Ƿ� Ŭ���� �̸� ���� ����.
		
		// Ŭ�������� �ڵ�Ÿ�Ժ�ȯ : �θ� Ŭ���� Ÿ�Կ� �ڽ�Ŭ���� ��ü�� ���Թ޴� ��. 
		// �������̽� : �ڵ�Ÿ�Ժ�ȯ (�������̽��� ���� Ŭ���� ��ü�� ���Թ޴°�)
		
		RemoteControl rc = new Television();	// remoteControl �������̽� Ÿ�Կ� ���� Ŭ���� ��ü Television �� ���Թ޴� ��.
		rc.setMute(true);
		rc.setVolume(20);
		// rc.changeChannel(07); �Ұ���. ������ �ڷ����� Ŭ�������� ������ �޼ҵ��̹Ƿ� ���� �������̽� Ÿ������ ������ �Ұ���. 
		// rc.channel = 08; �Ұ���. Ŭ�������� ���ǵ� �ʵ忡 ���� �� ��. �������̽� Ÿ���̴� �������̽����� ������ �͸� ���ٵ�.
				
		Television t = (Television)rc;		// ����Ÿ�Ժ�ȯ. �̰͵� rc�� �ڵ�Ÿ�Ժ�ȯ �Ǿ��⿡ ������ ��. �ƴϸ� �Ұ���.
		
		t.channel = 9;
		t.changeChannel(14);	// Ŭ�������� ���� ��
		t.setVolume(5);			// �������̽� �߻� �޼ҵ带 �������� ��. ���� ����.
		t.setMute(false);		
		
		
		if(rc instanceof Television){		// ��� ���� �Ȱ��� instanceof ����ؼ� ����Ÿ�Ժ�ȯ ���θ� Ȯ���غ� �� �ִ�. 
			Television t2 = (Television)rc;
			System.out.println("�ڷ����� Ŭ������ ����Ÿ�Ժ�ȯ ����");
		}
		else if(rc instanceof AirCon){
			AirCon a = (AirCon)rc;
			System.out.println("������ Ŭ������ ����Ÿ�Ժ�ȯ ����");
		}
		
		// AirCon a = (AirCon)rc; ����!! ������ �� ó�� �������� ����. ClasscastException ���� �߻�
		// ���� rc�� Television Ŭ����.
	}

}
