package chap08_DefaultInherit;

public class AbstractClass implements AbstractInherit {

	// 원본 인터페이스가 원래 가지고 있던 추상 메소드 재정의 필요 
	@Override
	public void insert() {
		// TODO Auto-generated method stub

	}

	@Override
	public void select() {
		// TODO Auto-generated method stub

	}

	@Override						// 원본을 구현한 인터페이스가 가지고 있던 추상메소드도 재정의
	public void update() {
		// TODO Auto-generated method stub

	}

}
