package chap07_method_override;

public class LaserPrinter extends Printer {
	// 부모 객체의 print() 메소드를 가지고 있음.
	// 자신만의 방식으로 출력을 하고 싶다 → 메소드 오버라이딩(Override, Overriding)
	// 오버라이딩   오버로딩 은 서로 다른 개념.  오버라이딩은 상속 재정의,  오버로딩은 생성자 매개변수 다중설정.
	
	/* @Override
	public void print(String data) {
		// TODO Auto-generated method stub
		super.print(data);				// 오버라이딩 디폴트 상태. 디폴트는 부모의 메소드 그대로인 상태.
	}*/

	@Override
	public void print(String data) {
		System.out.println("레이저로 출력합니다(" + data + ")");
		super.print(data);
	}
}
