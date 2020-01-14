package chap09_NestedLocalClass;
//중첩 클래스에서 바깥 클래스 참조 얻기.
// 만일 중첩된 클래스가 서로 필드나 메소드 이름이 같아버리면 어떻게 참조 접근 하는가?
// 물론 이름 다르면 그냥 각자 접근.
public class NestedClass {

	String field = "Outter field";
	void method(){
		System.out.println("Outter method");
	}
	
	class Nested{
		String field = "Nested field";
		void method(){
			System.out.println("Nested method");
		}
	}
	
	void print(){
		System.out.println(this.field);				// 안쪽 inner 클래스 참조는 그냥 this
		this.method();
		System.out.println(NestedClass.this.field);	// 바깥쪽 outter 클래스 참조는 outter 클래스이름.this
		NestedClass.this.method();
	}
}
