package chap06_Review;

public class MainExample {

	public static void main(String[] args) {
		// �۵��ϴ� ���� Ŭ���� �ϳ�. �� �� �ټ��� Ŭ���� ����.
		
		Car mycar = new Car();	//mycar�� ���������̴�. 
		// mycar�� ���� heap ������ ��ü Car�� �����Ѵ�.
		System.out.println("�ӵ�: " + mycar.speed);
		
		mycar.company = "���";	//��������.�ʵ� �� ���ٰ���
		mycar.speedUp(60);	//��������.�޼ҵ�
		System.out.println("�ӵ�: " + mycar.speed);
		
		Car car2 = new Car("����");
		Car car3 = new Car("BMW", "520d");
		
		

	}

	
}
