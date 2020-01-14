package chap09_InstanceMemberClass;

public class MainExample {

	public static void main(String[] args) {
		OuterClass outer = new OuterClass();	// 바깥쪽 클래스로 객체 생성. 이게 먼저 필요. 이걸 통해 안쪽 클래스, 인스턴스 멤버 클래스에 접근.
		// InnerClass 안쪽에 있는 클래스. 즉 인스턴스 멤버 클래스. 객체 생성 후 사용
		
		OuterClass.InnerClass instanceClass = new OuterClass.InnerClass();
		instanceClass = outer.new InnerClass();	// 인스턴스 멤버 클래스 생성하고 outer 이용.
		instanceClass.num = 10;
		instanceClass.method1();
		
		// 정적 클래스
				OuterClass.StaticInnerClass staticClass = new OuterClass.StaticInnerClass();
				staticClass.num = 20;	// 객체 한 개마다 존재
				staticClass.snum = 3;	// 바람직한 사용방법이 아님 : 객체 한개마다 존재하지 않고
										// 객체에 한개만 존재 (static : 공용)
				OuterClass.StaticInnerClass.snum = 30;	// 정적(공용)필드를 사용방법
				staticClass.method1();
				OuterClass.StaticInnerClass.method2();	// 정적 메소드
				OuterClass.StaticInnerClass.num = 30;	// 인스턴스 필드는 클래스 이름을 사용하여 접근 불가
										// 객체 생성된 참조변수로 접근해야
		
		
	}

}
