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
		
		Calculator ccal = new Calculator();		// method ��Ű���� Calculator Ŭ������ ����Ʈ.
		
		double result = ccal.add(23.4, 14.5);	// �ٸ� Ŭ�������� ȣ���ص� �۵� ����.
		System.out.println(result);
	}
	
	
}
