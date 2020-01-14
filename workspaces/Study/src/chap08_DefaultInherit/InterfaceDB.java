package chap08_DefaultInherit;

public interface InterfaceDB {
	void insert();
	void select();
	
	default void update()		// 인터페이스의 디폴트 메소드를 이용하면 다른 곳 많이 수정할 필요가 없다. 구현하는 곳에서 재정의만 해주면 됨.
	{
		System.out.println("up");
	}
}
