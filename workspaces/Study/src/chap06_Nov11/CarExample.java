package chap06_Nov11;

public class CarExample {

	// 실행용 클래스 : 메인 main() 메소드가 있는 클래스. 실행할 목적으로 만든 클래스
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar = new Car();		// 객체 한 개를 생성.
		Tire myTire = new Tire();	// default이긴 해도 같은 패키지이면 접근 가능.
		Car hongCar = new Car();	// new 라는 연산자는 객체 생성 역할. heap 영역에 메모리 할당 가능.
		
		// 클래스변수 : myCar, myTire, hongTire (참조 타입 변수이다 : 힙 영역에 있는 객체의 주소를 가지고 있음) 
		// 주소를 갖고 있는 클래스 변수는 스택 영역에, 객체 내용은 힙 영역에. 클래스 변수 통해서만 접근 가능.
		
		Car car1 = null;	// 참조 하는 객체 없을 때 null로 일단 초기화.
		car1 = new Car();	// 이 때 메모리 할당되면서 새로 초기화.
		
		// 1개의 애플리케이션 = 1개의 실행클래스 + n개의 라이브러리 클래스
		// 라이브러리 클래스 : 자체 실행 안 됨. 다른 클래스에서 이용할 목적으로 만든 클래스.
		

	}

}
