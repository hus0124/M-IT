package chap07_argument_15Nov;

public class VehicleExample {
// 매개변수가 클래스 타입일 경우
	public static void main(String[] args) {
		Driver driver = new Driver();
		Vehicle vehicle = new Bus();	// Vehicle vehicle 이 자동타입변환 -> new Bus
		
		Bus bus = (Bus)vehicle;		// vehicle 부모 타입을 자식 Bus로 강제타입변환
		bus.run();
		// 부모 Vehicle(필드 메소드) 자식 Bus (필드, 메소드)
		
		driver.drive(new Bus());		// 버스와 택시는 vehicle의 자식 객체.
		driver.drive(new Taxi());		
		// 매개변수에 어떤 자식 객체를 넣어주느냐에 따라서 자식 객체의 run()이 호출됨.

		
	}

}
