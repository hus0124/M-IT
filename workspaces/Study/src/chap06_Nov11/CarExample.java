package chap06_Nov11;

public class CarExample {

	// ����� Ŭ���� : ���� main() �޼ҵ尡 �ִ� Ŭ����. ������ �������� ���� Ŭ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar = new Car();		// ��ü �� ���� ����.
		Tire myTire = new Tire();	// default�̱� �ص� ���� ��Ű���̸� ���� ����.
		Car hongCar = new Car();	// new ��� �����ڴ� ��ü ���� ����. heap ������ �޸� �Ҵ� ����.
		
		// Ŭ�������� : myCar, myTire, hongTire (���� Ÿ�� �����̴� : �� ������ �ִ� ��ü�� �ּҸ� ������ ����) 
		// �ּҸ� ���� �ִ� Ŭ���� ������ ���� ������, ��ü ������ �� ������. Ŭ���� ���� ���ؼ��� ���� ����.
		
		Car car1 = null;	// ���� �ϴ� ��ü ���� �� null�� �ϴ� �ʱ�ȭ.
		car1 = new Car();	// �� �� �޸� �Ҵ�Ǹ鼭 ���� �ʱ�ȭ.
		
		// 1���� ���ø����̼� = 1���� ����Ŭ���� + n���� ���̺귯�� Ŭ����
		// ���̺귯�� Ŭ���� : ��ü ���� �� ��. �ٸ� Ŭ�������� �̿��� �������� ���� Ŭ����.
		

	}

}