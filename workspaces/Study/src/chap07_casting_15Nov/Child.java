package chap07_casting_15Nov;

public class Child extends Parent {
	// 부모가 가진 필드 pf1, 메소드, pmethod1(), pmethod2() 사용가능
	// 자식만의 고유 필드 선언
	
	int cf1;
	
	// 부모 메소드 재정의 (오버라이딩)
	@Override
	public void pmethod1() {
		System.out.println("pmethod1(재정의) 호출됨");
	}
	
	// 자식만의 고유 메소드 정의
	public void cmethod1(){
		System.out.println("cmethod1() 호출됨");
	}

}
