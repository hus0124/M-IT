package chap09_Nested_anonymous;

public class ClassA {	// Outter Ŭ����
	
	class Comthread extends Thread{
		
	}// �͸� ��ü�� �̿� ���� Ŭ���� ���Ǹ� ���� �ʰ� ���
		
	// Thread : �θ�ü
	Thread thread = new Thread(){ //��ü�� ���� �κ�. ��
		//��ü �ʵ�, ��ü �޼ҵ� : Ŭ���� ���� �ȿ����� ����� ����.
		int field1;
		
		int add(int a, int b){
			return a+b;
		}
	
		@Override		// �������̽��� ����� �߻� �޼ҵ��� ��ü �޼ҵ� ����
		public void run(){
			int sum = add(10,20);
			System.out.println("������ ����մϴ�");}	// Thread ��� �θ� Ŭ������ ������
	};

	void method3(){
		//thread : �θ�Ÿ���� ���� ���� -> ������ �� �ִ� ������ �θ� ������ �ʵ�.
		// �͸� ��ü�� ����Ÿ�Ժ�ȯ�� �� �� (Ŭ���� �̸��� ����)
		thread.field1 = 30;	// �ڽ��� ������ �ʵ�� ���� �Ұ�.
		thread.add(10,20);	// �ڽ��� ������ �޼ҵ�� ���� �Ұ�.
		thread.start();   // �����带 ���� -> run()�޼ҵ尡 ȣ���
	}
}
