package static_block;

import method.Calculator;

public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car.field1 = 20;
		Car.method();
		
		Car car1 = new Car();
		car1.seatNum = 4;
		car1.setSpeed(60);
		
		Calculator ccal = new Calculator();		// method 패키지의 Calculator 클래스를 임포트.
		
		double result = ccal.add(23.4, 14.5);	// 다른 클래스에서 호출해도 작동 가능.
		System.out.println(result);
	}
	
	
}
