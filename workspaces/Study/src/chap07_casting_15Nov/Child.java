package chap07_casting_15Nov;

public class Child extends Parent {
	// �θ� ���� �ʵ� pf1, �޼ҵ�, pmethod1(), pmethod2() ��밡��
	// �ڽĸ��� ���� �ʵ� ����
	
	int cf1;
	
	// �θ� �޼ҵ� ������ (�������̵�)
	@Override
	public void pmethod1() {
		System.out.println("pmethod1(������) ȣ���");
	}
	
	// �ڽĸ��� ���� �޼ҵ� ����
	public void cmethod1(){
		System.out.println("cmethod1() ȣ���");
	}

}
