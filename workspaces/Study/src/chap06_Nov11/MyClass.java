package chap06_Nov11;

public class MyClass {
// Ŭ������ ���� ���
// 1. �ʵ�
	
	int field1;
	String field2;
	
// 2. ������ : �ʵ� ���� �ʱ�ȭ -> ������ �޼ҵ� (�׷��� ��ȯ���� ����)
	public MyClass() {
		field1 = 10; 	//�ʱ�ȭ. 
		field2 = "����";
		
	}

// 3. �޼ҵ� : �ʵ� ���� �����Ű�� ����, ����. 	
	
	public void method1() {	// �ʵ带 ����� �޼ҵ�. �� �ʵ� �� �ᵵ �ȴ�. 
		System.out.println("field1 = " + field1);
	}
	
	public int method2(int a, int b){	// �ʵ带 ������� ���� �޼ҵ�.
		return a + b;
	}
	
	// �ʵ� field1�� ���� �Ű������� ���޵� field1���� ����. ����. 
	public void setField1(int field1) {	
		//�Ű������� �ʵ��� ���� ���. �ʵ�(��������)�� �޼ҵ� �Ǵ� �������� �Ű������� ������ �� �ν��Ͻ� �ʵ����� ��Ȯ�� �ϱ� ���� ����Ѵ�. 
		

		this.field1 = field1;	// �Ϲ������� ���� �̸��� ���� ����ϹǷ� �����ϱ� ���� this ����.
								
	}
	
	public void setField2(String f2) {
		// this.field2 = f2; field2�� ���� �̸��� ������ ���� this �� �ᵵ ��.
	}
	
}
