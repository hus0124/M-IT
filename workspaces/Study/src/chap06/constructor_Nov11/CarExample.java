package chap06.constructor_Nov11;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar = new Car();	//��ü ����. ����Ʈ �����ڸ� ���.
		// �ʱⰪ ������ speed = 0 �� ����. 
		System.out.println("mycar �ӵ� : " + mycar.speed);
		
		Car car1 = new Car(300);
		System.out.println("car1 �ӵ� : " + car1.speed);
		
		Car car2 = new Car(400, 4);
		System.out.println("car2 �ӵ� : " + car2.speed + " car2 ��Ʈ : " + car2.seat);

		// Car car3 = new Car(400, "�׷���", "���"); �Ű����� ���� ���Ѿ� �Ѵ�.
		
		Car car3 = new Car("�ҳ�Ÿ", "��", 200);
		System.out.println("car3 ���� : " + car3.model + " car3 ����: " + car3.color + " car3 �ӵ�: " + car3.speed);
	}

}
