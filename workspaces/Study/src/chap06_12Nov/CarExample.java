package chap06_12Nov;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car();
		car1.gas(40);
		for(int i = 0; i <20; i++){
			car1.drive();
		}
		car1.speedUp(20);
		car1.speedUp(-10);
		car1.stop();
		
		System.out.println("남은 가스양: " + car1.getGas());

	}

}
