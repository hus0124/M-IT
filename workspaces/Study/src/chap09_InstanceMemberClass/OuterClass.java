package chap09_InstanceMemberClass;

public class OuterClass {
	//클래스 안에 클래스, 인스턴스 멤버 클래스. 바깥 클래스의 객체가 생성되어야 안쪽 클래스도 사용 가능.
	public class InnerClass {
		// 필드, 생성자, 메소드
		// 필드 : 인스턴스 필드, 정적 필드
		int num = 10;
//에러	static int snum = 30;  모순. InnerClass 는 객체 생성 먼저 필요. static 사용 안 됨.
		
		void method1(){
			
		}
		
//에러	static void method2(){}	정적 메소드 역시 사용 안됨, static을 안 쪽 클래스에서 못 쓴다.
	}


//정적 클래스 : 객체 생성 없어도 사용 가능
	public static class StaticInnerClass {
		// 필드, 생성자, 메소드
		// 필드 : 인스턴스 필드, 정적 필드
		int num = 10;	// 인스턴스 필드는 여전히 접근하려면 객체 필요.		
		
		static int snum = 30;  // 정적 멤버 클래스라서 객체 없어도 static 사용 가능
								// OuterClass.StaticInnerClass.snum
		void method1(){
			
		}
		static void method2(){ 	
			
		}
		

	}
}

