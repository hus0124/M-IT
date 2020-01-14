package chap08_DefaultInherit;

public interface ChildDB extends InterfaceDB {
	// default 메소드를 가진 인터페이스를 상속하는 경우
		// 경우 1 : 부모 인터페이스에서 정의된 default 메소드를 그대로 사용
		// 경우 2 : 부모 인터페이스에서 정의된 default 메소드를 재정의하여 사용
		// 경우 3 : default 메소드를 추상메소드롤 변경하여 사용
	
}
