package chap08_InterfaceInherit;

public interface MultiRemoteControl extends RemoteControl, Searchable {
// ���� �������̽� ���. ����� ������ �������̽����� �߻�޼ҵ尡 ����. 

	// ���
	
	void changeChannel(int channel);	// �ڽ� �������̽� ������ �߻�޼ҵ带 ���� �߰�.
	
	// default �޼ҵ�. ������ ������ ��� ������ �Ǵ� �����ϸ� ����. �������� ���� �ִ�. ���� �޼ҵ带 �߻�޼ҵ�� ������ ���� �ִ�.
	
	void setMute(boolean mute);
	
	// ���� �޼ҵ�
}
