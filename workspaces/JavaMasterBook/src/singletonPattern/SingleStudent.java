package singletonPattern;

public class SingleStudent {
	private static SingleStudent instance = new SingleStudent(); // ��������, ����ƽ�� ��ü ���� �ν��Ͻ�ȭ.
	
	public static SingleStudent getInstance(){
		return instance;		// ��ü�� ���Ͻ����ִ� �Լ� . ����ƽ ��ü�� ���Ͻ�Ű�Ƿ� �Լ��� ����ƽ.
	}
}
