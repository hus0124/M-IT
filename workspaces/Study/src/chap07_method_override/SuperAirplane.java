package chap07_method_override;

public class SuperAirplane extends Airplane {
	int mode;	// ��� 1 �Ϲ� , ��� 2 ������
	
	public void setMode(int mode){
		this.mode = mode;
	}
	
	@Override	// ������̼� : �����Ϸ����� �θ� Ŭ������ �޼ҵ� ����ο� �������� �˻� ����. 
	public void fly() {
		if(mode==1)
		super.fly();	// �Ϲݺ���
		else
			System.out.println("������ ��� ����");
	}
	
}
