package chap09_nested;

public class OuterClass {
	// 클래스 멤버 : 필드, 생성자, 메소드
	int num;				//필드
	ComThread thread1 = new ComThread();
	
	public OuterClass(){}	//생성자	
	
	public void method(ComThread thread){
		thread.start();						//스레드 구동하면 run() 실행됨.
	}
	
	public void method2(){
		ComThread thread = new ComThread();
		thread.start();
	}
	
	public void method3(String url){
		ComThread thread = new ComThread();
		method(thread);
	}
	//인스턴스 멤버 클래스. 아직 실행 전. : 중첩 클래스 
	public class ComThread extends Thread {
		@Override
		public void run(){
		//실행부분
			for(int i = 0; i < 10; i++){
				System.out.println("count: "+ i);
				try {
					Thread.sleep(1000);					//1초동안 슬립
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		}
	}
	//정적 멤버 클래스. 바로 접근 가능.
	public static class ServerThread extends Thread{
		@Override
		public void run() {
			for(int i = 0; i < 5; i++){
				System.out.println("서버와 통신중: " + i);
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
