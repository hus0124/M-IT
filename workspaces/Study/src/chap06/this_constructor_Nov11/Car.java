package chap06.this_constructor_Nov11;

public class Car {
	// �ʵ��
	
	String model;
	String color;
	int maxSpeed;
	
	
	
	public Car(){
		
	}
	
	//������1
	public Car(String model){
		// this(model, "White");  �ٸ� ������2 Car �� ȣ��
		this.model = model;
		this.color = "White";
		this.maxSpeed = 200;
	}
	
	//������2
	public Car(String model, String color){
		this(model, color, 250);
		
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = 250;
	}

	//������3
	public Car(String model, String color, int speed){
		// this(model, color, speed)
		this.model = model;  //this : Car(Ŭ����)
		this.color = color;
		this.maxSpeed = speed;
	}
}

class Airplane{ //���� ���� default ��Ű�� �������� ���� ����.
}


