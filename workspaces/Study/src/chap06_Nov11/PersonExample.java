package chap06_Nov11;

public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		System.out.println("Ű : " + p1.height);	// Person Ŭ�������� �ʱ�ȭ����. 10.0
		System.out.println("�̸� : " + p1.name);	// Person Ŭ�������� �ʱ�ȭ����. null
		
		// height = 20.0 �̷��Դ� �� �ٲ�
		p1.height = 20.0;
		System.out.println("Ű : " + p1.height);	// ���� ��ü p1 ���� �ٲ� �� ������ ���� height�� �� �ǵ帲.

	}

}
