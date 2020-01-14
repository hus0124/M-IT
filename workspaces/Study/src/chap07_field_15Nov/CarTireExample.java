package chap07_field_15Nov;

public class CarTireExample {

	public static void main(String[] args) {
		// 자동차 만들어서 일정 횟수 운행 , 타이어 수명이 다해서 펑크.
		// 자동차 stop -> 타이어 교체 -> 계속 운행
		
		Car car = new Car();
		for(int i =0; i < 5; i++){
			int problemLocation = car.run();
			switch(problemLocation){
			case 1:
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞오른쪽 KumHoTire로 교체");
				car.frontRightTire = new KumHoTire2("앞오른쪽", 10);
				break;
			case 3:
				System.out.println("뒤왼쪽 HankookTire로 교체");
				car.backLeftTire = new HankookTire("뒤왼쪽", 12);
				break;
			case 4:
				System.out.println("뒤오른쪽 KumHoTire로 교체");
				car.backRightTire = new KumHoTire2("뒤오른쪽", 13);
				break;
			}
			System.out.println("----------------------------");
		}

	}

}
