package chap09_InstanceMemberClass;

public class OuterClass {
	//Ŭ���� �ȿ� Ŭ����, �ν��Ͻ� ��� Ŭ����. �ٱ� Ŭ������ ��ü�� �����Ǿ�� ���� Ŭ������ ��� ����.
	public class InnerClass {
		// �ʵ�, ������, �޼ҵ�
		// �ʵ� : �ν��Ͻ� �ʵ�, ���� �ʵ�
		int num = 10;
//����	static int snum = 30;  ���. InnerClass �� ��ü ���� ���� �ʿ�. static ��� �� ��.
		
		void method1(){
			
		}
		
//����	static void method2(){}	���� �޼ҵ� ���� ��� �ȵ�, static�� �� �� Ŭ�������� �� ����.
	}


//���� Ŭ���� : ��ü ���� ��� ��� ����
	public static class StaticInnerClass {
		// �ʵ�, ������, �޼ҵ�
		// �ʵ� : �ν��Ͻ� �ʵ�, ���� �ʵ�
		int num = 10;	// �ν��Ͻ� �ʵ�� ������ �����Ϸ��� ��ü �ʿ�.		
		
		static int snum = 30;  // ���� ��� Ŭ������ ��ü ��� static ��� ����
								// OuterClass.StaticInnerClass.snum
		void method1(){
			
		}
		static void method2(){ 	
			
		}
		

	}
}

