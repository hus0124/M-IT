package chap07;

public class DmbPhone extends CellPhone {	// �ϳ��� �ڽ��� �ϳ��� �θ� ���. extends + Ŭ���� �̸����� ���.
	// �ڽ��� ����� �ʵ�� �޼ҵ�(�θ� ������ �͵�)�� ��� ����.(�ڽ� �ʵ忡 �� ������ ������)

	int channel;	// �ڽ� Ŭ�������� ���� �ʵ�
	
	// ������ ���� ���� ������ ����Ʈ ������
	
	public DmbPhone(){
		// super(); �θ� �����ڰ� ���� ȣ��ǹǷ� cellphone ȣ�� ���� �ȴ�.
		System.out.println("DmbPhone() ������ ȣ���");
	}
	
	public DmbPhone(String model, String color, int channel){
		super(model, color);
		this.channel = channel;
		System.out.println("DmbPhone(model,color,channel) ������ ȣ���");
	}
	
	public void method(){
		model = "��8";		// �θ� �ʵ�� �޼ҵ� ���� ���� �׳� ��� ����.
		powerOn();
	}
	
	public void changeChannel(int ch){
		channel = ch;
		
	}
	
	public void dmb_powerOn(){		// �ΰ������� ��� �߰�
		System.out.println("DMB ������ �մϴ�");
	}
	
	public void dmb_powerOff(){
		System.out.println("DMB ������ ���ϴ�");
	}
}
