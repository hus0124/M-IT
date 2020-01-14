package chap08;

public abstract class Cclass extends Aclass {

	
//	public void method2();
// 추상 클래스 Aclass 를 상속받았으니 재정의 해야 하는데 method2()를 재정의 안 하면 추상 메소드가 된다.
// 클래스 내 추상 메소드를 가지게 되면 클래스도 추상 클래스로 바뀌어야 한다.
// 결과적으로 추상 클래스를 상속 받는 추상 클래스가 생김.	
	
	public abstract void method2();
}
