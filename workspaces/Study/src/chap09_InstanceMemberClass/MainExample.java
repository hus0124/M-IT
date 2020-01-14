package chap09_InstanceMemberClass;

public class MainExample {

	public static void main(String[] args) {
		OuterClass outer = new OuterClass();	// �ٱ��� Ŭ������ ��ü ����. �̰� ���� �ʿ�. �̰� ���� ���� Ŭ����, �ν��Ͻ� ��� Ŭ������ ����.
		// InnerClass ���ʿ� �ִ� Ŭ����. �� �ν��Ͻ� ��� Ŭ����. ��ü ���� �� ���
		
		OuterClass.InnerClass instanceClass = new OuterClass.InnerClass();
		instanceClass = outer.new InnerClass();	// �ν��Ͻ� ��� Ŭ���� �����ϰ� outer �̿�.
		instanceClass.num = 10;
		instanceClass.method1();
		
		// ���� Ŭ����
				OuterClass.StaticInnerClass staticClass = new OuterClass.StaticInnerClass();
				staticClass.num = 20;	// ��ü �� ������ ����
				staticClass.snum = 3;	// �ٶ����� ������� �ƴ� : ��ü �Ѱ����� �������� �ʰ�
										// ��ü�� �Ѱ��� ���� (static : ����)
				OuterClass.StaticInnerClass.snum = 30;	// ����(����)�ʵ带 �����
				staticClass.method1();
				OuterClass.StaticInnerClass.method2();	// ���� �޼ҵ�
				OuterClass.StaticInnerClass.num = 30;	// �ν��Ͻ� �ʵ�� Ŭ���� �̸��� ����Ͽ� ���� �Ұ�
										// ��ü ������ ���������� �����ؾ�
		
		
	}

}
