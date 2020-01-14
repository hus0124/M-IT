package singleton;
/*
 * �̱��� singleton : �ϳ��� ���ø����̼� ������ �� �ϳ��� �����Ǵ� ��ü�ǹ�
 * � �����͸� �ѱ������� ������ �ϰ� ���� ��.
 * ��ü�� ������ ����� �������� ����ġ�� �߻��� �� �ִ�. ��ü�� �ϳ��� �����ϰ� ���� �� �̱��� ���.
 * �̸��� �������. ����� ����� �̱����� �����Ѵ�.
 * ��ü�� �� �̻� �� ����� �ϸ鼭 ���ٸ� ������ �Ѵ�.
 *  */
public class SingleTon {
	// 1. private �������� ���� �ʵ� instance�� �����.
	
	private static SingleTon instance = new SingleTon();		// private : �ڽ��� Ŭ���������� ���� ���� 
																
	// 2. ������ private ���. Ŭ���� �ڽ��� Ÿ������ ���� �ʵ� ����.
	
	private SingleTon(){	 
		
	}
	
	// 3. �ܺο��� ��ü�� ���� ������ �ּ� ���� �� �ִ� �޼ҵ� ����
	
	// SingleTon �� ���� ������ instance. instance�� ���� ������ getInstance. 
	// new �� ��ü ��� ������ �ƴ϶� getInstance �ϳ��� ��ü�θ� ���ϵȴ�.
	public static SingleTon getInstance(){
		System.out.println("ȣ���");
		return instance;
	}
	
	int data[] = new int[10];
	
	
}
