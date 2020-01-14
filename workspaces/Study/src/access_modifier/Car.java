package access_modifier;

public class Car {
	// 필드
	public String str;
	public int field1;	//public, 모든 클래스에서 접근 가능
	protected int field2;	//protected, 다른 패키지의 클래스는 접근 불가. 상속받은 클래스만 접근 가능.
	int field3;	// 제한자 지정 안하면 기본 default, 다른 패키지의 클래스는 접근 불가.
	private int field4;	// 모든 외부 클래스에서 접근 불가.
	// 생성자
	public Car(){System.out.println("public 호출됨");}
	private Car(int value){
		this.field1 = value;
	}
	
	protected Car(String value){
		this.str = value;
		System.out.println("protected 호출됨");
	}
	Car(double d){System.out.println("default 호출됨");}
	
	private Car(int value, String str){
		this.field1 = value;
		System.out.println("private 호출됨");
	}
	
	// 메소드
	public void method1(){System.out.println("method1()");}
	protected void method2(){System.out.println("method2()");}
	void method3(){System.out.println("method3()");}
	private void method4(){System.out.println("method4()");}
	
	

}
