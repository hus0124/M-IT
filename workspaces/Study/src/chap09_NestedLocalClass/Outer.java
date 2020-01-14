package chap09_NestedLocalClass;

public class Outer {
	//필드, 생성자, 메소드
	public void method(final int arg, int arg2){
		final int localVar = 10;	// 로컬 변수
		int localVar2 = 20;
		arg = 20; // 파이널이라 수정 불가. 파이널이라 로컬 클래스에서 사용 가능.
		localVar = 30;	//파이널이라 수정 불가.
		arg2 = 50;
		localVar2 = 100;	// 파이널 아닌 것들은 수정됨.
		
		//로컬 클래스. 메소드 안의 클래스. 메소드가 실행되어야 사용되는 클래스.
		class InnerClass {
			int localMethod(){
				//메소드 안의 매개변수, 로컬변수가 로컬 클래스에서 사용될 때 제한이 있다. 
				int result = arg + localVar;	// 자바7 이전에서는 로컬 클래스가 메소드 로컬변수를 쓰려면 final 선언 필요.
				return result;					
			}
					
		}
	}
}
