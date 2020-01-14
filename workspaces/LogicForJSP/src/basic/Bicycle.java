package basic;

public class Bicycle {
	int cadence = 0;	//페달횟수
	int speed = 0;
	int gear = 1;
	int increment = 0;
	int decrement = 0;
	
	Bicycle(int cadence, int speed, int gear){
		this.cadence = cadence;
		this.speed = speed;
		this.gear = gear;
	}
	
	void changecadence(int newValue) {	//페달횟수변경
		cadence=newValue;
	}
	
	void changeGear(int newValue){	//기어변경
		gear=newValue;
	}
	
	void speedUp(int increment) {	//들어온만큼 추가 속도 증가
		speed+=increment;
	}
	
	void applyBreaker(int decrement) { //들어온 만큼 추가 속도 감소
		speed-=decrement;
	}
	
	void printStates(){	//현재 페달회수와 속도 단수값을 콘솔에 출력.
		System.out.printf("cadence : %d", cadence);
		System.out.printf("\tspeed : %d",speed);
		System.out.printf("\tgear : %d\n",gear);
	}
}
