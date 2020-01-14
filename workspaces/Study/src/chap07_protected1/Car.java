package chap07_protected1;

public class Car {
	public int f1;
	protected int f2;
	String f3;
	private int f4;

	public Car(){
		System.out.println("Car()");
	}
	
	protected Car(int f1){
		System.out.println("Car(f1)");
	}
	
	Car(String f3){
		System.out.println("Car(f3)");
	}
	
	private Car(int f1, String f3){
		System.out.println("Car(f1, f3)");
	}
	
	
	public void method1(){}
	protected void method2(){}
	void method3(){}
	private void method4(){}
}
