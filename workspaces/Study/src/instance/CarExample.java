package instance;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car.MaxSeatNum = 6;			// ���� �޼ҵ�, ���� �ʵ�. ���뵥����, ��ü ���� ���� ���� ����.
		Car.changeBattery();		// ��ü ���� ���� ���� ����
		
		Car car1 = new Car();
		car1.setSpeed(50);
		car1.speed = 60;
		car1.MaxSeatNum = 30;	//��ü ���� �ƴ� static way�� �����϶�� �޽����� �߰� �ִ�.
		
		System.out.println("���� �ӵ�: " + car1.getSpeed());
		
		Common.maxMember = 20;

	}

}
