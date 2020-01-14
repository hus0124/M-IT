package chap06_Review;

public class Car {
	// Ŭ���� ���� ��� : �ʵ�, ������, �޼ҵ�
	// �ʵ� : ����, �⺻ ����, ������ ���� ������ �ۿ��Ͽ� ��ǰ ����.
	
	int speed;
	int seatNum;
	String owner;
	String company;
	String model;
	
	public Car(){System.out.println("Car()");}
	
	// ������ : ��ü ����� ���� ���. ���� ���� ���ϸ� �⺻ ������ ����� ����.
	// public car{} : default �������̴�.���๮ ���� ��ȯ�� ����.�ּҸ� ��ȯ. 
	// ������ ���� : ��ü ����(�޸�Ȯ��) �ʵ尪 �ʱ�ȭ 

	public Car(String company, String m){
		this.company = company;	//�Ű������� �ʵ� ���� ���� this���
		model = m; //this ��� ���� ���� �ȴ�.
		System.out.println("Car(String company, String m)");
	}
	
	//������ �����ε� : �Ű����� Ÿ�� ���� ������ �ٸ� ������ ������ ����
	
	public Car(int speed, String model){
		this.speed = speed;
		this.model = model;
		System.out.println("Car(int speed, String model)");
	}
	
	public Car(String company, String model, int speed){
		this.company = company;
		this.model = model;
		this.speed = speed;
		System.out.println("Car(String company, String model, int speed)");
	}
	
	public Car(String company){
		this(company, "�ҳ�Ÿ");
		System.out.println("Car(String company)");
	}
	
	public void speedUp(int speed){
		this.speed = speed;
	}
}

