package chap07_casting_15Nov;

public class castingExample {

	public static void main(String[] args) {
		Parent parent = new Child();	// �ڵ�Ÿ�Ժ�ȯ
		// �ڽ� ��ü�� �θ�Ÿ�Կ� �����ϴ� ���� �ڵ�Ÿ�Ժ�ȯ.
		
		parent.pf1 = 10;	//pf1�� �θ� ���� �ʵ�
		parent.pmethod1();  // ������ �޼ҵ� �̸��� �ִٸ� �ڽ� �������� ���� ���� ȣ���.
		parent.pmethod2();	// �θ� ������ �޼ҵ�.
				
		Child child1 = new Child();	// �ڽ� ��ü�� �θ� �ʵ忡 ���� �� ��.
		child1.pf1 = 14;
		child1.pmethod2();

		//���� parent.cf1
		//���� parent.cmethod1		// �ڽ� ��ü�� �θ�Ÿ�Կ� �����ϴ� �ڵ�Ÿ�Ժ�ȯ�� �߾ parent �θ�Ÿ���� �ڽ� �ʵ忡 ������ �� ��.
							// �׷��� ���� Ÿ�� ��ȯ �ؼ� ������ �� �ִ�.
		
		Child child = (Child)parent;	//���� Ÿ�� ��ȯ ���� �� ��. ���� parent = new Child(); ���⿡ Child ���� �־ ����.
		child.cf1 = 20;					//�ڽ� Ŭ������ ���� �θ� ��ü�� ���� Ÿ�� ��ȯ�� �����ϴ�.
		child.cmethod1();
		child.pf1 = 11;
		child.pmethod2();
		
		Parent p2 = new Parent();	// ������ ��ü p2�� �θ� Ÿ�� . ó������ �θ� ������ p2 �� Child ������ ����.
		// ���� Child c2 = (Child)p2;	// �θ�κ��� �� p2�� Child ����Ÿ�� ��ȯ�� �� ������.
		//���� c2.cf1 = 20;
	

		// �θ� Ÿ���̶�� ��� �ڽ� Ÿ������ ���� Ÿ�� ��ȯ�� �� �ִ� ���� �ƴϴ�. ���� �ڽ� Ÿ������ Ȯ�� �� ���� Ÿ�� �����ؾ� �Ѵ�.
		// �̰� Ȯ���ϴ� ����� ��ü Ÿ�� Ȯ��(instanceof)
	
		p2 = parent;	// �� ������ parent = new Child(); �� �����߱⿡ ��������.
		
		if(p2 instanceof Child){
			Child c2 = (Child)p2;
			c2.cf1 = 20;
			System.out.println("****");
		}
}
}
