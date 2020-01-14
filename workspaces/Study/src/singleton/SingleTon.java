package singleton;
/*
 * 싱글톤 singleton : 하나의 애플리케이션 내에서 단 하나만 생성되는 객체의미
 * 어떤 데이터를 한군데서만 관리를 하고 싶을 때.
 * 객체를 여러개 만들면 데이터의 불일치가 발생할 수 있다. 객체를 하나만 유지하고 싶을 때 싱글톤 사용.
 * 이름은 상관없다. 만드는 방법이 싱글톤을 정의한다.
 * 객체는 더 이상 못 만들게 하면서 접근만 가능케 한다.
 *  */
public class SingleTon {
	// 1. private 선언으로 정적 필드 instance를 만든다.
	
	private static SingleTon instance = new SingleTon();		// private : 자신의 클래스에서만 접근 가능 
																
	// 2. 생성자 private 사용. 클래스 자신의 타입으로 정적 필드 선언.
	
	private SingleTon(){	 
		
	}
	
	// 3. 외부에서 객체에 접근 가능한 주소 얻을 수 있는 메소드 제공
	
	// SingleTon 에 접근 가능한 instance. instance에 접근 가능한 getInstance. 
	// new 로 객체 계속 생성이 아니라 getInstance 하나의 객체로만 통일된다.
	public static SingleTon getInstance(){
		System.out.println("호출됨");
		return instance;
	}
	
	int data[] = new int[10];
	
	
}
