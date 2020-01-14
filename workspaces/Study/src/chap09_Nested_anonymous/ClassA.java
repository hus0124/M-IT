package chap09_Nested_anonymous;

public class ClassA {	// Outter 클래스
	
	class Comthread extends Thread{
		
	}// 익명 객체는 이와 같이 클래스 정의를 하지 않고 사용
		
	// Thread : 부모객체
	Thread thread = new Thread(){ //객체의 정의 부분. ㅂ
		//자체 필드, 자체 메소드 : 클래스 영역 안에서만 사용할 목적.
		int field1;
		
		int add(int a, int b){
			return a+b;
		}
	
		@Override		// 인터페이스에 선언된 추상 메소드의 실체 메소드 선언
		public void run(){
			int sum = add(10,20);
			System.out.println("서버와 통신합니다");}	// Thread 라는 부모 클래스의 재정의
	};

	void method3(){
		//thread : 부모타입의 참조 변수 -> 접근할 수 있는 범위는 부모가 정의한 필드.
		// 익명 객체라서 강제타입변환도 안 됨 (클래스 이름이 없음)
		thread.field1 = 30;	// 자식이 정의한 필드라서 접근 불가.
		thread.add(10,20);	// 자식이 정의한 메소드라서 접근 불가.
		thread.start();   // 스레드를 시작 -> run()메소드가 호출됨
	}
}
