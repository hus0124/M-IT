package chap06_Nov11;

public class MyClass {
// 클래스의 구성 멤버
// 1. 필드
	
	int field1;
	String field2;
	
// 2. 생성자 : 필드 값의 초기화 -> 일종의 메소드 (그러나 반환형이 없다)
	public MyClass() {
		field1 = 10; 	//초기화. 
		field2 = "현대";
		
	}

// 3. 메소드 : 필드 값을 변경시키는 동작, 행위. 	
	
	public void method1() {	// 필드를 사용한 메소드. 꼭 필드 안 써도 된다. 
		System.out.println("field1 = " + field1);
	}
	
	public int method2(int a, int b){	// 필드를 사용하지 않은 메소드.
		return a + b;
	}
	
	// 필드 field1의 값을 매개변수로 전달된 field1으로 설정. 저장. 
	public void setField1(int field1) {	
		//매개변수가 필드명과 같을 경우. 필드(전역변수)와 메소드 또는 생성자의 매개변수가 동일할 때 인스턴스 필드임을 명확히 하기 위해 사용한다. 
		

		this.field1 = field1;	// 일반적으로 같은 이름을 많이 사용하므로 구별하기 위해 this 붙임.
								
	}
	
	public void setField2(String f2) {
		// this.field2 = f2; field2는 같은 이름이 없으니 굳이 this 안 써도 됨.
	}
	
}
