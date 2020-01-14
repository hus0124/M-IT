package chap08;

public class Bclass extends Aclass {
	// method1()은 원칙상 인스턴스 메소드이므로 반드시 재정의할 필요는 없으나 일반적으로 해 주는 편이다.
	
	// 추상클래스 Aclass를 상속 받음. Aclass의 추상메소드를 재정의해주어야 함.
	@Override
	public void method2() {
		System.out.println("Bclass method2() 호출됨");

	}
	
	

}
