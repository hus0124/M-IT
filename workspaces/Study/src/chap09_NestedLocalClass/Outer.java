package chap09_NestedLocalClass;

public class Outer {
	//�ʵ�, ������, �޼ҵ�
	public void method(final int arg, int arg2){
		final int localVar = 10;	// ���� ����
		int localVar2 = 20;
		arg = 20; // ���̳��̶� ���� �Ұ�. ���̳��̶� ���� Ŭ�������� ��� ����.
		localVar = 30;	//���̳��̶� ���� �Ұ�.
		arg2 = 50;
		localVar2 = 100;	// ���̳� �ƴ� �͵��� ������.
		
		//���� Ŭ����. �޼ҵ� ���� Ŭ����. �޼ҵ尡 ����Ǿ�� ���Ǵ� Ŭ����.
		class InnerClass {
			int localMethod(){
				//�޼ҵ� ���� �Ű�����, ���ú����� ���� Ŭ�������� ���� �� ������ �ִ�. 
				int result = arg + localVar;	// �ڹ�7 ���������� ���� Ŭ������ �޼ҵ� ���ú����� ������ final ���� �ʿ�.
				return result;					
			}
					
		}
	}
}
