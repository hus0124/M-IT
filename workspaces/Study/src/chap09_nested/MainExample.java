package chap09_nested;

public class MainExample {

	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
//		oc.thread1.start();
//		oc.method3("http://www.naver.com");
//		oc.method2();
		
		OuterClass.ServerThread thread = new OuterClass.ServerThread();	// ���� Ŭ���� �̸����� ��ü ����
		thread.start();
		
		//�ν��Ͻ� ��� Ŭ����
		OuterClass.ComThread thread2 = oc.new ComThread();	// �׳� new�� �ƴϰ� oc��� ��ü ���ؼ� ����. oc.new
		thread2.start();
	}

}
