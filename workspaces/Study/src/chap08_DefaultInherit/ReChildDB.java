package chap08_DefaultInherit;

public interface ReChildDB extends InterfaceDB {
//재정의
	@Override	
	default void update() {
		System.out.println("UPDOWN rechild호출");
	}
}
