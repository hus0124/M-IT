package chap07_argument_15Nov;

public class VehicleExample {
// �Ű������� Ŭ���� Ÿ���� ���
	public static void main(String[] args) {
		Driver driver = new Driver();
		Vehicle vehicle = new Bus();	// Vehicle vehicle �� �ڵ�Ÿ�Ժ�ȯ -> new Bus
		
		Bus bus = (Bus)vehicle;		// vehicle �θ� Ÿ���� �ڽ� Bus�� ����Ÿ�Ժ�ȯ
		bus.run();
		// �θ� Vehicle(�ʵ� �޼ҵ�) �ڽ� Bus (�ʵ�, �޼ҵ�)
		
		driver.drive(new Bus());		// ������ �ýô� vehicle�� �ڽ� ��ü.
		driver.drive(new Taxi());		
		// �Ű������� � �ڽ� ��ü�� �־��ִ��Ŀ� ���� �ڽ� ��ü�� run()�� ȣ���.

		
	}

}
