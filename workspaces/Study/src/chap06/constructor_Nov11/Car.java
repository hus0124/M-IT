package chap06.constructor_Nov11;

public class Car {
// �����ڸ� ������������ -> default �����ڰ� �����ϰ� ��.
	public Car(){}	// default ������. class ǥ�ô� ����. �Ű������� ����.
		// ���೻�� ������ ����. �Ϲ������� ���೻�� ����.
		// default �����ڴ� �������� �ʾƵ� ��.
	
	int speed;
	
	//����Ʈ �ƴ� �ٸ� ������ �����ϸ� default �����ڴ� ������.
	// ������ ����Ʈ ���� ����� ����Ʈ �����ڸ� ����ϴ� ��ü ���� ����.
	public Car(int speed){	// �ʱⰪ���� �����ϰ� ���� ���� �Ű������� �޴´�.
		this.speed = speed;		
	}
	
	int seat;
	
	public Car(int speed, int seat){
		this.speed = speed;
		this.seat = seat;
	}
	
	String model;
	String color;
	
	public Car(String model, String color, int speed){
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
	
	// �Ű����� ������ Ÿ�� ������ ���ƹ����� ������ �� ����. ��Ʈ�� ��Ʈ�� ��Ƽ��
	/*
	public Car(String color, String model, int speed){
		this.model = model;
		this.color = color;
		this.speed = speed;
	}*/
	
	// ������ overloading �����ε�. �Ű������� Ÿ��, ����, ������ �ٸ� ������ ���� �� ����.
	// �پ��� �ʱ�ȭ ��� ����, �Ű����� �ٸ� �����ڸ� ���� �����ϴ�.
	
	public Car(int seat, String color, String model){
		this.model = model;
		this.color = color;
		this.seat = seat;
}
}
