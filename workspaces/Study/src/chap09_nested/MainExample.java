package chap09_nested;

public class MainExample {

	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
//		oc.thread1.start();
//		oc.method3("http://www.naver.com");
//		oc.method2();
		
		OuterClass.ServerThread thread = new OuterClass.ServerThread();	// 정적 클래스 이름으로 객체 생성
		thread.start();
		
		//인스턴스 멤버 클래스
		OuterClass.ComThread thread2 = oc.new ComThread();	// 그냥 new가 아니고 oc라는 객체 통해서 접근. oc.new
		thread2.start();
	}

}
