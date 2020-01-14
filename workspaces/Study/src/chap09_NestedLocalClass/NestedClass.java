package chap09_NestedLocalClass;
//��ø Ŭ�������� �ٱ� Ŭ���� ���� ���.
// ���� ��ø�� Ŭ������ ���� �ʵ峪 �޼ҵ� �̸��� ���ƹ����� ��� ���� ���� �ϴ°�?
// ���� �̸� �ٸ��� �׳� ���� ����.
public class NestedClass {

	String field = "Outter field";
	void method(){
		System.out.println("Outter method");
	}
	
	class Nested{
		String field = "Nested field";
		void method(){
			System.out.println("Nested method");
		}
	}
	
	void print(){
		System.out.println(this.field);				// ���� inner Ŭ���� ������ �׳� this
		this.method();
		System.out.println(NestedClass.this.field);	// �ٱ��� outter Ŭ���� ������ outter Ŭ�����̸�.this
		NestedClass.this.method();
	}
}
