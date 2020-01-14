package chap07_field_15Nov;

public class CarTireExample {

	public static void main(String[] args) {
		// �ڵ��� ���� ���� Ƚ�� ���� , Ÿ�̾� ������ ���ؼ� ��ũ.
		// �ڵ��� stop -> Ÿ�̾� ��ü -> ��� ����
		
		Car car = new Car();
		for(int i =0; i < 5; i++){
			int problemLocation = car.run();
			switch(problemLocation){
			case 1:
				System.out.println("�տ��� HankookTire�� ��ü");
				car.frontLeftTire = new HankookTire("�տ���", 15);
				break;
			case 2:
				System.out.println("�տ����� KumHoTire�� ��ü");
				car.frontRightTire = new KumHoTire2("�տ�����", 10);
				break;
			case 3:
				System.out.println("�ڿ��� HankookTire�� ��ü");
				car.backLeftTire = new HankookTire("�ڿ���", 12);
				break;
			case 4:
				System.out.println("�ڿ����� KumHoTire�� ��ü");
				car.backRightTire = new KumHoTire2("�ڿ�����", 13);
				break;
			}
			System.out.println("----------------------------");
		}

	}

}
