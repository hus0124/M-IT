package chap08_MultiInterface;

public class SmartTVExample {

	public static void main(String[] args) {
		SmartTV st = new SmartTV();
		
		RemoteControl rc = new SmartTV();
		
		rc.turnOn();
		rc.setVolume(10);
		// ���� �Ұ��� rc.search();	RemoteControl Ÿ���̶�
		
		Searchable s = (Searchable)rc;	// ��������ȯ ����. rc�� serchable ������ smartTV ��ü �����̹Ƿ�.
		s.search("https://www.naver.com");
		rc.turnOff();

	}

}
