package chap08_MultiInterface;
// new �޴����� �������̽� ���� Ŭ�� ����
/*
 * �������̽� : ��ü�� ����ϱ� ���� ���� �κ�. ��ü�� ��� �Ϻ�.
 * ���� ��� : ���(static final) �޼ҵ�
 * �������̽����� ������, �ʵ� �κ��� ���� . ���� ������ �κ�(public�̴�,)
 * 
 * */

public interface RemoteControl {
	public static final int MAX_VOLUME = 10;
	// ���������� public �� �����ص� �⺻�� public�̴�.
	
	//static final int MIN_VOLUME = 0;
	int MIN_VOLUME = 0;
	//public static final int MIN_VOLUME = 0; ����ó�� �����Ϸ� �ص� �������̽������� ����̴�. ���� �����ϱ�.
	
	
	//�޼ҵ� : �߻�, ����Ʈ , ���� 
	// �߻� �޼ҵ� : ��ȯ�� �޼ҵ� �̸�(�Ű�����...);  ���� �κ��� ���� �޼ҵ�. ���� Ŭ�������� ������ ���־�� ��.
	public void turnOn();	//���� �ǰ� ���� ���� �޼ҵ�
	public void turnOff();
	public void setVolume(int volume);
	
	// ����Ʈ �޼ҵ� : default Ű���� ���. ����κ��� �ִ� �޼ҵ�. ���� Ŭ�������� �� �������� �ʿ�  ����(������ ���� �������ؼ� ���)
	// �������̽��� ����� ����. ��� ���� �������̽���  default �޼ҵ带 �߻� �޼ҵ�� ����(����)�� �� �ִ�.
	// ����Ʈ �޼ҵ�� JAVA8 ���� �߰��� ���
	
	default void setMute(boolean mute){
		if(mute){
			System.out.println("���� ó���� �մϴ�");
		}
		else{
			System.out.println("���������� �մϴ�");
		}
	}
		
	// ���� �޼ҵ� : �������̽� �̸����� �����ؼ� ��� ����. ���� ����� ������ ��. JAVA8���� �߰��� ���.
	static void changeBattery() {
		System.out.println("���͸��� ��ȯ�մϴ�.");
	}
	
	
}
