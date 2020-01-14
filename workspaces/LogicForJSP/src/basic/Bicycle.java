package basic;

public class Bicycle {
	int cadence = 0;	//���Ƚ��
	int speed = 0;
	int gear = 1;
	int increment = 0;
	int decrement = 0;
	
	Bicycle(int cadence, int speed, int gear){
		this.cadence = cadence;
		this.speed = speed;
		this.gear = gear;
	}
	
	void changecadence(int newValue) {	//���Ƚ������
		cadence=newValue;
	}
	
	void changeGear(int newValue){	//����
		gear=newValue;
	}
	
	void speedUp(int increment) {	//���¸�ŭ �߰� �ӵ� ����
		speed+=increment;
	}
	
	void applyBreaker(int decrement) { //���� ��ŭ �߰� �ӵ� ����
		speed-=decrement;
	}
	
	void printStates(){	//���� ���ȸ���� �ӵ� �ܼ����� �ֿܼ� ���.
		System.out.printf("cadence : %d", cadence);
		System.out.printf("\tspeed : %d",speed);
		System.out.printf("\tgear : %d\n",gear);
	}
}
