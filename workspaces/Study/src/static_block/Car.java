package static_block;

public class Car {
	// ���� �ʵ� 
	static int field1 = 20; 	// ���� ����� �Բ� �ʱ�ȭ ���� 
	static int field2;			// ���� �ϰ� �ʱ�ȭ �� ��.
	
	// ���� ��. �� �Ⱦ��̴� ���.
	static {			// �� : �߰�ȣ '{' �� �����ؼ� '}'�� ������ �κ�.  static{ } = ���� ���̴�. 
		field2 = 30;	// ���� �ʵ常 �ʱ�ȭ ���� ����. �ν��Ͻ� �ʵ忡�� ��ü ������ ���� ���⼭ ��� �Ұ�.
		// seatNum = 50; �Ұ���
	}
	
	// �ν��Ͻ� �ʵ� : ��ü ���� �� �޸𸮿� ������� �Ҵ� �� �ڿ� ���Ǵ� �ʵ�.
	int speed;
	int seatNum; 
	int TireNum;
	{TireNum = 4;}  // �߰�ȣ ���� ����� ����. ��ü�� ������ �� �� �̿� ����. �� �Ⱦ���.
	
	// ���� �޼ҵ�
	
	static void method(){
		// ���� �޼ҵ忡�� ����� �� �ִ� �ʵ� : ���� �ʵ常 ��� ����
		field1 = 30;
		// seatNum = 4; ���� �ʵ� �ƴϸ� �Ұ�.
		// setSpeed(5); �ν��Ͻ� �޼ҵ�� ȣ�� �Ұ�
		method2();	// ���� �޼ҵ�� ȣ�� ����.
	}
	
	public void setSpeed(int speed){
		this.speed = speed;
	}
	
	static void method2(){
		System.out.println("���� �޼ҵ� 2�� �Ҹ�");
	}
	
	

}
