package chap06_12Nov;

public class Car {
	//�ʵ�
	int speed;
	int seatNum;
	String color;
	int gas;
	//������
	public Car() {}
	public Car(String color){
		this.color = color;
	}
	//�޼ҵ� : ��ȯ��, �Ű�����, 
	public void speedUp(int amount){
		speed += amount;
	}
	
	public void setSpeed(int speed){
		this.speed = speed;
	}

	public int getSpeed(){
		return speed;
	}
	
	public void turnLeft(){
		System.out.println("��ȸ���մϴ�.");
	}
	
	public void stop(){
		System.out.println("�����մϴ�.");
	}
	
	public void gas(int gas){
		this.gas = gas;
	}
	
	public void drive(){
		gas--;
	}
	
	public int getGas(){
		return gas;
	}
}
