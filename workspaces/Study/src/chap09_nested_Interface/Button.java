package chap09_nested_Interface;
//��ø �������̽�
// �������̽� Ÿ�� �ʵ� ����. ���� ��ü ����. 
// �ʵ忡 setter ����ؼ� ������ ����
// ���� ��ü�� �޼ҵ� ȣ��.
// ��ø �������̽� ����. �޼ҵ� ����.

public class Button {
//�ʵ� : �������̽� ����
	OnClickListener listen;

// ���� : �Ű������� ������ ���
	public void setOnClickListener(OnClickListener listen){
		this.listen = listen;
	}
	
// �޼ҵ� : ���� ����
	void touch(){
		listen.onClick();
	}
//��ø �������̽�	
	interface OnClickListener {
	void onClick();	// �߻�޼ҵ�
}
}