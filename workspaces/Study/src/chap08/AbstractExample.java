package chap08;

public class AbstractExample {

	public static void main(String[] args) {
		
//		���� �۵��ȵ� Aclass a = new Aclass(); Aclass �� �߻�Ŭ������ ��Ӹ� �ǰ� ��ü ������ �Ұ���.
		
		Bclass b = new Bclass();	// Bclass�� �߻�Ŭ������ ��������Ƿ� ��ü ���� ����.
		
		b.method1();
		b.method2();
		
//		Cclass c = new Cclass(); ����, �۵��ȵ�. Cclass�� �߻�Ŭ����.

		Dclass d = new Dclass();	// Dclass�� Aclass�� ��� ���� �߻� Ŭ���� Cclass�� ��� ����.
		d.method1();
		d.method2();
	}

}
