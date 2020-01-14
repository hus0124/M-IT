package chap06_Review;

public class MainExample {

	public static void main(String[] args) {
		// 작동하는 메인 클래스 하나. 그 외 다수의 클래스 존재.
		
		Car mycar = new Car();	//mycar는 참조변수이다. 
		// mycar를 통해 heap 영역의 객체 Car에 접근한다.
		System.out.println("속도: " + mycar.speed);
		
		mycar.company = "기아";	//참조변수.필드 로 접근가능
		mycar.speedUp(60);	//참조변수.메소드
		System.out.println("속도: " + mycar.speed);
		
		Car car2 = new Car("현대");
		Car car3 = new Car("BMW", "520d");
		
		

	}

	
}
