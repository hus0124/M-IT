package chap09_nested;

public class OuterClass {
	// Ŭ���� ��� : �ʵ�, ������, �޼ҵ�
	int num;				//�ʵ�
	ComThread thread1 = new ComThread();
	
	public OuterClass(){}	//������	
	
	public void method(ComThread thread){
		thread.start();						//������ �����ϸ� run() �����.
	}
	
	public void method2(){
		ComThread thread = new ComThread();
		thread.start();
	}
	
	public void method3(String url){
		ComThread thread = new ComThread();
		method(thread);
	}
	//�ν��Ͻ� ��� Ŭ����. ���� ���� ��. : ��ø Ŭ���� 
	public class ComThread extends Thread {
		@Override
		public void run(){
		//����κ�
			for(int i = 0; i < 10; i++){
				System.out.println("count: "+ i);
				try {
					Thread.sleep(1000);					//1�ʵ��� ����
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		}
	}
	//���� ��� Ŭ����. �ٷ� ���� ����.
	public static class ServerThread extends Thread{
		@Override
		public void run() {
			for(int i = 0; i < 5; i++){
				System.out.println("������ �����: " + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
