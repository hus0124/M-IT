package chap07_method_override;

public class AirplaneExample {

	public static void main(String[] args) {
		SuperAirplane ssp = new SuperAirplane();
		
		ssp.setMode(1);
		ssp.fly();
		ssp.setMode(2);
		ssp.fly();
		
		// 메소드 오버라이딩 : 자식이 재정의한 메소드가 호출됨. 부모 메소드는 숨겨지는 효과 발생.
		
	}

}
