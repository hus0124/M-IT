package chap07_method_override;

public class AirplaneExample {

	public static void main(String[] args) {
		SuperAirplane ssp = new SuperAirplane();
		
		ssp.setMode(1);
		ssp.fly();
		ssp.setMode(2);
		ssp.fly();
		
		// �޼ҵ� �������̵� : �ڽ��� �������� �޼ҵ尡 ȣ���. �θ� �޼ҵ�� �������� ȿ�� �߻�.
		
	}

}
