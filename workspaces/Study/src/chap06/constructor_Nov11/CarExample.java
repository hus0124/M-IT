package chap06.constructor_Nov11;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar = new Car();	//객체 생성. 디폴트 생성자를 사용.
		// 초기값 안정한 speed = 0 이 들어간다. 
		System.out.println("mycar 속도 : " + mycar.speed);
		
		Car car1 = new Car(300);
		System.out.println("car1 속도 : " + car1.speed);
		
		Car car2 = new Car(400, 4);
		System.out.println("car2 속도 : " + car2.speed + " car2 시트 : " + car2.seat);

		// Car car3 = new Car(400, "그랜저", "흰색"); 매개변수 순서 지켜야 한다.
		
		Car car3 = new Car("소나타", "블랙", 200);
		System.out.println("car3 종류 : " + car3.model + " car3 색상: " + car3.color + " car3 속도: " + car3.speed);
	}

}
