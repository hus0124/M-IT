package instance;

public class Car {
	//�ʵ�
	int speed;
	String model;
	String color;
	
	// ���� �ʵ� : ���뵥���� -> Ŭ���� Car�� �������� ���Ǵ� ������ -> �ϳ��� ���� 
	public static int MaxSeatNum;
	
	
	//������
	public Car(){}
	
	// �޼ҵ� : �ν��Ͻ� �޼ҵ�
	public void setSpeed(int s){
		speed = s;
	}
	
	public int getSpeed(){
		return speed;
	}

	//���� �޼ҵ� : ��ü ���� ���� ������. Ŭ���� �̸�, �޼ҵ� �̸����� �ٷ� ����. Car.changeBattery() 
	public static void changeBattery(){
		System.out.println("���͸��� ��ȯ�մϴ�");
	}
	
	
}
