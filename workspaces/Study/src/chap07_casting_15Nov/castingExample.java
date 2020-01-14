package chap07_casting_15Nov;

public class castingExample {

	public static void main(String[] args) {
		Parent parent = new Child();	// 자동타입변환
		// 자식 객체를 부모타입에 대입하는 것이 자동타입변환.
		
		parent.pf1 = 10;	//pf1은 부모 정의 필드
		parent.pmethod1();  // 동일한 메소드 이름이 있다면 자식 재정의한 것이 먼저 호출됨.
		parent.pmethod2();	// 부모가 정의한 메소드.
				
		Child child1 = new Child();	// 자식 객체는 부모 필드에 접근 잘 됨.
		child1.pf1 = 14;
		child1.pmethod2();

		//에러 parent.cf1
		//에러 parent.cmethod1		// 자식 객체를 부모타입에 대입하는 자동타입변환을 했어도 parent 부모타입은 자식 필드에 접근이 안 됨.
							// 그래서 강제 타입 변환 해서 접근할 수 있다.
		
		Child child = (Child)parent;	//강제 타입 변환 접근 잘 됨. 원래 parent = new Child(); 였기에 Child 정보 있어서 가능.
		child.cf1 = 20;					//자식 클래스가 만든 부모 객체는 강제 타입 변환이 가능하다.
		child.cmethod1();
		child.pf1 = 11;
		child.pmethod2();
		
		Parent p2 = new Parent();	// 생성한 객체 p2는 부모 타입 . 처음부터 부모가 생성한 p2 는 Child 정보가 없다.
		// 에러 Child c2 = (Child)p2;	// 부모로부터 온 p2는 Child 강제타입 변환이 안 먹힌다.
		//에러 c2.cf1 = 20;
	

		// 부모 타입이라고 모두 자식 타입으로 강제 타입 변환할 수 있는 것이 아니다. 먼저 자식 타입인지 확인 후 강제 타입 실행해야 한다.
		// 이걸 확인하는 방법이 객체 타입 확인(instanceof)
	
		p2 = parent;	// 맨 위에서 parent = new Child(); 로 생성했기에 가능해짐.
		
		if(p2 instanceof Child){
			Child c2 = (Child)p2;
			c2.cf1 = 20;
			System.out.println("****");
		}
}
}
